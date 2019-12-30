
package java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.database.DataAccess;
import java.models.User;

public class OrderProcess extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        HttpSession session = request.getSession();
        String email = (String) session.getAttribute("email");
        if(email == null){
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
        
        String foodId = request.getParameter("foodId");
        String noOfOrder = request.getParameter("noOfOrder");
        DataAccess dao = new DataAccess();
        int orderId = dao.getMaxOrderId();
        
        ArrayList<User> userInfo = dao.getUserInfo(email);
        int count = dao.createOrder(orderId+1,Integer.parseInt(foodId),userInfo.get(0).userId,0,Integer.parseInt(noOfOrder));
        
        if(count == 1){
            System.out.println("I am count 1");
                RequestDispatcher rd = request.getRequestDispatcher("makeOrder.jsp");
                rd.forward(request, response);
            }
        else{
            System.out.println("I am count 0");
            RequestDispatcher rd = request.getRequestDispatcher("makeOrder.jsp");
            rd.forward(request, response); 
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

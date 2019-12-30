
package java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.database.DataAccess;

public class CustomerInfo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String customerName = request.getParameter("customerName");
        String tableNo = request.getParameter("tableNo");
        
        DataAccess db = new DataAccess();
        int customerId = db.getMaxCustomerId();
        int count = db.addCustomer(customerId+1,customerName,Integer.parseInt(tableNo));
        
        if(count==1)
        {
            System.out.println("I am count 1");
            HttpSession session = request.getSession();
            session.setAttribute("customerId", customerId);
            RequestDispatcher rd = request.getRequestDispatcher("customerOrder.jsp");
            rd.forward(request, response);
        }
        else
        {
            System.out.println("I am count 0");
            RequestDispatcher rd = request.getRequestDispatcher("customerUI.jsp");
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

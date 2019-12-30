
package java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.database.DataAccess;


public class UpdateFood extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String foodId = request.getParameter("foodId");
        String foodName = request.getParameter("foodName");
        String category = request.getParameter("category");
        String price = request.getParameter("price");
        String description = request.getParameter("description");
        System.out.println("I am on db object call");
        DataAccess db = new DataAccess();
        System.out.println("I am below db object call");
        
        int count = db.updateFood(Integer.parseInt(foodId),foodName,category,Integer.parseInt(price),description);
        
        if(count==1)
        {
            System.out.println("I am count 1");
            RequestDispatcher rd = request.getRequestDispatcher("updateFood.jsp");
            rd.forward(request, response);
        }
        else
        {
            System.out.println("I am count 0");
            RequestDispatcher rd = request.getRequestDispatcher("updateFood.jsp");
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

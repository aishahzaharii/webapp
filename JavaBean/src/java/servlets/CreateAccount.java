
package java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.database.DataAccess;

public class CreateAccount extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String mobileno = request.getParameter("mobileno");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        System.out.println("I am on db object call");
        DataAccess db = new DataAccess();
        System.out.println("I am below db object call");
        int userId = db.getMaxUserId();
        int count = db.createAccount(userId+1,username,email,mobileno,password,address);
        if(count==1)
        {
            System.out.println("I am count 1");
            RequestDispatcher rd = request.getRequestDispatcher("logIn.jsp");
            rd.forward(request, response);
        }
        else
        {
            System.out.println("I am count 0");
            RequestDispatcher rd = request.getRequestDispatcher("createAccount.jsp");
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

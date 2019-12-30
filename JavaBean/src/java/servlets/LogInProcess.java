
package java.servlets;

import java.database.DataAccess;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogInProcess extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        if(email == null){
                RequestDispatcher rd = request.getRequestDispatcher("logIn.jsp");
                rd.forward(request, response);
            }
        String password = request.getParameter("password");
        DataAccess db = new DataAccess();
        boolean exist = db.existUser(email, password);
        if(exist)
        {
          
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            RequestDispatcher rd = request.getRequestDispatcher("userHomePage.jsp");
            rd.forward(request, response);
        }
        else
        {
            RequestDispatcher rd = request.getRequestDispatcher("invalidLogIn.jsp");
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


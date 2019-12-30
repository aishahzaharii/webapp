
package java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.database.DataAccess;

public class AssignOrder extends HttpServlet {

	 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String orderId = request.getParameter("orderId");
	        String employeeId = request.getParameter("employeeId");
	        
	        DataAccess db = new DataAccess();
	        int count = db.assignOrder(Integer.parseInt(orderId),Integer.parseInt(employeeId));
	        
	        if(count==1)
	        {
	            System.out.println("I am count 1");
	            RequestDispatcher rd = request.getRequestDispatcher("assignOrder.jsp");
	            rd.forward(request, response);
	        }
	        else
	        {
	            System.out.println("I am count 0");
	            RequestDispatcher rd = request.getRequestDispatcher("assignOrder.jsp");
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

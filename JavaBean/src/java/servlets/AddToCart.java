
package java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.models.CartItem;

public class AddToCart extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String username = (String) session.getAttribute("username");
        if(username==null)
        {
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.forward(request, response);
        }
        
        ArrayList<CartItem> productList = (ArrayList<CartItem>)session.getAttribute("cart");
        if(productList==null)
                productList = new ArrayList<CartItem>();
        String product = request.getParameter("product");
        String amount = request.getParameter("amount");
        CartItem item = new CartItem(product,amount);
        productList.add(item);
        
        
        session.setAttribute("cart", productList);
        
        RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
        rd.forward(request, response);
        
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

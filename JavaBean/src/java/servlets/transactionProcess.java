
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


public class transactionProcess extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String bankAccountNo = request.getParameter("bankAccountNo");
        String amountRaw = request.getParameter("amount");
        double amount = Double.parseDouble(amountRaw);
        String transactionType = request.getParameter("transactionType");
        if(transactionType.equals("debit")) amount = -1*amount;
        DataAccess dao = new DataAccess();
        Boolean result = dao.processTransaction(bankAccountNo, amount);
        
        HttpSession session = request.getSession();
        session.setAttribute("transactionProcessResult", result);
        
        RequestDispatcher rd = request.getRequestDispatcher("debitCredit.jsp");
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

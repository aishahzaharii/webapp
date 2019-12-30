
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
import java.database.DataAccess;
import java.models.BankTransaction;

public class ShowStatementServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String bankAccountNo = request.getParameter("bankAccountNo");
        DataAccess dao = new DataAccess();
        ArrayList<BankTransaction> transactions = dao.getTransactions(bankAccountNo);
        HttpSession session = request.getSession();
        session.setAttribute("transactions", transactions);

        RequestDispatcher rd = request.getRequestDispatcher("showStatement.jsp");
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

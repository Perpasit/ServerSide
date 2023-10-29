package sit.int202.simple.simpletue;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "MultiplicationServlet" ,value = "/multiplication_table")
public class MultiplicationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String number = req.getParameter("number");
        if (number == null || number.length()==0 || ! isNumber(number)) {
            req.setAttribute("message", "Invalid number or null parameter !!!");
        }
        req.getRequestDispatcher("/multiplication_table.jsp").forward(req,resp);
    }

    private boolean isNumber(String numberStr){
        for (int i = 0; i < numberStr.length(); i++) {
            if (! Character.isDigit(numberStr.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

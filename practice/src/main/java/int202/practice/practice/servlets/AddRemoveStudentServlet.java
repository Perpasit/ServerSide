package int202.practice.practice.servlets;

import int202.practice.practice.services.AllStudent;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "addRemoveStudentServlet", value = "/add-remove-student")
public class AddRemoveStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        if(servletContext.getAttribute("studentContext") == null) {
            AllStudent allStudent = new AllStudent();
            servletContext.setAttribute("studentContext", allStudent);
        }

        req.getRequestDispatcher("/AddRemoveStudent.jsp").forward(req, resp);
    }
}

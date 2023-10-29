package sit.int202.registertue.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "CourseRegisterHistory" ,value = "/course-registered-history")
public class CourseRegisterHistory extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session==null || session.getAttribute("courseRegistered")==null) {
            req.setAttribute("message", "ไม่มีข้อมูล การลงทะเบียน ขอให้ลงทะเบียนก่อน");
        }
        getServletContext().getRequestDispatcher("/user_registered.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

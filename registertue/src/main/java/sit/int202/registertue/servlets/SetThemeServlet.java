package sit.int202.registertue.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "SetThemeServlet", value = "/set-theme")
public class SetThemeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/set-theme.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String backgroundColor = req.getParameter("bg");
        req.getSession().setAttribute("bg_color", backgroundColor);
        Cookie ck = new Cookie("bg_color_cookie", backgroundColor);
        ck.setMaxAge(8*24*60*60);
        resp.addCookie(ck);
        req.getRequestDispatcher("/set-theme.jsp").forward(req,resp);
    }
}

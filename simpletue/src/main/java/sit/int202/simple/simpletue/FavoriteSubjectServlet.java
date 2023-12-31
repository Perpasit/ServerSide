package sit.int202.simple.simpletue;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "FavoriteSubjectServlet", value = "/favoriteSubject")
public class FavoriteSubjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String subjects[] = req.getParameterValues("subjects");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Your Favorite Subject :: </h1><hr>");
        out.println("Your Student id: "+ id +"<br>");
        out.println("Your Student name: "+ name + "<br>");
        out.println("Favorite Subjects: <br>");
        for (String subject : subjects) {
            out.println("&nbsp; &nbsp; - " + subject + "<br>");
        }
        out.println("<hr>");
        /*getParameterMap()*/
        out.println("<h3>Request parameter using getParameterMap() :: </h3><hr>");
        Map<String, String[]> map = req.getParameterMap();
        out.println("Your Student id: "+ map.get("id")[0] +"<br>");
        out.println("Your Student name: "+ map.get("name")[0] + "<br>");
        out.println("Favorite Subjects: <br>");
        for (String subject : map.get("subjects")) {
            out.println("&nbsp; &nbsp; - " + subject + "<br>");
        }
        out.println("<hr>");
        out.println("<a href='favorite_subject.html'>[ Back ]</a>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

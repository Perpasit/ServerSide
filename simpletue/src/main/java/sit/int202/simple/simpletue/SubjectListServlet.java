package sit.int202.simple.simpletue;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.w3c.dom.ls.LSOutput;
import sit.int202.simple.simpletue.entities.Subject;
import sit.int202.simple.simpletue.repositories.SubjectRepository;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "SubjectListServlet", value = "/subjects")
public class SubjectListServlet extends HttpServlet {
    private long startTime ;

    @Override
    public void destroy() {
        System.out.println("Duration of SubjectList is " +
                (System.currentTimeMillis()-startTime)+ " milli seconds");
    }

    @Override
    public void init() throws ServletException {
        startTime = System.currentTimeMillis();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SubjectRepository sr = new SubjectRepository(); // call model to process
        List<Subject> subjectList = sr.findAll(); // keep it to List
        req.setAttribute("subjects", subjectList); //put it to bags
        req.getRequestDispatcher("/subjects_list.jsp").forward(req,resp); //send it to jsp for display a result

//        PrintWriter out = resp.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>Subject List::</h1><hr>");
//        out.println("<table>");
//        out.println("<tr>");
//        out.println("<td>Subject ID</td><td>Subject Title</td><td>Credit</td>");
//        out.println("</tr>");
//        for (Subject subject : sr.findAll()) {
//            out.println("<tr>");
//            out.println("<td>" + subject.getId() + "</td>");
//            out.println("<td>" + subject.getTitle() + "</td>");
//            out.println("<td>" + subject.getCredit() + "</td>");
//            out.println("</tr>");
//        }
//        out.println("</table>");
//        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

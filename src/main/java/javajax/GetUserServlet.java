package javajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/GetUserServlet")
public class GetUserServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet (HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String userName = request.getParameter("userName").trim();
        if (userName == null || "".equals(userName)) {
            userName = "Gest";
        }

        String greetings = "Hello" + userName;

        response.setContentType("text/plain");
        response.getWriter().write(greetings);
    }

}

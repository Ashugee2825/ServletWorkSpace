package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub'
		
         response.setContentType("tex/html");
		 
		 PrintWriter out = response.getWriter();
		 
		 String uname = request.getParameter("username");
		 	
		HttpSession session =request.getSession();
		session.setAttribute("name",uname);
		
		out.println("<h1>" +"Welcome To Session Handling"+"  </a>");
		
		 out.println("<a href='SecondServlet'>Visit Home Page</a>");
		 out.close();

	}

}

package mypack;

import java.io.IOException;
import java.io.PrintWriter;
//import 

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
         
		response.setContentType("tex/html");
		
		PrintWriter out = response.getWriter();
	    
		 String name = request.getParameter("username");
	     
		 Cookie cookie = new Cookie("name",name);// crete cookies object 
		 
		response.addCookie(cookie); // adding cookies to the response
		
		out.println("<form action = SecondServlet>");
		
		out.println("<input type = 'submit' name = 'submit'>");
		out.println("</form>");

		out.close();

		
		
		
	}

}

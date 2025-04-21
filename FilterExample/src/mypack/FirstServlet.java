package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		 response.setContentType("tex/html");
			
			PrintWriter out = response.getWriter();
			
		     String name = request.getParameter("uname");
		     String semail = request.getParameter("email");

		     
		     String course = request.getParameter("Course");

		     
		     
		     
		     out.println( "<h1>"+ "Welcome To Uplaztz"+"</h1>");
		     
		     out.println(" <html><body style = background-color:red; >");
			 out.println(" <table border ='1'>");
			 
			 out.println(" <tr>");
			 out.println(" <td>Name</td>");
			 out.println("<td>sname</td>");
			 out.println("</tr>");
			 
			 
			 out.println( "<td>Password</td>");
			 
			 
			 out.println(" <tr>");
			 out.println( "<td>Email></td>");
			 out.println( "<td>semail></td>");
			 out.println("</tr>");
			 
			 out.println(" <tr>");
			 out.println( "<td>Course</td>");
			 out.println("</tr>");
			 
			 
		     out.println(" </table> ");
		     out.println( "</body></html>");
		     
				out.close();
	
		
		
		
	}

}

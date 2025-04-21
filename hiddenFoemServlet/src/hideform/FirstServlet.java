package hideform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("tex/html");
		
		PrintWriter out = response.getWriter();
		
	     String name = request.getParameter("uname");
	     
	     out.println( "<html>");
	     out.println( "<body style = 'background -color:orange>");
	     
	     out.println( "<h1>" +"Welcome TO Hidden Form"+"</h1>");
	     
	     String password = request.getParameter("password");
	
	     out.println( "<form method ='post' action = 'SecondServlet'>");
		
	     out.println( "<input type= 'text' name= 'name' value = '' +sname+>");   // creating hidden field
		
	     out.println( "<input type='submit' value='submit'>");
	     
	     out.println( "</form>");
	     
	     out.println( "</body>");
	     
	     out.println( "</html>");
	     
	     out.close();
		
	}

}

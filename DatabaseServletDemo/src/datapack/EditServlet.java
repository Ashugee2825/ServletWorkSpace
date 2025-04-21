package datapack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  Employee e = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
    	
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("tex/html");
		 
		 PrintWriter out = response.getWriter();
		 
	     int id  = Integer.parseInt(request.getParameter("id"));
		 
	     try {
	    	 
	    	 e = EmplDao.getOneEmployee(id);
	    	 
	     }catch (ClassNotFoundException e) {
	 		
	 		// To Do catch block
	 		e.printStackTrace();
	 		
	 	}
	     
	     out.println(" <html><body >");
	     out.println("<form method =' POST' action ='EditTwo'>");
		 out.println(" <table border ='1'>");
		 out.println("<tr><td><inputn type ='hidden' name ='id' value ='"+e.getId()+"'/></td</tr>");
		 out.println("<tr><td><inputn type ='text' name ='name' value ='"+e.getEname()+"'/></td</tr>");
		 out.println("<tr><td><inputn type ='text' name ='password' value ='"+e.getEpassword()+"'/></td</tr>");
		 out.println("<tr><td><inputn type ='text' name ='email' value ='"+e.getEmail()+"'/></td</tr>");
		 out.println("<tr><td>Country</td</tr>");
		 out.println("<tr><td><select name ='Country:'</td</tr>");
		 
		 out.println(" <option> Select Your Country</option>");
		 
		 out.println("<option> India</option>");
		 out.println("<option> USA</option>");
		 out.println("<option> UAE</option>");
		 out.println("<option> UK</option>");
		 out.println("<option> Other</option>");
		 out.println("/select>");
		 out.println("</td></tr>");
		 out.println("/table>");
		 out.println("/form>");
		 
		 
	}

}

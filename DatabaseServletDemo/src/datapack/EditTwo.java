package datapack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditTwo
 */
@WebServlet("/EditTwo")
public class EditTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  

		response.setContentType("tex/html");
		 
		Employee e = new Employee();
		
		 PrintWriter out = response.getWriter();
		 
	     int id  = Integer.parseInt(request.getParameter("id"));
	     
	     String name = request.getParameter("name");
	     
	     String Password = request.getParameter("password");
	     
	     String email = request.getParameter("email");
	     
	     String country = request.getParameter("Country");
	     
	     e.setId(id);
	     
	     e.setEpassword(Password);
	     
	     e.setEname(name);
	     
	     e.setEmail(email);
	     e.setEcountry(country);
	      int status = 0;
	    try {
	    	status = EmplDao.updateEmployee(e);
	    }catch (ClassNotFoundException e1) {
	 		
	 		// To Do catch block
	 		e.printStackTrace();
	 		
	 	}
	    
	       if (status>0)
	       {
	    	   out.println("updated");
	    	   
	    	   response.sendRedirect("ViewServlet");
	    	   
	       }
	       else {
	    	   out.println(" Table Not Updated");
	       }
	    	   
	}

}

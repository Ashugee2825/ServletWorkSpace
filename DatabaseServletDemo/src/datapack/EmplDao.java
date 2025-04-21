package datapack;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class EmplDao {
	static List<Employee> list;
    static Connection con;
	public static Connection getConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("com.sql.jdbc.Driver");   // loading the Driver class 
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sam?useSSL=false","root","nitr@123");
			
		}catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		return con;
	}
	public static int save(Employee e)
	{
	 int status =0;
	 
	 Employee em =new Employee();
	 
	 Connection con = EmplDao.getConnection();
	 
	try {
		PreparedStatement ps =con.prepareStatement( "insert into empreg(ename,epassword,email,ecounrty)values(?,?,?,?)");
		
		status =ps.executeUpdate();
		ps.setString(1,em.getEname());
		
		ps.setString(2,em.getEpassword());
		
		ps.setString(3,em.getEmail());
		
		ps.setString(4,em.getEcountry());
		
		status = ps.executeUpdate();
		
		con.close();
		
	}catch (SQLException e1) {
		
		// To Do catch block
		e1.printStackTrace();
		
	}
		return status;
	}	
	
	public static <list> List<Employee> getAllEmployees()throws ClassNotFoundException
	{
		list = new ArrayList<Employee>();
		
		Connection con = null;

		con = EmplDao.getConnection();
		 
		try {
			PreparedStatement ps =con.prepareStatement( "select * from empreg");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Employee e = new Employee();
				
				e.setId(rs.getInt(1));
				
				e.setEname(rs.getString(2));
				
				e.setEpassword(rs.getString(3));
				
				e.setEmail(rs.getString(4));
				
				e.setEcountry(rs.getString(5));
				
				list.add(e);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();		
	}	
		return list;
  }
	
	public static Employee getOneEmployee(int id) throws ClassNotFoundException
	{
	    Employee eone =new Employee();
		
		Connection con = null;
        
		con = EmplDao.getConnection();
		  
		try {
			PreparedStatement ps3 =con.prepareStatement( "select * from empreg where id =?");
			
			  ps3.setInt(1,id); 
			  
			  ResultSet rs = ps3.executeQuery();
	          
		while(rs.next())
		{    
			eone.setId(rs.getInt(1));
			
			eone.setEname(rs.getString("ename"));
			
			eone.setEpassword(rs.getString("epassword"));
			
			eone.setEcountry(rs.getString("ecountry"));
		}
	}catch(SQLException e1) {
		
		// To Do catch block
		e1.printStackTrace();
		
	
}
		
		return eone;
	}
	public static int updateEmployee(Employee em) throws ClassNotFoundException
	{
		
		int status = 0;
		con = EmplDao.getConnection();
		
		try {
			PreparedStatement pu =con.prepareStatement("update empreg set ename =?,epassword = ?,email =7,ecountry =? where id =?)");
			
			pu.setString(1, em.getEname());
			
			pu.setString(2, em.getEpassword());
			
			pu.setString(3, em.getEmail());
			
			pu.setString(4, em.getEcountry());
			
			pu.setLong(5, em.getId());
			
			status =pu.executeUpdate();
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
	}
	public static int DeleteEmployee(int id)throws ClassNotFoundException 
	{
		int status = 0;
		
		con = EmplDao.getConnection();
		
		try {
			PreparedStatement pd=con.prepareStatement("delete from empreg where id =?");
			
			pd.setInt(1,id);
			
			status =pd.executeUpdate();
			con.close();
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		return status;
		
	}
}	
	
	
	

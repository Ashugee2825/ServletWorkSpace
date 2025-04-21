package datapack;

public class Employee {
	
	private int id;
	 private String ename;
	 
	 private String epassword;
  
	 private String email;
	 
	 private String ecountry;
	 
	 public Employee() {
			super();
	 }
	 
	 

	public Employee(int id, String ename, String epassword, String email, String ecountry) {
		super();
		this.id = id;
		this.ename = ename;
		this.epassword = epassword;
		this.email = email;
		this.ecountry = ecountry;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public String getEpassword() {
		return epassword;
	}



	public void setEpassword(String epassword) {
		this.epassword = epassword;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getEcountry() {
		return ecountry;
	}



	public void setEcountry(String ecountry) {
		this.ecountry = ecountry;
	}



	public void printStackTrace() {
		// TODO Auto-generated method stub
		
	}
	 
	 
}

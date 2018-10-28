package controller;

import model.LoginDAO;

import com.opensymphony.xwork2.ActionSupport;



@SuppressWarnings("serial")
public class LoginController extends ActionSupport {
	String username, password;
	
	
	public String getusername() {
		return username;
	}


	public void setusername(String username) {
		this.username = username;
	}


	public String getpassword() {
		return password;
	}


	public void setpassword(String password) {
		this.password = password;
	}


	@Override
	public String execute(){
		 
		if(LoginDAO.validate(this.username,this.password)) return "success";
		else return "failure";

		
	}

}

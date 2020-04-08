package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import businessLogic.LoginValidation;
import businessLogic.RegisterProcess;
import model.Users;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Users user;
		RegisterProcess regpro = new RegisterProcess();
		LoginValidation login = new LoginValidation();
		
		
		System.out.println("1. Register");
		System.out.println("2. Login");
		int choice;
		
		choice = Integer.parseInt(br.readLine());
		
		switch(choice) {
		case 1: 
			System.out.println("---------------Registration---------------");
			System.out.println("Enter your Username");
			String username = br.readLine();
			
			System.out.println("Enter your password");
			String password = br.readLine();
			
			System.out.println("Enter your Email");
			String email = br.readLine();
			
			//Creating object
			user = new Users();
			
			//setting the values
			user.setUsername(username);
			user.setPassword(password);
			user.setEmail(email);
			
			regpro.register(user);
			
			break;
			
		case 2:
			System.out.println("--------------------Login----------------------");
			System.out.println("Enter your Username");
			String Lusername = br.readLine();
			
			System.out.println("Enter your password");
			String Lpassword = br.readLine();
			
			login.checkLogin(Lusername, Lpassword);
			
			break;
		
		}
		
	}

}

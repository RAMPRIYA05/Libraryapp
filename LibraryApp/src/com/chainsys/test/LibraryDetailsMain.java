package com.chainsys.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.dao.LibraryDetailsAdmin;
import com.chainsys.dao.LibraryDetailsImplementation;



public class LibraryDetailsMain {
	

	static LibraryDetailsAdmin admin=new LibraryDetailsAdmin();
	static LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	
	Scanner sc=new Scanner(System.in);
	System.out.println("1.Admin\n 2.User");
	int key=sc.nextInt();
	if(key==1)
	{
		admin.adminLogin();
	}
	else if(key==2)
	{
		libraryDetails.enterType();
	}
	//libraryDetails.details();
	//libraryDetails.register();
	
	//libraryDetails.key();
	
//	libraryDetails.update();
	//libraryDetails.delete();
}
}
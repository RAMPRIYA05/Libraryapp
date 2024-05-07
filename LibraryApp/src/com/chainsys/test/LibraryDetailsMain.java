package com.chainsys.test;

import java.sql.SQLException;

import com.chainsys.dao.LibraryDetailsImplementation;



public class LibraryDetailsMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
	
	//libraryDetails.details();
	//libraryDetails.register();
	libraryDetails.libraryLogin();
	//libraryDetails.key();
	
	//libraryDetails.update();
	//libraryDetails.delete();
}
}
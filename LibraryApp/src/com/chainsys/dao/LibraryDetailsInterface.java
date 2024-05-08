package com.chainsys.dao;

import java.sql.SQLException;
import java.time.LocalDate;

public interface LibraryDetailsInterface {
	  //public int generateLibraryCardNumber();
	 //public String generatePassword();
	 public String name();
	 //public int phoneNumber();
	 public int cardNumber();
	 public String libraryPassword();
	 public int role();
	 public int user();
	 public String signUp();
	 public String logIn();
	 
	 public int purpose();
	 public String category();
	 public int noOfBooksTakenDetails();
	 public int fineDetails();
	 public LocalDate todayDate();
	 public LocalDate returnDate();
	 public char nextBookDetails();
	 public void details();
	 public void libraryLogInPassword() throws ClassNotFoundException, SQLException;
	 public boolean enterType() throws ClassNotFoundException, SQLException;
	 public boolean libraryLogin() throws SQLException, ClassNotFoundException;
	 //public boolean register() throws ClassNotFoundException, SQLException;
	 //public boolean update() throws SQLException, ClassNotFoundException;
	 //public boolean delete() throws ClassNotFoundException, SQLException;
	 //public boolean retrive() throws ClassNotFoundException, SQLException;
}

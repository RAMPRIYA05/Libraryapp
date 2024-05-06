package com.chainsys.dao;

import java.sql.SQLException;
import java.time.LocalDate;

public interface LibraryDetailsInterface {
	 public int role();
	 public int generateLibraryCardNumber();
	 public String generatePassword();
	 public int cardNumber();
	 public String libraryPassword();
	 public int purpose();
	 public String category();
	 public int noOfBooksTakenDetails();
	 public void fineDetails();
	 public LocalDate todayDate();
	 public LocalDate returnDate();
	 public char nextBookDetails();
	 public void details();
	 public boolean libraryLogin() throws SQLException, ClassNotFoundException;
	 public boolean register() throws ClassNotFoundException, SQLException;
	 public boolean update() throws SQLException, ClassNotFoundException;
	 public boolean delete() throws ClassNotFoundException, SQLException;
}

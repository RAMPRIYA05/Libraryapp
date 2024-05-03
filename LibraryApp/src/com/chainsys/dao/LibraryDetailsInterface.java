package com.chainsys.dao;

import java.sql.SQLException;
import java.time.LocalDate;

public interface LibraryDetailsInterface {
	 public int role();
	 public int generateLibraryCardNumber();
	 public String generatePassword();
	 public int cardNumber();
	 public String libraryPassword();
	 public String purpose();
	 public String category();
	 public int noOfBooksTakenDetails();
	 public void fineDetails();
	 public LocalDate todayDate();
	 public LocalDate returnDate();
	 public char nextBookDetails();
	 public void details();
	 public boolean libraryLogin() throws SQLException, ClassNotFoundException;
}

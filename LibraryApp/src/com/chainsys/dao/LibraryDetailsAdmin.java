package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.chainsys.model.AdminLibraryPojo;
import com.chainsys.util.JdbcConnection;

public class LibraryDetailsAdmin {
	public static String cardNumberAdmin;
	public static String passwordAdmin;
	public static int siNo;
	static Scanner sc=new Scanner(System.in);
      static LibraryDetailsAdmin admin=new LibraryDetailsAdmin();
      static AdminLibraryPojo adminLibrary=new AdminLibraryPojo();
      public void adminLogin() throws ClassNotFoundException, SQLException
      {
    	  
  		  Connection connection = JdbcConnection.getConnection();
          System.out.println(connection);
          String adminCardNumber="Admin1414";
          String adminPassword="Admin14@";
          System.out.println("Enter Admin Card Number");
          cardNumberAdmin=sc.nextLine();
          System.out.println("Enter Admin Password");
          passwordAdmin=sc.nextLine();
          if(cardNumberAdmin.equals(adminCardNumber) && passwordAdmin.equals(adminPassword))
          {
        	  System.out.println("Successfully logged in");
        	  admin.displayDetails();
        	  
          }
          else {
        	  System.out.println("Enter correct card number or password");
        	  admin.adminLogin();
          }
          
      }
      
      
      public void displayDetails() throws ClassNotFoundException, SQLException {
      Scanner sc=new Scanner(System.in);
      System.out.println("Choose any one type");
      System.out.println("1.Add books\n 2.Delete Books\n 3.View Book Details\n 4.Update Book Details\n 5.Exit\n 6.insert table");
      int key=sc.nextInt();
      switch(key){
      
      case 1:
          System.out.println("Add books");
          //LibraryDetailsAdmin.addBooks();
          break;
      case 2:
    	  System.out.println("Delete Books");
    	  //LibraryDetailsAdmin.deleteBooks();
    	  break;
      case 3:
    	  System.out.println("View Book Details");
    	  //LibraryDetailsAdmin.viewBooks();
    	  break;
      case 4:
    	  System.out.println("Update Book Details");
    	  //LibraryDetailsAdmin.updateBooks();
    	  break;
      case 5:
    	  System.out.println("Exit");
    	  break;
      case 6:
    	  System.out.println("Insert table");
    	  admin.insertData();
      }
      }
      
      
      public void insertData() throws ClassNotFoundException, SQLException
      {
    	  
    	  System.out.println("Enter Book Category:");
    	  String bookCategory=sc.nextLine();
    	  System.out.println("Enter Book Name:");
    	  String bookName=sc.nextLine();
    	  System.out.println("Number of books added:");
    	  int noOfBooks=sc.nextInt();
    	  System.out.println("Enter Author Name:");
    	  String authorName=sc.nextLine();
    	  System.out.println("Enter Book serial number");
    	  int bookNumber=sc.nextInt();
    	  Connection connection = JdbcConnection.getConnection();
    	
      	  String adminBookTable="insert into adminLibraryDetails(siNo,cardNumberAdmin,passwordAdmin,bookCategory,bookName,noOfBooks,authorName,bookNumber)values(?,?,?,?,?,?.?,?)";

		   PreparedStatement prepareStatement=connection.prepareStatement(adminBookTable);
		  
		// ResultSet resultSet= prepare.executeQuery();
//		   adminLibrary.setSiNo(siNo);
//		   adminLibrary.setCardNumberAdmin(cardNumberAdmin);
//		   adminLibrary.setPasswordAdmin(passwordAdmin);
//		   adminLibrary.setBookCategorgy(bookCategorgy);
//		   adminLibrary.setBookName(bookName);
//		   adminLibrary.setAuthorName(authorName);
//		   adminLibrary.setNoOfBooks(noOfBooks);
//		   adminLibrary.setBookNumber(bookNumber);
//		   prepareStatement.setInt(1,adminLibrary.getSiNo());
//		   prepareStatement.setString(2,adminLibrary.getCardNumberAdmin());
//		   prepareStatement.setString(3,adminLibrary.getPasswordAdmin());
//		   prepareStatement.setString(4,adminLibrary.getBookCategorgy());
//		   prepareStatement.setString(5,adminLibrary.getBookName());
//		   prepareStatement.setInt(6,adminLibrary.getNoOfBooks());
//		   prepareStatement.setString(7,adminLibrary.getAuthorName());
//		   prepareStatement.setInt(8,adminLibrary.getBookNumber());
//		   int rows= prepareStatement.executeUpdate();
		   
		   
		   prepareStatement.setInt(1,siNo);
		   prepareStatement.setString(2,cardNumberAdmin);
		   prepareStatement.setString(3,passwordAdmin);
		   prepareStatement.setString(4,bookCategory);
		   prepareStatement.setString(5,bookName);
		   prepareStatement.setInt(6,noOfBooks);
		   prepareStatement.setString(7,authorName);
		   prepareStatement.setInt(8,bookNumber);
		   int rows= prepareStatement.executeUpdate();
		   
		   System.out.println("Successfully inserted");
		    
      }
	
      public void updateData() throws SQLException, ClassNotFoundException 
      {
    	  Connection connection = JdbcConnection.getConnection();
    	  System.out.println(connection);
    	   // public static void update(String name) throws ClassNotFoundException, SQLException{    
    	    System.out.println("Update Author Name:");
    	    System.out.println("Enter Author Name:");
    	    String authorName=sc.nextLine(); 
    	    String save="UPDATE adminLibraryDetails SET authorName=? WHERE bookNumber=453";
    	    PreparedStatement prepareStatement = connection.prepareStatement(save);
    	    prepareStatement.setString(7,authorName);
    	    int rows = prepareStatement.executeUpdate();
    	    System.out.println(rows+"updated");
    	  }
      
      public void deleteData() throws SQLException, ClassNotFoundException 
      {
    	  Connection connection = JdbcConnection.getConnection();
    	  System.out.println(connection); 
    	  String delete="DELETE * FROM adminLibraryDetails WHERE bookCategory='Horror'";
    	  PreparedStatement prepareStatement = connection.prepareStatement(delete);
    	  int rows = prepareStatement.executeUpdate();
    	  System.out.println(rows+"Deleted");
    }
      
      public void readData() throws ClassNotFoundException, SQLException {
    	  Connection connection = JdbcConnection.getConnection();
    	  System.out.println(connection);
    	  Statement statement= connection.createStatement();
    	  String save="SELECT * FROM adminLibraryDetails WHERE bookName='Wow'";
          PreparedStatement prepareStatement = connection.prepareStatement(save);
          ResultSet rows = statement.executeQuery(save);
          while (rows.next()) {
        	 
        	  int siNo=rows.getInt("SiNO");
        	  String cardNumberAdmin=rows.getString("Card number");
        	  String passwordAdmin=rows.getString("Password");
        	  String bookCategory=rows.getString("Category");
        	  String bookName=rows.getString("Book Name");
        	  int noOfBooks=rows.getInt("No of books");
        	  String authorName=rows.getString("Author Name");
        	  int bookNumber=rows.getInt("Book Number");
        	  System.out.println("Retrieved Data");
        	  System.out.println("SiNO:"+siNo+"\t\t | \t Card number:"+cardNumberAdmin+"\t\t | \t Password:"+passwordAdmin+"\t\t |\t Category:"+bookCategory+"\t\t | \t bookName:"+ bookName+"\t\t | \t No of books:"+ noOfBooks+"\t\t | \t Author Name:"+authorName+"\t\t | \t Book Number:"+bookNumber);
      }
        System.out.println(rows+" retrieved");
    }
 }


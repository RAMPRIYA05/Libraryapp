package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.chainsys.model.LibraryDetailsPojo;
import com.chainsys.util.JdbcConnection;

public class LibraryDetailsImplementation implements LibraryDetailsInterface{
	static LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
    static LibraryDetailsPojo pojo=new LibraryDetailsPojo();
	public static  int bookCount;
	public static int purpose;
	public static int age;
	public static int membershipPackage;
	public static int newLibraryCardNumber;
	public static int day;
	static int fineAmount;
    static int fine;
    static int libraryCardNumber;
    static int bookCategory;
    static int noOfBooksTaken;
    static int user;
    static String bookName;
    static char nextBook;
    static String userPassword;
    static String option;
    //static String existingList;
	@Override
	public int role() 
	{
	 Scanner sc=new Scanner(System.in);
   	 System.out.println("Type of users:");
   	 System.out.println(" 1.membership\n 2.non-membership\n");
   	 System.out.println("User(1/2):");
   	 int user=sc.nextInt();
//   	String userString=Integer.toString(user);
//   	 Pattern p=Pattern.compile("^[1-2]$");
//     Matcher m=p.matcher(userString);
//     if(m.find())
//        {
   	 if(user==1||user==2)
   	 {
       	 switch(user) 
       	 {
       	 case 1:
       		 System.out.println("We are happy because you are member of our library");
       		 System.out.println("**************");
       		libraryDetails.cardNumber();
       		 break;
       	 case 2:
       		 System.out.println("you are non membership of our library.");
       		 System.out.println("You can read books only inside the library.");
       		 System.out.println("if you want to take book to home,you should be a member of our library");
       		 System.out.println("are you willing to apply for membership?(Y/N):");
       		 char apply=sc.next().charAt(0);
       		 //System.out.println("Apply:"+apply);
       		 if(apply=='y' || apply=='n' || apply=='N' || apply=='Y')
       		 {

       		 if(apply=='Y' || apply=='y')
       		 {
       			 System.out.println("we are happy because you are ready to apply for membership.");
       			 System.out.println("Now You have to signup:");
       			 System.out.println("We have different types of offers based on age.");
       			 System.out.println("Enter your age:");
       			 age=sc.nextInt();
       			 String ageString=Integer.toString(age);
           		 Pattern p1=Pattern.compile("^[1-9][0-9]|100$");
           	     Matcher m1=p1.matcher(ageString);
           	     if(m1.find())
           	     {
       			 if(age>=18 && age<=60)
       			 {
       			     System.out.println("we have use different type of membership package.");
       			     System.out.println("package option:1.one year=200 2.two year=350 3.three year=550 4.five year=900");
       			     membershipPackage=sc.nextInt();
       			     if(membershipPackage==1||membershipPackage==2||membershipPackage==3||membershipPackage==4)
       			     {
       			     if(membershipPackage==1)
       			     {
       				     System.out.println("You get one year membership card"); 
       			     }
       			     else if(membershipPackage==2)
       			     {
       				     System.out.println("you get two year membership card");
       	             }
       			     else if(membershipPackage==3)
       			     {
       				     System.out.println("you get three year membership card");
       			     }
       			     else if(membershipPackage==4)
       			     {
       			         System.out.println("you can get golden membership card.It is valid for for five years");	 
       			     }
       			     }
       			     
       			  }
       			  else if((age>=10 && age<18) || age>60)
       			  {
       				 System.out.println("We give offers for minor and senoir citizen.");
       				 System.out.println("package option:1.one year=180 2.two year=330 3.three year=530 4.five year=870");
       				 membershipPackage=sc.nextInt();
       				 if(membershipPackage==1||membershipPackage==2||membershipPackage==3||membershipPackage==4)
       			     {
       				 if(membershipPackage==1)
           			 {
           				System.out.println("You get one year membership card"); 
           			 }
           			 else if(membershipPackage==2)
           			 {
           				 System.out.println("you get two year membership card");
           	
           			 }
           			 else if(membershipPackage==3)
           			 {
           				 System.out.println("you get three year membership card");
           			 }
           			 else if(membershipPackage==4)
           			 {
           			     System.out.println("you get golden membership card.It is valid for for five years");	 
           			 }
       			     }
       				 else
       				 {
       					 System.out.println("error");
       					libraryDetails.role();
       				 }
       			  }
       			 }
       			 else
       			 {
       				 System.out.println("please enter age greater than and equal to 10");
       				 libraryDetails.role();
       			 }
           	  libraryDetails.generateLibraryCardNumber();
       		 }
       		 else if(apply=='N' || apply=='n')
       	     {
       				System.out.println("You can only read books inside the library");  
       				System.out.println("***************");
       		 }
       		 }
       		 else
       	     {
       			 System.out.println("Error..enter (y/Y/N/n)");
       			libraryDetails.role();
       			 }
       			 }
       		 
       	 }
        else
        {
       	 System.out.println("error");
       	libraryDetails.role();
        }
        
		return user;
		
	}
	@Override
	public int generateLibraryCardNumber() {
	    Scanner sc=new Scanner(System.in);
   	    //System.out.println("Now you have to sign up:");
   	    System.out.println("newLibraryCardNumber="+age+membershipPackage+"12");
   	    libraryDetails.generatePassword();
		return newLibraryCardNumber;
	}
	@Override
	public String generatePassword() {
	    	 Scanner sc=new Scanner(System.in);
	    	 System.out.println("Enter the password:");
	    	 userPassword=sc.next();
	         Pattern p=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
	         Matcher m=p.matcher(userPassword);
	         
	         if(m.matches())
	         {
	        	 System.out.println("Re-enter your Password:");
	        	 String userPassword1=sc.next();
	        	 //System.out.println("Re-enter your Password:"+password1);
	             System.out.println("Successfully signed up");
	             System.out.println("*************************");
	             System.out.println("Log in");
	   	         libraryDetails.cardNumber();
	         }
	         else 
	         {
	        	System.out.println("error");
	   	        System.out.println("Please enter atleast one uppercase,digit,lowercase,special character,atleast 8 characters & atmost 20 characters");
	            libraryDetails.generatePassword();
	         }
	                 
			return userPassword;
	}
	
	@Override
	public int cardNumber() {
		    Scanner sc=new Scanner(System.in);
	        System.out.println("Library CardNumber Of User:");
	        libraryCardNumber=sc.nextInt();
	        String cardNumber=Integer.toString(libraryCardNumber);
	        Pattern p=Pattern.compile("^[0-9]{5}$");
	        Matcher m=p.matcher(cardNumber);
	        if(m.find())
	        {	
	        	System.out.println(libraryCardNumber);
	        	libraryDetails.libraryPassword();
	        }
	        else
	        {
	        	System.out.println("Error");
	        	System.out.println("card number holds 5 digits");
	    	    libraryDetails.cardNumber();
	    	    
	        }
		    return libraryCardNumber ;  
	}
	@Override
	public String libraryPassword() {
		 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the password:");
    	 userPassword=sc.next();
         Pattern p=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
         Matcher m=p.matcher(userPassword);
         if(m.matches())
         {
   	       System.out.println("Correct password");
   	       System.out.println("Welcome to our Library");
   	       System.out.println("*******************************");
   	       libraryDetails.purpose();
         }
         else 
         {
        	System.out.println("error");
   	        System.out.println("Please enter atleast one uppercase,digit,lowercase,special character,atleast 8 characters & atmost 20 characters");
            libraryDetails.libraryPassword();
         }
		return userPassword;
	}
	@Override
	public int purpose() {
   	 Scanner sc=new Scanner(System.in);
 	
   	 System.out.println("Types of person in library:");
   	 System.out.println(" 1.Booktaken\n 2.BookReturn\n 3.Bookreaders inside a library");
   	 System.out.println("Choose anyone option(1/2/3):");
   	 purpose=sc.nextInt();
   	// sc.nextLine();
   	 //System.out.println("purpose:"+purpose);
//   	 Pattern p=Pattern.compile("^[1-3]+$");
//     Matcher m=p.matcher(purpose);
//     if(m.find())
//     {
   	 if(purpose==1||purpose==2||purpose==3) 
   	 {
   	 switch(purpose)
   	 {
   	 case 1:
   		
   		 libraryDetails.category();
   		 libraryDetails.noOfBooksTakenDetails();
      	 libraryDetails.fineDetails();
      	 libraryDetails.todayDate();
      	 libraryDetails.nextBookDetails();
   		 break;
   	 case 2:
   		 System.out.println("Name of the book:");
   		 String book=sc.nextLine();
   		 System.out.println("book:"+book);
   		 System.out.println("Name of the category:");
   		 String category=sc.nextLine();
   		 System.out.println("Category:"+category);
   		 libraryDetails.fineDetails();
   		 libraryDetails.returnDate();
   		 System.out.println("Book returned");
   		 break;
   	 case 3:
   		 libraryDetails.category();
   		 System.out.println("They take books for reading inside the library");
   		 System.out.println("They donot take books or return books"); 
   		 break;
       }
        }
        else
        {
             System.out.println("Error...choose an option(1/2/3)");
             libraryDetails.purpose();
        }
		 return purpose;	
	}
	@Override
	public String category() {
	 Scanner sc=new Scanner(System.in);
   	 System.out.println("These are the category in our library:");
   	 System.out.println(" 1.Historical Fiction\n 2.Fantasy\n 3.Mystery\n 4.Comics");
   	 System.out.println("choose any one Book category:");
   	 bookCategory=sc.nextInt();
//   	 Pattern p=Pattern.compile("^[a-d]$");
//     Matcher m=p.matcher(bookCategory);
//     if(m.find())
//     {
   	 if(bookCategory==1||bookCategory==2||bookCategory==3||bookCategory==4) 
   	 {
   	 System.out.println(bookCategory);
   	 switch(bookCategory)
   	 {
   		 case 1:
   			 System.out.println(" Historical Fiction:\n 1.Pachinko\n 2.All the Light We Cannot See\n 3.The Nightingale\n");
   			 System.out.println("Enter an option:");
   			 int historicalFictionOption=sc.nextInt();
   			 //System.out.println(historicalFictionOption);
   			 if(historicalFictionOption>0 && historicalFictionOption<=3)
   			 {
   			 if(historicalFictionOption==1)
   			 {
   				 bookName="Pachinko";
   				 //String book1="Pachinko";
   				 //bookName=book1;
   				 System.out.println("Book Name:"+bookName);
   				 bookCount=5;
   				 System.out.println("no of "+bookName+" books available are: "+bookCount); 		     
   			 }
   			 else if(historicalFictionOption==2)
   			 {
   				  bookName="All the Light We Cannot See";

//   				  String book2="All the Light We Cannot See";
//   				  bookName=book2;
   				  System.out.println("Book Name:"+bookName); 
   			      System.out.println("This book available after 27/04/2024");
   			      System.out.println("you have to wait or choose other book");
   			      libraryDetails.category();
   			 }
   			 else if(historicalFictionOption==3)
   			 {
   				 bookName="The Nightingale";
//   				  String book3="The Nightingale";
//   				  bookName=book3;
  				  System.out.println("Book Name:"+bookName); 
  				  bookCount=10;
				    System.out.println("no of "+bookName+" books available are: "+bookCount); 
   			 }
   			 }
   			 else {
   				 System.out.println("Error");
   				 libraryDetails.category();
   			 }
   			 break;
            case 2:
           	 System.out.println(" Fantasy:\n 1.Jade City\n 2.Tigana\n 3.The Night Circus");
           	 System.out.println("Enter an option:");
           	 int fantasy=sc.nextInt();
   			 //System.out.println(fantasy);
   			 if(fantasy>0 && fantasy<=3)
   			 {
   			 if(fantasy==1) 
   			 {
   				bookName="Jade City";
//   				 String book1="Jade City";
//   				 bookName=book1;
   				 System.out.println("Book Name:"+bookName);
   				 bookCount=15;
   				 System.out.println("no of "+bookName+" books available are: "+bookCount); 
   			 }
   			 else if(fantasy==2)
   			 { 
   				bookName="Tigana";
//   				  String book2="Tigana";
//   				  bookName=book2;
   				  System.out.println("Book Name:"+bookName);
   			      System.out.println("This book available after 27/04/2024");
   			      System.out.println("you have to wait or choose other book");
   			      libraryDetails.category();
   			 }
   			 else if(fantasy==3)
   			 {
   				bookName="The Night Circus";
//   				 String book3="The Night Circus";
//   				 bookName=book3;
  				 System.out.println("Book Name:"+bookName);
  				 bookCount=3;
				 System.out.println("no of "+bookName+" books available are: "+bookCount);
   			 }
   			 }
   			 else
   			 {
   				 System.out.println("error");
   				 libraryDetails.category();
   			 }
   			 break; 
   	     case 3:
   	    	 System.out.println(" Mystery:\n 1.Gone Girl\n 2.The Girl with the Dragon\n");
   	    	 System.out.println("Enter an option:");
   	    	 int mystery=sc.nextInt();
   			// System.out.println(mystery);
   			 if(mystery>0 && mystery<=2)
   			 {
   			 if(mystery==1)
   			 {
   				bookName="Gone Girl";
//   				 String book1="Gone Girl";
//   				 bookName=book1;
   				 System.out.println("Book Name:"+bookName);
   				 bookCount=10;
   				 System.out.println("no of "+bookName+" books available are: "+bookCount); 
   			 }
   			 else if(mystery==2)
   			 {
   				bookName="The Girl with the Dragon";
//   		         String book2="The Girl with the Dragon";
//   		         bookName=book2;
   		         System.out.println("Book Name:"+bookName);
   		         System.out.println("This book available after 03/05/2024");
  			     System.out.println("you have to wait or choose other book");
  			     libraryDetails.category();       
   			 } 
   			 }
   			 else
   			 {
   				 System.out.println("error");
   				 libraryDetails.category();
   			 }
   			 break;
   	     case 4:
   	    	 System.out.println("Comics:\n 1.The Sand Man\n 2.Watchmen\n");
   	    	 System.out.println("Enter an option:");
   	    	 int comics=sc.nextInt();
			 //System.out.println(comics);
			 if(comics>0 && comics<=2)
			 {
			     if(comics==1)
			     {
			    	 bookName="The Sand Man";
//			    	 String book1="The Sand Man";
//			    	 bookName=book1;
			    	 System.out.println("Book Name:"+bookName);
			    	 bookCount=20;
   				 System.out.println("no of "+bookName+" books available are: "+bookCount); 
			     }
			     else if(comics==2)
   			     {
			    	 bookName="Watchmen";
//   		         String book2="Watchmen";
//   		         bookName=book2;
   		         System.out.println("Book Name:"+bookName);
   		         System.out.println("This book available after 09/05/2024");
  			         System.out.println("you have to wait or choose other book");
  			         libraryDetails.category();
  			      } 
			     }
			     else
			     {
			    	 System.out.println("error");
			    	 libraryDetails.category();
			     }
			     break;
   	 }
        }
        else
        {
       	 System.out.println("error");
       	 libraryDetails.category();
        }
		return bookName;
	}
	@Override
	public int noOfBooksTakenDetails() {
		Scanner sc=new Scanner(System.in);
        System.out.println("Number of books taken by user:");
        noOfBooksTaken=sc.nextInt();
        String numberOfBooksTaken=Integer.toString(noOfBooksTaken);
        Pattern p=Pattern.compile("^[0-9]*$");
        Matcher m=p.matcher(numberOfBooksTaken);
        if(m.find())
        {	
       	 if(bookCount>noOfBooksTaken && noOfBooksTaken!=0)
       	 {
    	   System.out.println(noOfBooksTaken);
   	 	   int remainingNoOfBooks=bookCount-noOfBooksTaken;
   	 	   System.out.println("Remaining number of books:"+remainingNoOfBooks);
   	 	   System.out.println("*******************************");
   	 	   System.out.println("How many days after you return the book?");
    	   System.out.println("If You return the book within 15 days.Then no fine");
       	 }
       	 else
       	 {
       		 System.out.println("enter no of books less than book available");
       		 libraryDetails.noOfBooksTakenDetails();
       	 }
			}
        else
        {
    	    System.out.println("Error");
    	    libraryDetails.noOfBooksTakenDetails();
        }
	    return noOfBooksTaken;
	}
	@Override
	public void fineDetails() {
	  Scanner sc=new Scanner(System.in);
  	  System.out.println("Please enter the days.It will show fine is applicable or not.");
  	  day=sc.nextInt();
  	  if(day>0) 
  	  {
  	  if(day<=15) {
  		  System.out.println("No fine.You return book on time");
  		  fine=0;
  	  }
  	  else if(day>15 && day<=20)
  	  {
  		  System.out.println("You should pay fine rs.50");
  		  fine=50;
  		  System.out.println("fine"+fine);
  	  }
  	  else if(day>20 && day<=30)
  	  {
  		  System.out.println("You should pay fine rs.100");
  		  fine=100;
  		  System.out.println("fine"+fine);
  	  }
  	  else if(day>30)
  	  {
  		  System.out.println("You should pay fine rs.10 per day");
  		  fine=10*day;
  	  }       	       
  	     fineAmount=fine+fineAmount;
  	     System.out.println("Total Fine:"+fineAmount);
  	  }
  	  else 
  	  {
  		  System.out.println("Error");
  		  libraryDetails.fineDetails();
  	  }
	}
	@Override
	public LocalDate todayDate() {
		LocalDate today =  LocalDate.now();             
  	    LocalDate bookReturnDate= today.plusDays(day); 
  	    System.out.println("Book taken date:"+today);
  	    System.out.println("Book will return on: "+bookReturnDate);
		return bookReturnDate;
	}
	@Override
	public LocalDate returnDate() {
		LocalDate bookReturnDate=LocalDate.now();
  	    LocalDate bookTakenDate=bookReturnDate.minusDays(day);
  	    System.out.println("Book Taken Date:"+bookTakenDate);
  	    System.out.println("Book Return Date:"+bookReturnDate);
		return bookTakenDate;
	}
	@Override
	public char nextBookDetails() {
	  Scanner sc=new Scanner(System.in);
  	  System.out.println("********************************");
  	  System.out.println("do you want any other books?(Y/N):");
  	  nextBook=sc.next().charAt(0);
  	  if(nextBook=='Y' || nextBook=='y' || nextBook=='n' || nextBook=='N')
  	  {
  	  if(nextBook=='Y' || nextBook=='y')
  	  {
  		  System.out.println("now you can select next book:");
		  libraryDetails.category();
		  libraryDetails.noOfBooksTakenDetails();
		  libraryDetails.fineDetails();
		  libraryDetails.nextBookDetails();   
  	  }
  	  else if(nextBook=='N'|| nextBook=='n')
  	  {
  		  System.out.println("Thank you for visiting our library");
  		  System.out.println("********************************");
  	  }
  	  }
  	  else
  	  {
  		  System.out.println("please enter the correct input");
  		  libraryDetails.nextBookDetails();
  	  }
  	  return nextBook;
	}
	@Override
	public void details() {
		pojo.setUser(libraryDetails.role());
		//pojo.setUser(user);
		//pojo.setUser(user);
		pojo.setLibraryCardNumber(libraryCardNumber);
		pojo.setPurpose(purpose);
		pojo.setBookCategory(bookCategory);
		pojo.setBookName(bookName);
		pojo.setNoOfBooksTaken(noOfBooksTaken);
		pojo.setNextBook(nextBook);
		//System.out.println("Type of user:"+pojo.getUser());
		System.out.println("Type of user:"+pojo.getUser());
		System.out.println("Library Card Number:"+pojo.getLibraryCardNumber());
		System.out.println("Purpose:"+pojo.getPurpose());
		System.out.println("Book Category:"+pojo.getBookCategory());
		System.out.println("Book Name:"+pojo.getBookName());
		System.out.println("No of Books Taken:"+pojo.getNoOfBooksTaken());
		System.out.println("NextBook:"+pojo.getNextBook());	
	}
	public boolean libraryLogin() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = JdbcConnection.getConnection();
        System.out.println(connection);
        libraryDetails.details();
        ArrayList existingList = new ArrayList();
        
        pojo.setUser(user);
        pojo.setLibraryCardNumber(libraryCardNumber);
		pojo.setUserPassword(userPassword);
        pojo.setPurpose(purpose);
        pojo.setBookCategory(bookCategory);
        pojo.setBookName(bookName);
        pojo.setNoOfBooksTaken(noOfBooksTaken);
        String login="select LibraryCardNumber from library";
        PreparedStatement prepareStatement=connection.prepareStatement(login);
        ResultSet resultSet = prepareStatement.executeQuery();
        
		while(resultSet.next())
        {
           // int id = resultSet.getInt(stringToInt);
            existingList.add(login);
        }
        if(existingList.contains(pojo.getLibraryCardNumber()))
        {
             System.out.println("login already exist");
             return true;
        }
        else
        {
            System.out.println("Card number available for login");
            String insertStatement = "insert into library(user,libraryCardNumber,userPassword,purpose,bookCategory,bookName,noOfBooksTaken)values(?,?,?,?,?,?,?)";
            PreparedStatement prepareStatement1 = connection.prepareStatement(insertStatement);
            prepareStatement1.setInt(1,pojo.getUser());
            prepareStatement1.setInt(2,pojo.getLibraryCardNumber());
            prepareStatement1.setString(3,pojo.getUserPassword());
            prepareStatement1.setInt(4,pojo.getPurpose());
            prepareStatement1.setString(5,pojo.getBookName());
            prepareStatement1.setInt(6,pojo.getBookCategory());
            prepareStatement1.setInt(7,pojo.getNoOfBooksTaken());
            int rows = prepareStatement1.executeUpdate();
            System.out.println("inserted"+rows);
            return false;
        }     
	}

  public boolean update() throws ClassNotFoundException, SQLException {
	Connection connection = JdbcConnection.getConnection();
    System.out.println(connection);
    java.sql.Statement statement = connection.createStatement();
    String update = "update library set user=1,BookCategory=3 where libraryCardNumber=23412";
    statement.executeUpdate(update);
    System.out.println("Updated Successfully.");
    return false; //update
  }
  
  public boolean delete() throws ClassNotFoundException, SQLException {
	Connection connection = JdbcConnection.getConnection();
	System.out.println(connection);
    java.sql.Statement statement = connection.createStatement();
    String delete = "delete from library where noOfBooksTaken=4";
    statement.executeUpdate(delete);
    System.out.println("Deleted successfully.");
    return false;
  }
}

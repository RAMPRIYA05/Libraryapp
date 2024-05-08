package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.chainsys.model.LibraryDetailsPojo;
import com.chainsys.util.JdbcConnection;

public class LibraryDetailsImplementation implements LibraryDetailsInterface{
	static LibraryDetailsImplementation libraryDetails = new LibraryDetailsImplementation();
    static LibraryDetailsPojo pojo=new LibraryDetailsPojo();
	public static int bookCount;
	public static int purpose;
	public static String userPassword1;
	public static int age;
	public static  int cardNumber2;
	public static String userName;
	static int userPhoneNumber;
	public static int membershipPackage;
	public static int newLibraryCardNumber;
	public static int day;
	public static String book;
	static int fineAmount;
    static int fine;
    static int libraryCardNumber;
    static String bookCategory;
    static int noOfBooksTaken;
    static int user;
    static String bookName;
    static char nextBook;
    static String userPassword;
    static String newUserPassword;
    static String option;
	public String userPassword2;
	private int libraryCardNumber1;
	private int libraryCardNumber2;
	//public ArrayList existingList;
	//public ArrayList existingPassword;
    //static String existingList;
    @Override
	public String name() {
    	//try {
        Scanner sc=new Scanner(System.in);
        System.out.println("User Name:");
        userName=sc.next();
        Pattern p=Pattern.compile("[A-Z][a-z]");
        Matcher m=p.matcher(userName);
        if(m.find())
        {	
           System.out.println(userName);
        	//return userName;
        }
        else{
        	System.out.println("Error");
          libraryDetails.name();
        }
      
//    	catch(InputMismatchException e)
//    	{
//    		System.out.println(e);
//    		libraryDetails.name();
//    	}
		return userName;
	}
	
	
//    @Override
//	public int phoneNumber() {
//    	 Scanner sc=new Scanner(System.in);
//         System.out.println("User phone number:");
//         userPhoneNumber=sc.nextInt();
//         String number=Integer.toString(userPhoneNumber);
//         Pattern p=Pattern.compile("^[0-9]{10}*$");
//         Matcher m=p.matcher(number);
//         if(m.find())
//         {	//int  numberInt= Integer.parseInt(number);
//         	return userPhoneNumber;
//         }
//         else{
//         	System.out.println("Error");
//         	libraryDetails.phoneNumber();
//         }
// 		 return userPhoneNumber;
//	}
    @Override
	public int cardNumber() {
    	try {
		    Scanner sc=new Scanner(System.in);
	        System.out.println("Library CardNumber Of User:");
	        libraryCardNumber=sc.nextInt();
//	        String cardNumber=Integer.toString(libraryCardNumber);
//	        Pattern p=Pattern.compile("^[0-9]{4}$");
//	        Matcher m=p.matcher(cardNumber);
//	        if(m.find())
//	        {	
	        	System.out.println(libraryCardNumber);
	        	//libraryDetails.libraryPassword();
	//        }
//	        else
//	        {
//	        	System.out.println("Error");
//	        	System.out.println("card number holds 4 digits");
//	    	    libraryDetails.cardNumber();
//	    	    
//	        }
    	}
    	catch(InputMismatchException e){
    		System.out.println(e);
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
   	       //System.out.println("Correct password");
   	       System.out.println(userPassword);
   	       System.out.println("Signed up");
   	       System.out.println("**********");
   	       //libraryDetails.purpose();
         }
         else 
         {
        	System.out.println("error");
   	        System.out.println("Please enter atleast one uppercase,digit,lowercase,special character,atleast 8 characters & atmost 20 characters");
            libraryDetails.libraryPassword();
         }
		return userPassword;
	}
    public int user() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("User type:1.signUp 2.logIn");
    	int userType=sc.nextInt();
    	if(userType==1) {
    		libraryDetails.signUp();
    	}
    	else if(userType==2){
    		libraryDetails.logIn();
    	}
		return userType;
		
    	
    }
	@Override
	public String signUp() {
		libraryDetails.name();
		//libraryDetails.phoneNumber();
		libraryDetails.role();
		libraryDetails.cardNumber();
		libraryDetails.libraryPassword();
		System.out.println("Successfully signed up");
		libraryDetails.logIn();
		return userPassword;
	}

	@Override
	public String  logIn() {
//		libraryDetails.cardNumber();
//		libraryDetails.libraryPassword();
//		System.out.println("Successfully logged in");
//		return userPassword;
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Library CardNumber Of User:");
	     libraryCardNumber1=sc.nextInt();
	     String cardNumber1=Integer.toString(libraryCardNumber1);
	     Pattern p=Pattern.compile("^[0-9]{4}$");
	     Matcher m=p.matcher(cardNumber1);
	     if(m.find())
	     {	
	        	System.out.println(libraryCardNumber1);
	        	//libraryDetails.libraryPassword();
	        	if(libraryCardNumber==libraryCardNumber1)
	        	{
	        		System.out.println("Enter the password:");
		       	    userPassword1=sc.next();
		            Pattern p1=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
		            Matcher m1=p1.matcher(userPassword1);
		            if(m.matches())
		            {
		      	       System.out.println(userPassword1);
		      	       if(userPassword.equals(userPassword1)) 
		      	       {
		      	    	   System.out.println("Success fully logged in");
		      	       }
		      	       else 
		      	       {
		      	    	   System.out.println("invalid password");
		      	    	   libraryDetails.logIn();
		      	       }
		            }
		            else 
		            {
		           	System.out.println("error");
		      	        System.out.println("Please enter atleast one uppercase,digit,lowercase,special character,atleast 8 characters & atmost 20 characters");
		               libraryDetails.logIn();
		            }
	        	}
	        	else {
	        		System.out.println("invalid library Card Number");
	        		libraryDetails.logIn();
	        	}
	     }
	     else
	     {
	        	System.out.println("Error");
	        	System.out.println("card number holds 4 digits");
	    	    libraryDetails.logIn();    
	     }
		
		
		 return userPassword1; 
		
	}


    
	@Override
	public int role() 
	{
	 Scanner sc=new Scanner(System.in);

       		 System.out.println("you are non membership of our library.");
       		 System.out.println("You can read books only inside the library.");
       		 System.out.println("if you want to take book to home,you should be a member of our library");
       		 System.out.println("are you willing to apply for membership?(Y/N):");
       		 char apply=sc.next().charAt(0);
//       	  String applyString = Character.toString(apply); 
//        	  Pattern p=Pattern.compile("^[y,n,Y,N]$");
//        	  Matcher m=p.matcher(applyString);
//        	  if(m.find()) 
//        	  {

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
           		 Pattern p1=Pattern.compile("^(0?[1-9]|[1-9][0-9]|100)$");
           	     Matcher m1=p1.matcher(ageString);
           	     if(m1.find())
           	     {
       			 if(age>=18 && age<=60)
       			 {
       			     System.out.println("we have use different type of membership package.");
       			     System.out.println("package option:1.one year=200 2.two year=350 3.three year=550 4.five year=900");
       			     membershipPackage=sc.nextInt();
       			     if(membershipPackage>0 && membershipPackage<=4)
       			     //if(membershipPackage==1||membershipPackage==2||membershipPackage==3||membershipPackage==4)
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
       			     else {
       			    	 System.out.println("Error");
       			    	 libraryDetails.role();
       			     }
       			     
       			  }
       			  else if((age>=10 && age<18) || age>60)
       			  {
       				 System.out.println("We give offers for minor and senoir citizen.");
       				 System.out.println("package option:1.one year=180 2.two year=330 3.three year=530 4.five year=870");
       				 membershipPackage=sc.nextInt();
       				 if(membershipPackage>0 && membershipPackage<=4)
       				 // if(membershipPackage==1||membershipPackage==2||membershipPackage==3||membershipPackage==4)
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
			return membershipPackage;
       		}

	@Override
	public int purpose() {
   	 Scanner sc=new Scanner(System.in);
 	
   	 System.out.println("Types of person in library:");
   	 System.out.println(" 1.Booktaken\n 2.BookReturn\n 3.Bookreaders inside a library");
   	 System.out.println("Choose anyone option(1/2/3):");
   	 purpose=sc.nextInt();
   	 //sc.nextLine();
   	 System.out.println("purpose:"+purpose);
   	 String purposeString=Integer.toString(purpose);
   	 Pattern p=Pattern.compile("^[1-3]+$");
     Matcher m=p.matcher(purposeString);
     if(m.find())
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
//   		 libraryDetails.category();
//   		 libraryDetails.noOfBooksTakenDetails();
   		 System.out.println("Name of the category:");
   		//sc.nextLine();
   		 bookCategory=sc.next();
   		 System.out.println("Book Category:"+bookCategory);
   		 System.out.println("Name of the book:");
  		 bookName=sc.next();
  		 System.out.println("Book Name:"+bookName);
  		 System.out.println("Number of books return:");
  		 noOfBooksTaken=sc.nextInt();
  		 System.out.println("No of Books:"+noOfBooksTaken);
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
	   	 bookCategory=sc.nextLine();
	   	 Pattern p=Pattern.compile("^[1-4]$");
	     Matcher m=p.matcher(bookCategory);
	     if(m.find())
	     {
	    	 int bookCategoryInt = Integer.parseInt(bookCategory);
	   	 switch(bookCategoryInt)
	   	 {
	   		 case 1:
	   			 System.out.println(" Historical Fiction:\n 1.Pachinko\n 2.All the Light We Cannot See\n 3.The Nightingale\n");
	   			 System.out.println("Enter an option:");
	   			 book=sc.nextLine();
	   	   	     Pattern p1=Pattern.compile("^[1-4]$");
	   	         Matcher m1=p1.matcher(book);
	   	         if(m1.find())
	   	         {
	   	    	 int bookInt=Integer.parseInt(book);
	   			 if(bookInt==1)
	   			 {
	   				bookName=Integer.toString(bookInt);
   				 
   				    System.out.println("Book Name:"+bookName);
   				    bookCount=5;
   				    System.out.println("no of "+bookName+" books available are: "+bookCount); 		     
   			     }
   			     else if(bookInt==2)
   			     {
   			        bookName=Integer.toString(bookInt);
   				    System.out.println("Book Name:"+bookName); 
   			        System.out.println("This book available after 27/04/2024");
   			        System.out.println("you have to choose other book");
   			        libraryDetails.category();
   			     }
   			     else if(bookInt==3)
   			     {
   				    bookName=Integer.toString(bookInt);
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
           	   book=sc.nextLine();
           	   Pattern p2=Pattern.compile("^[1-3]$");
   	           Matcher m2=p2.matcher(book);
   	           if(m2.find())
   	           {
   	    	    int bookInt=Integer.parseInt(book);
   			    if(bookInt==1)
   			    {
   				 bookName=Integer.toString(bookInt);
   				 System.out.println("Book Name:"+bookName);
   				 bookCount=15;
   				 System.out.println("no of "+bookName+" books available are: "+bookCount); 
   			    }
   			    else if(bookInt==2)
   			    { 
   				  bookName=Integer.toString(bookInt);
   				  System.out.println("Book Name:"+bookName);
   			      System.out.println("This book available after 27/04/2024");
   			      System.out.println("you have to wait or choose other book");
   			      libraryDetails.category();
   			   }
   			   else if(bookInt==3)
   			   {   
   				 bookName=Integer.toString(bookInt);
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
   	    	 book=sc.nextLine();
          	 Pattern p3=Pattern.compile("^[1-2]$");
  	         Matcher m3=p3.matcher(book);
  	         if(m3.find())
  	         {
  	    	   int bookInt=Integer.parseInt(book);
  			   if(bookInt==1)
   			   {
  				 bookName=Integer.toString(bookInt);
   				 System.out.println("Book Name:"+bookName);
   				 bookCount=10;
   				 System.out.println("no of "+bookName+" books available are: "+bookCount); 
   			   }
   			   else if(bookInt==2)
   			   {
   				 bookName=Integer.toString(bookInt);
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
   	    	 book=sc.nextLine();
         	 Pattern p4=Pattern.compile("^[1-2]$");
 	         Matcher m4=p4.matcher(book);
 	         if(m4.find())
 	         {
 	    	     int bookInt=Integer.parseInt(book);
 			     if(bookInt==1)
			     {
 				     bookName=Integer.toString(bookInt);
			    	 System.out.println("Book Name:"+bookName);
			    	 bookCount=20;
   				     System.out.println("no of "+bookName+" books available are: "+bookCount); 
			     }
			     else if(bookInt==2)
   			     {
			    	 bookName=Integer.toString(bookInt);
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
		return book;
	}
	@Override
	public int noOfBooksTakenDetails() {
//		  Scanner sc=new Scanner(System.in);
//        System.out.println("Number of books taken by user:");
//        noOfBooksTaken=sc.nextInt();
//        String numberOfBooksTaken=Integer.toString(noOfBooksTaken);
//        Pattern p=Pattern.compile("^[0-9]*$");
//        Matcher m=p.matcher(numberOfBooksTaken);
//        if(m.find())
//        {	
        try {
//       	 if(bookCount>noOfBooksTaken && noOfBooksTaken!=0)
//       	 {
        	Scanner sc=new Scanner(System.in);
            System.out.println("Number of books taken by user:");
            noOfBooksTaken=sc.nextInt();
    	   System.out.println(noOfBooksTaken);
    	   if(bookCount>noOfBooksTaken && noOfBooksTaken!=0) {
   	 	   int remainingNoOfBooks=bookCount-noOfBooksTaken;
   	 	   System.out.println("Remaining number of books:"+remainingNoOfBooks);
   	 	   System.out.println("*******************************");
   	 	   System.out.println("How many days after you return the book?");
    	   System.out.println("If You return the book within 15 days.Then no fine");
    	   }
//       	 }
       	 else
       	 {
       		 System.out.println("enter no of books less than book available");
       		 libraryDetails.noOfBooksTakenDetails();
       	 }
        }
        catch(InputMismatchException e)
        {
        	System.out.println(e);
        	libraryDetails.noOfBooksTakenDetails();
        	
        }
		//	}
     //   else
//        {
//    	    System.out.println("Error");
//    	    libraryDetails.noOfBooksTakenDetails();
//        }
	    return noOfBooksTaken;
	}
	@Override
	public int fineDetails() {
	  Scanner sc=new Scanner(System.in);
  	  System.out.println("Please enter the days.It will show fine is applicable or not.");
  	  day=sc.nextInt();
  	  String dayString=Integer.toString(day);
  	  Pattern p=Pattern.compile("^[0-9]*$");
  	  Matcher m=p.matcher(dayString);
  	  if(m.find()) 
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
	return fine;
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
  	  String nextBookString = Character.toString(nextBook); 
  	  Pattern p=Pattern.compile("^[y,n,Y,N]$");
  	  Matcher m=p.matcher(nextBookString);
  	  if(m.find()) 
  	  {
//  	  if(nextBook=='Y' || nextBook=='y' || nextBook=='n' || nextBook=='N')
//  	  {
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
		pojo.setUser(libraryDetails.user());
		pojo.setPurpose(libraryDetails.purpose());
		//pojo.setUser(user);
		pojo.setLibraryCardNumber(libraryCardNumber);
		//pojo.setPurpose(purpose);
		pojo.setBookCategory(bookCategory);
		pojo.setBookName(bookName);
		pojo.setNoOfBooksTaken(noOfBooksTaken);
		pojo.setNextBook(nextBook);
		System.out.println("Type of user:"+pojo.getUser());
		System.out.println("Type of purpose:"+pojo.getPurpose());
		System.out.println("Library Card Number:"+pojo.getLibraryCardNumber());
		//System.out.println("Purpose:"+pojo.getPurpose());
		System.out.println("Book Category:"+pojo.getBookCategory());
		System.out.println("Book Name:"+pojo.getBookName());
		System.out.println("No of Books Taken:"+pojo.getNoOfBooksTaken());
		System.out.println("NextBook:"+pojo.getNextBook());	
	}
	public boolean libraryLogin() throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Connection connection = JdbcConnection.getConnection();
		ArrayList existingList = new ArrayList();
        //System.out.println(connection);
        System.out.println("Login");
        System.out.println("Enter the library card number:");
        int libraryCardNumber2=sc.nextInt();
        String cardNumber1=Integer.toString(libraryCardNumber2);
        Pattern p=Pattern.compile("^[0-9]{4}$");
        Matcher m=p.matcher(cardNumber1);
        if(m.find())
        {
        	cardNumber2=Integer.parseInt(cardNumber1);
        	String libraryCardNumberNew="select libraryCardNumber from library";
        	PreparedStatement prepare=connection.prepareStatement(libraryCardNumberNew);
        	ResultSet resultSet=prepare.executeQuery();
        
			while(resultSet.next()) 
        	{
        		int number=resultSet.getInt(1);
        		
				existingList.add(number);
        	}
        	if(existingList.contains(cardNumber2)) {
        		libraryDetails.libraryLogInPassword();
        	}
        	else {
        		System.out.println("Enter the signed up library Card Number");
        		libraryDetails.libraryLogin();
        	}
        	
        }
		return false;
	}
	@Override
	public void libraryLogInPassword() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Connection connection = JdbcConnection.getConnection();
		ArrayList existingPassword = new ArrayList();
		System.out.println("Enter user password:");
	    userPassword2=sc.next();
		Pattern p2=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
        Matcher m2=p2.matcher(userPassword2);
        if(m2.find())
        {
		   String userPasswordNew="select userPassword from library where libraryCardNumber=?";
		   PreparedStatement prepare=connection.prepareStatement(userPasswordNew);
		 
		prepare.setInt(1,cardNumber2);
		ResultSet resultSet=prepare.executeQuery();
		while(resultSet.next())
		{
            String passWord = resultSet.getString(1); 
			existingPassword.add(passWord);
		}
		if(existingPassword.contains(userPassword2))   {
			System.out.println("***********************");
			System.out.println("Login Success Fully");
		}
		String insertStatement="insert into librarydetails(siNo,libraryCardNumber,userPassword,purpose,bookCategory,bookName,noOfBooksTaken,fine)values(?,?,?,?,?,?,?,?)";
		PreparedStatement prepareStatement1=connection.prepareStatement(insertStatement);
		pojo.setLibraryCardNumber(libraryCardNumber);
		pojo.setUserPassword(userPassword);
		pojo.setPurpose(libraryDetails.purpose());
		pojo.setBookCategory(bookCategory);;
		pojo.setBookName(bookName);
		pojo.setNoOfBooksTaken(noOfBooksTaken);
		pojo.setFine(fine);
		//pojo.setNextBook(libraryDetails.nextBookDetails());
		prepareStatement1.setInt(1,pojo.getSiNo());
		prepareStatement1.setInt(2, pojo.getLibraryCardNumber());
	    prepareStatement1.setString(3, pojo.getUserPassword());
	    prepareStatement1.setInt(4,pojo.getPurpose());
	    prepareStatement1.setString(5,pojo.getBookCategory());
	    prepareStatement1.setString(6,pojo.getBookName());
	    prepareStatement1.setInt(7,pojo.getNoOfBooksTaken());
	    prepareStatement1.setInt(8,pojo.getFine());
	    //prepareStatement1.setCharacterStream(8,pojo.getNextBook());
	    
		int rows= prepareStatement1.executeUpdate();
		System.out.println("Exit successfully");
	}
        else {
        	System.out.println("invalid password");
        	libraryDetails.libraryLogInPassword();
        }
	}
	public boolean enterType() throws ClassNotFoundException, SQLException{
		Scanner sc=new Scanner(System.in);
		Connection connection = JdbcConnection.getConnection();
        System.out.println(connection);
        ArrayList existingList = new ArrayList();
        System.out.println("1.log in\n 2.sign up\n");
		int type=sc.nextInt();
        switch(type)
        {
        case 1:
        	System.out.println(libraryDetails.libraryLogin());
        	break;
        
        case 2:
        	pojo.setUserName(libraryDetails.name());
    		pojo.setMembershipPackage(libraryDetails.role());  
    		pojo.setAge(age);
    		pojo.setLibraryCardNumber(libraryDetails.cardNumber());
    		pojo.setUserPassword(libraryDetails.libraryPassword());
           // pojo.setUserPassword1(libraryDetails.logIn());
    		//pojo.setPurpose(libraryDetails.purpose());
    		//pojo.setBookCategory(bookCategory);
    		//pojo.setBookName(book);
    		//pojo.setNoOfBooksTaken(noOfBooksTaken);
    		//pojo.setNextBook(nextBook);
    		
    		System.out.println("Name:"+pojo.getUserName());
    		System.out.println("MembershipPackage:"+pojo.getMembershipPackage());
    		System.out.println("Age:"+pojo.getAge());
    		
    		System.out.println("Library Card Number:"+pojo.getLibraryCardNumber());
    		System.out.println("user password:"+pojo.getUserPassword());
//    		System.out.println("log in user password:"+pojo.getUserPassword1());
//    		System.out.println("Purpose:"+pojo.getPurpose());
//    		System.out.println("Book Category:"+pojo.getBookCategory());
//    		System.out.println("Book Name:"+pojo.getBookName());
//    		System.out.println("No of Books Taken:"+pojo.getNoOfBooksTaken());
//    		System.out.println("NextBook:"+pojo.getNextBook());	
      	    
    		pojo.setLibraryCardNumber(libraryCardNumber);
            pojo.setUserPassword(userPassword);
            pojo.setAge(age);
            pojo.setMembershipPackage(membershipPackage);
            pojo.setUserName(userName);
    	
      	    String register="select libraryCardNumber from library";
      	    PreparedStatement prepareStatement2=connection.prepareStatement(register);
            ResultSet resultSet1= prepareStatement2.executeQuery();
            while(resultSet1.next())
            {
          	  libraryCardNumber=resultSet1.getInt(1);
          	  existingList.add(libraryCardNumber);
            }
            if(existingList.contains(pojo.getLibraryCardNumber()))
          	  
            {   	 
          	System.out.println("Already registered");  
          	  
            }
            else
            {
          	  String registerStatement="insert into library(siNo,libraryCardNumber,userPassword,age,membershipPackage,userName)values(?,?,?,?,?,?)";
          	  PreparedStatement prepareStatement3=connection.prepareStatement(registerStatement);
               
               //prepareStatement3.setInt(1,pojo.getAge());
                //prepareStatement3.setInt(2,pojo.getMembershipPackage());
          	  prepareStatement3.setInt(1,pojo.getSiNo());
              prepareStatement3.setInt(2,pojo.getLibraryCardNumber());
              prepareStatement3.setString(3,pojo.getUserPassword());
              prepareStatement3.setInt(4,pojo.getAge());
              prepareStatement3.setInt(5,pojo.getMembershipPackage());
              prepareStatement3.setString(6,pojo.getUserName());
              int rows = prepareStatement3.executeUpdate();
              System.out.println("register"+rows);
              libraryDetails.libraryLogin();
            }
      	return false;
        }
		return false;
		

	}
//  public boolean update() throws ClassNotFoundException, SQLException {
//	Connection connection = JdbcConnection.getConnection();
//    System.out.println(connection);
//    java.sql.Statement statement = connection.createStatement();
//    String update = "update library set noOfBooksTaken=1 where libraryCardNumber=55612";
//    statement.executeUpdate(update);
//    System.out.println("Updated Successfully.");
//    return false; //update
//  }
//  
//  public boolean delete() throws ClassNotFoundException, SQLException {
//	Connection connection = JdbcConnection.getConnection();
//	System.out.println(connection);
//    java.sql.Statement statement = connection.createStatement();
//    String delete = "delete from library where noOfBooksTaken=4";
//    statement.executeUpdate(delete);
//    System.out.println("Deleted successfully.");
//    return false;
//  }


	
	

	
	

	

//	@Override
//	public boolean retrive() throws ClassNotFoundException, SQLException {
//		Connection connection = JdbcConnection.getConnection();
//		System.out.println(connection);
//		java.sql.Statement statement = connection.createStatement();
//		
//		return false;
//	}
}


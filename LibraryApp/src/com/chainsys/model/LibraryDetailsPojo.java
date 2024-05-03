package com.chainsys.model;

public class LibraryDetailsPojo {
	public int user;
    public int noOfBooksTaken;
    public int libraryCardNumber;
    public String todayDate;
    public String category;
    public String userPassword;
    public String bookName;
    public int bookCategory;
    public char nextBook;
    public int purpose;
    public String returnDate;
    
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public int getNoOfBooksTaken() {
		return noOfBooksTaken;
	}
	public void setNoOfBooksTaken(int noOfBooksTaken) {
		this.noOfBooksTaken = noOfBooksTaken;
	}
	public int getLibraryCardNumber() {
		return libraryCardNumber;
	}
	public void setLibraryCardNumber(int libraryCardNumber) {
		this.libraryCardNumber = libraryCardNumber;
	}
	public String getTodayDate() {
		return todayDate;
	}
	public void setTodayDate(String todayDate) {
		this.todayDate = todayDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(int bookCategory) {
		this.bookCategory = bookCategory;
	}
	
	
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public char getNextBook() {
		return nextBook;
	}
	public void setNextBook(char nextBook) {
		this.nextBook = nextBook;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPurpose() {
		return purpose;
	}
	public void setPurpose(int purpose) {
		this.purpose = purpose;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "LibraryDetailsPojo [user=" + user + ", noOfBooksTaken=" + noOfBooksTaken + ", libraryCardNumber="
				+ libraryCardNumber + ", todayDate=" + todayDate + ", category=" + category + ", userPassword="
				+ userPassword + ", bookName=" + bookName + ", bookCategory=" + bookCategory + ", nextBook=" + nextBook
				+ ", purpose=" + purpose + ", returnDate=" + returnDate + "]";
	

}
}
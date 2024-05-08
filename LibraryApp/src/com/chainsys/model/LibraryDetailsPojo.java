package com.chainsys.model;

public class LibraryDetailsPojo {
	public int user;
	public String userName;
    public int noOfBooksTaken;
    public int libraryCardNumber;
    public int libraryCardNumber1;
    public String todayDate;
    public String category;
    public String userPassword1;
    public String userPassword;
    public String bookName;
    public String bookCategory;
    public char nextBook;
    public int purpose;
    public String returnDate;
    public int age;
    public int membershipPackage;
    public int newLibraryCardNumber;
    public String newUserPassword;
    public int siNo;
    public int fine;
    
	
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	public int getLibraryCardNumber1() {
		return libraryCardNumber1;
	}
	public void setLibraryCardNumber1(int libraryCardNumber1) {
		this.libraryCardNumber1 = libraryCardNumber1;
	}
	public String getUserPassword1() {
		return userPassword1;
	}
	public void setUserPassword1(String userPassword1) {
		this.userPassword1 = userPassword1;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getSiNo() {
		return siNo;
	}
	public void setSiNo(int siNo) {
		this.siNo = siNo;
	}
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
	
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
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
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMembershipPackage() {
		return membershipPackage;
	}
	public void setMembershipPackage(int membershipPackage) {
		this.membershipPackage = membershipPackage;
	}
	
	public int getNewLibraryCardNumber() {
		return newLibraryCardNumber;
	}
	public void setNewLibraryCardNumber(int newLibraryCardNumber) {
		this.newLibraryCardNumber = newLibraryCardNumber;
	}
	
	public String getNewUserPassword() {
		return newUserPassword;
	}
	public void setNewUserPassword(String newUserPassword) {
		this.newUserPassword = newUserPassword;
	}
	@Override
	public String toString() {
		return "LibraryDetailsPojo [user=" + user + ", userName=" + userName + ", noOfBooksTaken=" + noOfBooksTaken
				+ ", libraryCardNumber=" + libraryCardNumber + ", libraryCardNumber1=" + libraryCardNumber1
				+ ", todayDate=" + todayDate + ", category=" + category + ", userPassword1=" + userPassword1
				+ ", userPassword=" + userPassword + ", bookName=" + bookName + ", bookCategory=" + bookCategory
				+ ", nextBook=" + nextBook + ", purpose=" + purpose + ", returnDate=" + returnDate + ", age=" + age
				+ ", membershipPackage=" + membershipPackage + ", newLibraryCardNumber=" + newLibraryCardNumber
				+ ", newUserPassword=" + newUserPassword + ", siNo=" + siNo + ", fine=" + fine + "]";
	}
	

}
package com.chainsys.model;

public class AdminLibraryPojo {
	public int siNo;
	public String cardNumberAdmin;
	public String passwordAdmin;
	public String bookCategory;
	public String bookName;
	public int noOfBooks;
	public String authorName;
	public int bookNumber;

	public AdminLibraryPojo(){
		
	}

	public int getSiNo() {
		return siNo;
	}

	public void setSiNo(int siNo) {
		this.siNo = siNo;
	}

	public String getCardNumberAdmin() {
		return cardNumberAdmin;
	}

	public void setCardNumberAdmin(String cardNumberAdmin) {
		this.cardNumberAdmin = cardNumberAdmin;
	}

	public String getPasswordAdmin() {
		return passwordAdmin;
	}

	public void setPasswordAdmin(String passwordAdmin) {
		this.passwordAdmin = passwordAdmin;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	@Override
	public String toString() {
		return "AdminLibraryPojo [siNo=" + siNo + ", cardNumberAdmin=" + cardNumberAdmin + ", passwordAdmin="
				+ passwordAdmin + ", bookCategory=" + bookCategory + ", bookName=" + bookName + ", noOfBooks="
				+ noOfBooks + ", authorName=" + authorName + ", bookNumber=" + bookNumber + "]";
	}

	
	
	
}

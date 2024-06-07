package com.system.management.library;

import java.util.ArrayList;
import java.util.List;

/*
 * Member Class:
Attributes: String name, String memberId, List<Book> issuedBooks
Methods: Constructors, getters, setters, and methods to issue and return books.
 */
public class Member {
	private String name;
	private String memberId;
	private List<Book> issuedBooks ;
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId =memberId;
		this.issuedBooks = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public List<Book> getIssuedBooks() {
		return issuedBooks;
	}

	public void setIssuedBooks(List<Book> issuedBooks) {
		this.issuedBooks = issuedBooks;
	}
	public void issueBooks(Book book) {
		issuedBooks.add(book);
		book.setIssued(true);;
	}
	public void returnBooks(Book book) {
		issuedBooks.remove(book);
		book.setIssued(false);
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", memberId=" + memberId + ", issuedBooks=" + issuedBooks + "]";
	}
	
}

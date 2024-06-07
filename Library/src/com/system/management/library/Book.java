package com.system.management.library;

/*
 * Book Class:
Attributes: String title, String author, String ISBN, boolean isIssued
Methods: Constructors, getters, setters, and a toString() method to display book details.
 */
public class Book {
	private String title;
	private String author;
	private String ISBN;
	private boolean isIssued;
	
	public Book(String title, String author, String ISBN, boolean isIssued) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.isIssued = isIssued;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public boolean isIssued() {
		return isIssued;
	}

	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", isIssued=" + isIssued + "]";
	}
	
}

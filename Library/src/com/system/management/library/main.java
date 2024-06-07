package com.system.management.library;

/*
 * Library Management System
Problem Statement:
You are required to design a simple Library Management System using Object-Oriented Programming (OOP) principles in Java. The system should be able to:

Add Books to the Library
Register Members
Issue Books to Members
Return Books
Display Books currently issued by a Member
Display all Books in the Library

Classes and Relationships:
Book: Represents a book with attributes like title, author, ISBN, and a boolean to indicate if it is issued or not.
Member: Represents a library member with attributes like name, member ID, and a list of issued books.
Library: Represents the library with attributes like a list of books and a list of members.

Requirements:
Book Class:
Attributes: String title, String author, String ISBN, boolean isIssued
Methods: Constructors, getters, setters, and a toString() method to display book details.

Member Class:
Attributes: String name, String memberId, List<Book> issuedBooks
Methods: Constructors, getters, setters, and methods to issue and return books.

Library Class:
Attributes: List<Book> books, List<Member> members
Methods:
void addBook(Book book): Adds a book to the library.
void registerMember(Member member): Registers a new member.
void issueBook(String ISBN, String memberId): Issues a book to a member.
void returnBook(String ISBN, String memberId): Returns a book from a member.
List<Book> getBooksIssuedByMember(String memberId): Displays books issued by a member.
void displayAllBooks(): Displays all books in the library.
 */

public class main {

	public static void main(String[] args) {
		Library library = new Library();
		
		Book book1 = new Book("Java", "java author", "123-123", false);
		Book book2 = new Book("OOPS", "OOPS author", "123-456", false);
		
		library.addBook(book1);
		library.addBook(book2);
		
		Member member1 = new Member("Sumesh", "M001");
		Member member2 = new Member("Suresh", "M002");
		
		library.issueBook("123-123", "M001");
		System.out.println(library.getBooksIssuedByMember("M001"));
		
		library.DisplayAllBooks();
		

	}

}

package com.system.management.library;


import java.util.ArrayList;
import java.util.List;

/*
 * Library Class:
Attributes: List<Book> books, List<Member> members
Methods:
void addBook(Book book): Adds a book to the library.
void registerMember(Member member): Registers a new member.
void issueBook(String ISBN, String memberId): Issues a book to a member.
void returnBook(String ISBN, String memberId): Returns a book from a member.
List<Book> getBooksIssuedByMember(String memberId): Displays books issued by a member.
void displayAllBooks(): Displays all books in the library.
 */
public class Library {
	private List<Book> books = new ArrayList<>();
	private List<Member> members = new ArrayList<>();
	
	public void addBook(Book book) {
		books.add(book);
	}
	public void registerMember(Member member) {
		members.add(member);
	}
	public void issueBook(String ISBN, String memberId) {
		Book book = books.stream().filter(b -> b.getISBN() == ISBN).findFirst().orElse(null);
		Member member = members.stream().filter(m -> m.getMemberId() == memberId).findFirst().orElse(null);
		
		if(book != null && member != null && !book.isIssued()) {
			member.issueBooks(book);
			System.out.println("Book issued successfully");
		}
		else {
			System.out.println("Book could not be issued!");
		}
	}
	
	public void returnBook(String ISBN, String memberId) {
		Book book = books.stream().filter(b -> b.getISBN() == ISBN).findFirst().orElse(null);
		Member member = members.stream().filter(m -> m.getMemberId() == memberId).findFirst().orElse(null);
		if(book != null || member != null || member.getIssuedBooks().contains(book)) {
			member.returnBooks(book);
			System.out.println("Book returned successfully");
		}
		else {
			System.out.println("Book could not be returned");
		}
	}
	public List<Book> getBooksIssuedByMember(String memberId){
		Member member = members.stream().filter(m -> m.getMemberId() == memberId).findFirst().orElse(null);
		if(member != null) {
			return member.getIssuedBooks();
		}
		else {
			return null;
		}
	}
	public void DisplayAllBooks() {
		for(Book book : books) {
			System.out.println(book);
		}
	}
	
}

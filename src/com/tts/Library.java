package com.tts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
	String address;
	Library(String address) {
		this.address = address;
	}
	private void printAddress() {
		System.out.println(address);
	}
	private static void printOpeningHours() {
		System.out.println(" Libraries are open daily from 9am to 5pm. ");
}
	List<Book> firstLibrary = new ArrayList<Book>();
	List<Book> secondLibrary = new ArrayList<Book>();
	
	public void addBook(Book book) {
		firstLibrary.add(book);
	
	}
	public boolean borrowBook(String string) {
		for (Book b : firstLibrary) {
			if (!b.isBorrowed()) {
				b.rented();
				System.out.println("You successfully borrowed The Lord of the Rings");
				return true; // Book has been borrowed successfully
			} else if (b.isBorrowed()) {
				System.out.println("Sorry, this book is already borrowed.");
			} else {
				System.out.println("Sorry, this book is not in our catalog. ");
				
			}
		}
		return false; // Book has failed to be borrowed
	}	// Add the missing implementation to this class
	private void printAvailableBooks() {
		for(Book b : firstLibrary)
		System.out.println(b);{
//            System.out.println("Borrowed? " + b.isBorrowed());
        }
    }
	private boolean returnBook(String string) {
		for(Book b : firstLibrary) {
            if(b.isBorrowed()) {
                b.returned();
                return true; //Book has been returned successfully
            }
            else {
                continue;
            }
        }
        System.out.println("Cannot return book at this time, sorry!");
        return false; //Book has failed to be returned
    }

	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");

		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));

		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();

		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();

//         Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();

//
//        // Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();

		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}
}


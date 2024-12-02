package libraryPackage;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {
	public static void main(String[] args) {
        Library library = new Library();
        List<Member> members = new ArrayList<>();

        // Add sample books
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "1234567890"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "0987654321"));
        library.addBook(new Book("1984", "George Orwell", "1122334455"));

        // Add sample members
        members.add(new Member("Alice", "M001"));
        members.add(new Member("Bob", "M002"));

        // Functionality
        System.out.println("** Available Books **");
        for (Book book : library.getAvailableBooks()) {
            System.out.println(book);
        }

        System.out.println("\n** Borrowing a Book **");
        Member alice = members.get(0);
        Book bookToBorrow = library.findBookByISBN("1234567890");
        if (bookToBorrow != null && bookToBorrow.isAvailable()) {
            alice.borrowBook(bookToBorrow);
            System.out.println(alice.getName() + " borrowed: " + bookToBorrow.getTitle());
        }

        System.out.println("\n** Available Books After Borrowing **");
        for (Book book : library.getAvailableBooks()) {
            System.out.println(book);
        }

        System.out.println("\n** Borrowed Books **");
        for (Book book : library.getBorrowedBooks()) {
            System.out.println(book);
        }

        System.out.println("\n** Returning a Book **");
        alice.returnBook(bookToBorrow);
        System.out.println(alice.getName() + " returned: " + bookToBorrow.getTitle());

        System.out.println("\n** Available Books After Returning **");
        for (Book book : library.getAvailableBooks()) {
            System.out.println(book);
        }

        System.out.println("\n** Members and Their Borrowed Books **");
        for (Member member : members) {
            System.out.println(member);
        }
    }
}

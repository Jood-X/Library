package models;

public class Patron {
int patronID;
String role; // uni student / uni employee
Book[] books = new Book[3];
String returnStatus;
int fines;


void ViewBooks() {
	// In the main page, patron will see all the books sorted by year of publication
}

void Search() {
	// search for a book by title or author.
	// Display relevant book details (title, author, availability).
	// Indicate whether the book is available or currently borrowed.
}

void Borrow(Book book) {
	// search(book) first, only if available you can borrow
	// record borrowing date, due date. [max 3 books at the same time]
}

void ViewHistory() {
	// of all borrowed books
}

void ChechFineState() {
	// check all fines are paid or not (pending fines)
}

void AddComment() {
	// leave comments or reviews for any book they have borrowed. 
	// These comments will be visible to other patrons browsing the book's details.
}

void RateBook(Book book) {
	// rate books on a scale of 1 to 5
}

void ShareBookDetails() {
	// share book details (e.g., title, author, description) with other patrons within the system
}

void ViewSharedBooks() {
	// Each patron will have a dedicated view or section where they can see books shared with them by other patrons.
	// This view will include book details, and any comments shared alongside the book.
}

}

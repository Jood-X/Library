package models;

public class Book {
int transactionID;
String availability; // available for borrowing, currently borrowed, or reserved
String name;
String author;
String genere; // category
int ISBN; // code num
String discription;
int bookRate; // rated by patrons
String bookComments; // added by patrons
int borrowingPeriod; // num of days it can be borrowed, if passed it will be overdue (admin config it) 

int GenerateTransactionID() {
	// Each book should have a separate borrow transaction
	// tID in the format BT123456 
	// no two transactions receive the same transaction ID – synchronization
	return 0;
}

void BookAvailability() {
	
}

}

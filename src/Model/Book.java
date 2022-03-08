package Model;

public class Book extends Publication{
int NumPages; //amount of pages of the book
double price; //Cost of the book

//Empty constructor to create objects for default without parameters
public Book() {
	
}

//Constructor of the class
public Book(int publiNum, String title, int numPages, double price) {
	super(publiNum, title);
	NumPages = numPages;
	this.price = price;
}
//Getters and setters
public int getNumPages() {
	return NumPages;
}
public void setNumPages(int numPages) {
	NumPages = numPages;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return super.toString()  + "\nAmount of pages=" + NumPages + "\nPrice of the book=" + price ;
}



}

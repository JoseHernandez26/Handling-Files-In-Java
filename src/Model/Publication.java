package Model;

public class Publication {
int PubliNum; // Number or key of the  publication 
String title; // Name of the publication 

// Empty contructor


public Publication() {}
//method Contructor of the Publication class
public Publication(int publiNum, String title) {

	PubliNum = publiNum;
	
	this.title = title;
}
// Getters and setters of the class
public int getPubliNum() {
	return PubliNum;
}
public void setPubliNum(int publiNum) {
	PubliNum = publiNum;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
// Method toString to provide a format to the output of this class
// linking the toString from the FATHER CLASS with the reference super
@Override
public String toString() {
	return "\nPublication  " + "\nNumber of publication=" + PubliNum + "\ntitle=" + title + "\nBook";
}



	
}

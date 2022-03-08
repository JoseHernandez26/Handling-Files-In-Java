package Controller;


import java.awt.Dimension;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import Model.Book;
import View.BookList;
import View.BookWindow;

public class Controller {
	String File="BookShop.txt"	;// name of the file
	String input = "";
	LinkedList Books =new LinkedList(); //List to insert the books
	
    public BookList BL=new BookList();
	public  BookWindow BW=new BookWindow();//frame of the book application
	// Empty constructor of the controller
	public Controller()
	{}	

	// Initialization of the controller with events of the app functions
	public void initController() {
BW.initialize();
BL.initialize();	
    //BW.getBtnNewButton().addActionListener(arg0);   
    BW.getBtnExit().addActionListener(e -> exit()); //A lambda expression pointing to the exit method
    BW.getBtnNewButton().addActionListener(e -> Add()); //A lambda expression pointing to the Add method
    BW.getBtnDisplayBooks().addActionListener(e ->DisplayData());//A lambda expression that display book details
    BL.getBtnNewButton().addActionListener(e ->ExitDisplay() );
    BW.getBtnSaveBooks().addActionListener(e ->SaveFile());
    BW.getBtnRestore().addActionListener(e -> RestoreFile());
	}
	
	

private void exit() {
	JOptionPane.showMessageDialog(null, "Thanks for using the system");
	BW.frame.setVisible(false);
	
	
}
// method to allow adding data to the linkedlist
private void Add() {
if(BW.textField.getText().equals("")||BW.textField_1.getText().equals("")||BW.textField_2.getText().equals("")
		|| BW.textField_3.getText().equals(""))	{
	
	JOptionPane.showMessageDialog(null, "PLEASE, INSERT DATA");
}else {
	Book B=new Book();
	B.setPubliNum(Integer.parseInt(BW.textField.getText()));	
	B.setTitle(BW.textField_1.getText());
	B.setNumPages(Integer.parseInt(BW.textField_2.getText()));	
	B.setPrice(Double.parseDouble(BW.textField_3.getText()));
	Object Data[]= {BW.textField.getText(),BW.textField_1.getText(),BW.textField_2.getText(),
			
	BW.textField_3.getText()
	};
Books.add(B);

	BL.model.addRow(Data);	
	//ADD STRING ARRAY DATA
	JOptionPane.showMessageDialog(null, "Data Added, Successfully...");
	BW.textField.setText("");
	BW.textField_1.setText("");
	BW.textField_2.setText("");
	BW.textField_3.setText("");
	
}

 // to control the data with a data structure




	
}
private void DisplayData() {

BL.frame.setVisible(true);
}

//Make the BookList frame invisible
private void ExitDisplay() {
	BL.frame.setVisible(false);
	
}

//creating a file in memory
public void CreateFile(String FileName) {
	
File file=new File(FileName); //object of type file
try {
	PrintWriter exit=new PrintWriter(file);
	exit.close();
	JOptionPane.showMessageDialog(null, "File created");
} catch (FileNotFoundException e) {
	e.printStackTrace(System.out);
}

	
	
}

public void SaveFile() {
	if(Books.isEmpty())	{
		
		JOptionPane.showMessageDialog(null, "PLEASE, INSERT DATA");
	}else if(Books.isEmpty()==false){
		CreateFile(File) ;
		
		appendToFile(File,Books.toString());	
		
	}

	
}

public void appendToFile(String FileName,String Content) {
File file=new File(FileName);	
	try {
		PrintWriter exit=new PrintWriter(new FileWriter(file,true));
		exit.println(Content);
		exit.close();
		JOptionPane.showMessageDialog(null, "Data Saved");
		
	}catch(FileNotFoundException ex) {
		ex.printStackTrace(System.out);
		
	} catch (IOException ex) {
		// TODO Auto-generated catch block
		ex.printStackTrace(System.out);
	}
	
	
}


public void ReadFile(String FileName) {
    File File = new File(FileName);
    try {
        BufferedReader entrada = new BufferedReader(new FileReader(File));
        String lectura = null;
        while((lectura=entrada.readLine() )!= null){
        	JOptionPane.showMessageDialog(null,"Reading = " + lectura);
        	 input +=lectura + "\n";
            lectura = entrada.readLine();
        }
        entrada.close();
    } catch (FileNotFoundException ex) {
        ex.printStackTrace(System.out);
    } catch (IOException ex) {
        ex.printStackTrace(System.out);
    }
}
public void RestoreFile() {
	 ReadFile(File);
	JTextArea textArea = new JTextArea(input);
	JScrollPane scrollPane = new JScrollPane(textArea);  
	textArea.setLineWrap(true);  
	textArea.setWrapStyleWord(true); 
	scrollPane.setPreferredSize( new Dimension( 200, 400 ) ); //whatever size you want
	JOptionPane.showMessageDialog(null, 
	    scrollPane, 
	    "text file contents:", 
	    JOptionPane.PLAIN_MESSAGE);
	
}

}
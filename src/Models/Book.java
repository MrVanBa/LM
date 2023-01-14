package Models;

import java.util.ArrayList;

import model.CoppyOfBook;
import model.Publisher;

public class Book {
	private String book_ID;
	private String book_Title;
	
	public Book() {}
	
    public Book(String book_ID, String book_Title) {
        this.book_ID = book_ID;
        this.book_Title = book_Title;
    }
    
    public String getBook_ID() {
        return book_ID;
    }
    
    public void setBook_ID(String book_ID) {
    	this.book_ID = book_ID;
    }
    
    public String getBook_Title() {
        return book_Title;
    }
    
    public void setBook_Title(String book_Title) {
    	this.book_Title = book_Title;
    }
    
}

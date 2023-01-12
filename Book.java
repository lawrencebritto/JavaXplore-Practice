package Pratice;
import java.util.*;
public class Book {
	private String bookName;
	private String bookAuthor;
	private String bookPublisher;
	
	public Book(String bookName,String bookAuthor,String bookPublisher)
	{
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookPublisher=bookPublisher;
	}
	public void setBookName(String bookName)
	{
		this.bookName=bookName;
	}
	public String getBookName()
	{
		return bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
}

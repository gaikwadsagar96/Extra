/* Topic: Containment 
 * 1. Write a program to illustrate the concept of containment:
a) Create a class Author with the following:
i) Data Members: authorName,age,place.
ii) Constructor with arguments to initialize thevariables.
iii)Use getter methods to get values.
b) Create class Book with the following:
i) Data Members:name,price,Author author(object)
ii) Constructor with args to initialize the variables.
iii)Create method showDetails() to display thedetails.*/
package com.preliumprepration;
class Author
{
	String authorName;
	String  place;
	int age;
	void dispaly()
	{
		System.out.println("Author Name: "+authorName+"\n Author Place: "+place+"\n Author age: "+age);
	}
	public Author(String authorName, String place, int age) 
	{
		super();
		this.authorName = authorName;
		this.place = place;
		this.age = age;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Book
{
	String bName;
	int bPrice;
	Author author;
	public Book(String bName, int bPrice, Author author) 
	{
		super();
		this.bName = bName;
		this.bPrice = bPrice;
		this.author = author;
	}
	void showDetails()
	{
		System.out.println("Book Name:"+bName +"\n Book Price: "+bPrice);
		author.dispaly();
		//System.out.println("Author Name: "+author.getAuthorName()+"\n Author Place: "+author.getPlace()+"\n Author age: "+author.getAge());
	}
	public static void main(String[] args) 
	{
		Author author=new Author("shard tandale", "pune", 37);
		Book b=new Book("Ravan raja Rakshasancha", 300,author);
		b.showDetails();
	}

}

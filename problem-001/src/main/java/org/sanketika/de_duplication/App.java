package org.sanketika.de_duplication;


import java.util.ArrayList;
import java.util.LinkedHashSet;


/**
 * Hello world!
 *
 */
public class App 
{ 
    public static void main( String[] args )
    {
		/*ArrayList<Book> library = new ArrayList<Book>();

		library.add(new Book("1000","Outliers","Malcom Gladwell"));
    	library.add(new Book("1000","Outliers","Malcom Gladwell"));
    	library.add(new Book("1001","John Grisham","Time to Kill"));
        */

    	LinkedHashSet<Book> books=new LinkedHashSet<Book>();
    	//books.addAll(library);
		
		books.add(new Book(1000,"Outliers","Malcom Gladwell"));
    	books.add(new Book(1000,"Outliers","Malcom Gladwell"));
    	books.add(new Book(1001,"John Grisham","Time to Kill"));
		
		
    	for(Book b:books)
    		System.out.println(b);
		 
    }
}

import java.util.LinkedHashSet;
import java.util.Set;


public class app {
  public static void main(String[] args) {
    Set<Book> set = new LinkedHashSet<Book>();

    Book book1 = new Book("1000", "Outliers", "Malcon Gladwell");
    Book book2 = new Book("1000", "Outliers", "Malcon Gladwell");
    Book book3 = new Book("1001", "John Grisham", "Time to Kill");


    set.add(book1);
    set.add(book2);
    set.add(book3);

    for (Book s : set) {
      System.out.println(s.bookId + ", " + s.bookName + ", " + s.author);
    }
  }
}
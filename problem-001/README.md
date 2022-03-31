### Problem Statement

This problem expects an implementation using Java's object oriented programming concepts to remove duplicates from a `java.util.Set` 

### Pre-requisites

1. Java 8 (Change the jdk.version in pom.xml if you want to use a different java version)
2. Maven for setting up compilation and builds for the project.
3. git for committing code.
4. A Text Editor or an IDE such as Eclipse, VS Code or IntelliJ Idea.

### Objects or artifacts to be created

1. Project structure will follow Maven's project structure for java projects.
2. A sample Class and a Test Class has been provided (App.java and AppTest.java).
3. Create a Book class with String bookId, String bookName and String author fields.
4. In the App.java, create multiple Book objects with the following values.
  ```
  BookID, BookName, Author
  1000, Outliers, Malcom Gladwell
  1000, Outliers, Malcom Gladwell
  1001, John Grisham, Time to Kill
  ```
5. Add the Book objects to a java.util.Set
6. Print the contents of the java.util.Set

### Expectations

1. The java.util.Set should only contain the following contents. One of the duplicate entries with the Book ID 1000 needs to be removed.
   BookID, BookName, Author
   1000, Outliers, Malcom Gladwell
   1001, John Grisham, Time to Kill

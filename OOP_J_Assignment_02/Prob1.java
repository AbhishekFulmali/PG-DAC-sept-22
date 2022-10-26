import java.util.Scanner;



/*1. Implement a class for a “Book”. Book contains a title (a String), a list of authors (array of authors), 
number of 
pages (an integer), price (floating point number), publisher (a String) etc. Write suitable constructor 
and 
accessor/modifier methods. Implement a class for “Library”. A library contains a list of books 
 (array of Book). 
Write add (to add a book) and remove (to delete a book) methods for library. Write a main() function 
to create a 
“Library” and add five “Book” to library. Print the total price of all books.*/

class Book {

  int id;
  String title;
  String authors[];
  int pages;
  float price;
  String publisher;
  Book(){}
  Book(int id, String title,  int pages, float price, String publisher,String authors[]) {
    this.id = id;
    this.title = title;
    this.authors = authors;
    this.pages = pages;
    this.price = price;
    this.publisher = publisher;
  }

  void printBook() {
    System.out.println("----------------------");
    System.out.println("Book id is :" + id);
    System.out.println("Title of Book id is :" + title);
    System.out.println("Pages In Book :" + pages);
    System.out.println("Price of Book in Rs. :" + price);
    System.out.println("Publisher of Book :" + publisher);
    System.out.println("Authors of Book Are");
    for (int i = 0; i < authors.length; i++) {
      System.out.println(authors[i] + " ");

    }
    System.out.println();

  }

  
}

class Library {
  int n;
  int count = 0;
  Book[] arr;

  Library(int n) {
    this.n = n;
    arr = new Book[n];
  }

  void add(int id, String title,int pages,Float price,String publisher, String author[])

  {
    arr[count] = new Book(id, title, pages, price, publisher,author);
    count++;
  }

  void print(int id) {
    int i;
    for (i = 0; i < arr.length; i++) {
      if (arr[i].id == id) {
        arr[i].printBook();
        break;
      }
    }

  }
}
  public class Prob1 {

    public static void main(String args[]) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of book you want to add in Library");
      int n = sc.nextInt();
      Library l = new Library(n);
      for (int i = 0; i < n; i++) {
        System.out.println("Enter the ID of Book :");
        int id = sc.nextInt();
        System.out.println("Enter the Title of Book");
        String title = sc.nextLine();
        System.out.println("Enter the Pages in book");
        int pages = sc.nextInt();
        System.out.println("Enter the price of book");
        Float price = sc.nextFloat();
        String publisher = sc.nextLine();
        System.out.println("Enter the  Authors Of Book");
        String[] author = { "Abhishek", "Royal", "Sangharsh" };
        l.add(id,title,pages,price,publisher,author);

      }

      l.print(1);

    }

  }

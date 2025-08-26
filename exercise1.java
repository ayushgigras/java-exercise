import java.util.*;
class Book{
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}
class demoBook{
    public static void main(String args[]){
        Book books[] = new Book[3];
            books[0] = new Book("4 hours work week","Tim Ferris"); 
            books[1] = new Book("Rich Dad Poor Dad","Robert Kiyasaki"); 
            books[2] = new Book("Atomtic Habits","James Clear"); 
            for(int i=0; i<books.length;i++){
                System.out.println(books[i].title+" --> "+books[i].author);
            }


            }
}
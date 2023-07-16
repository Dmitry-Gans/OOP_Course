package Home_Work.Task_3;

import java.util.ArrayList;

public class Library{

    private ArrayList<Book> catalog;
    
    public Library(){
        this.catalog = new ArrayList<>();
    }
    public void addBook(Book book){
        catalog.add(book);
    }

    public void removeBook(Book book){
        catalog.remove(book);
    }

    public void displayAvailableBooks(){
        System.out.println("Доступные книги: \n");
        for (Book book : catalog) {
            if(book.getAvailable()){
                book.displayInfo();
            }
        }
    }

    public void searchByAuthor(String author){
        System.out.println("Книга " + author + ": ");
        for (Book book : catalog) {
            if(book.getAuthor().equals(author)){
                book.displayInfo();
            }
        } 

    }
}


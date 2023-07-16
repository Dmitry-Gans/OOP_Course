package Home_Work.Task_3;

public class Task_3 {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Жизнь", "Пушкин");
        Book book2 = new Book("Раазвитие", "Кийосаки");
        Book book3 = new Book("Айтишник", "Джобс");
        Book book4 = new Book("Стихи", "Пушкин");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.displayAvailableBooks();
        System.out.println("Найденные книги: \n");
        library.searchByAuthor("Пушкин");
    }
    
}

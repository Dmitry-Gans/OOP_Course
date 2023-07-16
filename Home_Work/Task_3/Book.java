package Home_Work.Task_3;

public class Book {
    private String title; // Название
    private String author; // Автор
    private boolean available; // Доступность

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean getAvailable(){
        return available;
    }
    
    public void displayInfo(){
        System.out.println("Названеи: " + title + "\n" +
        "Автор: " + author + "\n" + "Доступность: " + (available ? "Доступна \n" : "Не доступна \n"));
    }
}
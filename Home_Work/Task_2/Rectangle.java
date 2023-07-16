package Home_Work.Task_2;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() { // Обязательно называть так же как класс

        this.width = 0;
        this.height = 0;

    }

    public Rectangle(int width, int height) {

        this.width = width;
        this.height = height;

    }

    public void setWidth(int width) {

        this.width = width;

    }

    public int getWidth() {

        return width;

    }

    public void setHeight(int height) {

        this.height = height;

    }

    public int getHeight() {

        return height;

    }

    public int calculateArea() {

        return width * height;

    }
    
    public int calculatePerimeter(){

        return 2 * (width + height);
    }

   
    public void show(){
        System.out.printf("Ширина: %d, Высота: %d \n", width, height);
    }

}

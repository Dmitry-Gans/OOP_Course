package Seminar_4.Task_1;

public class Gen <E> {

    E ob;
    public Gen(E o){

        ob = o;

    }

    public E getOb() {
        return ob;
    }
    
    public void showType() {
        System.out.println("Тип обьекта: " + ob.getClass().getName());
    }

}

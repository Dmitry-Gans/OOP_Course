package Home_Work.Task_4;

public class printElement<T> {
    T type;

    public printElement (T type1) {
        this.type = type1;
    }

    public T getType() {
        return type;
    }
    
    public void showType() {
        System.out.println(type.getClass());
    }
}

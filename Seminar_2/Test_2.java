package Seminar_2;

public class Test_2 implements Numeric{

    int start;

    int val;

    public Test_2(){
    
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 20;
        return val;
    }

    @Override
    public void reset() {
        start = 10;
        val = 10;
    }

    @Override
    public void setNum(int x) {
       start = x;
       val = x;
    }
    
    public void promo(){
        System.out.println("Добро пожаловать!");
    }
    
    
}

package Seminar_2;

public class Test_1 implements Numeric {

    int start;

    int val;

    public Test_1(){
    
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
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

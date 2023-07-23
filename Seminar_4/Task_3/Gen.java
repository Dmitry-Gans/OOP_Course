package Seminar_4.Task_3;

import javax.crypto.spec.DESKeySpec;

public class Gen<T> {

    T ob;

    public Gen(T o) {
        ob = o;
    }
}
    
class UseTest {
    // Использование ограниченного шаблона
    static void test(Gen<? extends A> a) { // ? - любое количество унаследованное от А, так как exdens указывает верхнюю границу
    // static void test(Gen<? super A> a) // super - унаследует от последней границы, тоесть только от А
        //
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> ga = new Gen<A>(a);
        Gen<B> gb = new Gen<B>(b);
        Gen<C> gc = new Gen<C>(c);
        Gen<D> gd = new Gen<D>(d);

        test(ga);
        test(gc);
        test(gb);
        test(gd);
    }
}

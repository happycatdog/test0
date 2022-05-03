package Ex;

interface X{void a();}

abstract class Y implements X{
    public abstract void a();
    public abstract void b();
}

final class A extends Y{
    public void a(){System.out.println("Aa");}
    public void b(){System.out.println("Ab");}
    public void c(){System.out.println("Ac");}
}

final class B extends Y{
    public void a(){System.out.println("Ba");}
    public void b(){System.out.println("Bb");}
    public void c(){System.out.println("Bc");}
}

public class PolymophiTest {

    public static void main(String[] args){
        X Obj = new A();
        Y y1 = new A();
        Y y2 = new B();

        Obj.a();
        y1.a();
        y2.b();

        Y[] arrY = new Y[2];
        arrY[0] = new A();
        arrY[1] = new B();

        for(Y y:arrY){
            y.b();
        }

    }
}

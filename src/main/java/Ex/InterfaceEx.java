package Ex;

interface Ai{
    static void hello(){
        System.out.println("hello!");
    }

    private void print(String s1, String s2){
        System.out.println(s1 + " : " + s2);
    }

    default void On(){
        print("default", "On!");
    }
    void Off();
}

class A1 implements Ai{

    @Override
    public void Off() {
        System.out.println("A1 : Off!");
    }
}

class A2 implements Ai{

    @Override
    public void On() {
        System.out.println("A2 : On!");
    }

    @Override
    public void Off() {
        System.out.println("A2 : Off!");
    }
}

public class InterfaceEx {
    public static void main(String[] args){
        Ai.hello();

        A1 a1 = new A1();
        a1.On();
        a1.Off();

        A2 a2 = new A2();
        a2.On();
        a2.Off();
    }
}

package Ex;

interface Anony{
    void test();
}

class NormalClass{
    void test(){};
}
public class AnonyEx {
    public static void main(String[] args){

        Anony anony = () -> System.out.println("This is Anony");

        NormalClass nomalClass = new NormalClass(){
            public void test(){
                System.out.println("This is NormalClass");
            }

        };
        anony.test();
        nomalClass.test();

    }
}

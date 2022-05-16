package Ex;

class XXX{
    public String toString(){
        return "Class XXX";
    }
}
class YYY extends XXX{
    public String toString(){
        return "Class YYY";
    }
}
public class ObjectEx {
    static void print(Object obj){
        System.out.println(obj);
    }
    public static void main(String[] args){
        XXX x = new XXX();
        YYY y = new YYY();
        int[] c = new int[5];

        print(x);
        print(y);
        print(c);
    }
}

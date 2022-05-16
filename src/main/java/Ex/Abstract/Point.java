package Ex.Abstract;

public class Point extends Shape{

    @Override
    public String toString() {
        return "Point";
    }
    @Override
    public void draw() {
        System.out.println('+');
    }
}

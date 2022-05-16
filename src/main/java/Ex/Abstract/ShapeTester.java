package Ex.Abstract;

public class ShapeTester {
    public static void main(String[] args){
        Shape[] shapes = new Shape[4];

        shapes[0] = new Point();
        shapes[1] = new HorzLine(5);
        shapes[2] = new VertLine(3);
        shapes[3] = new Rectangle(4,3);

        for(Shape s : shapes){
            s.print();
            System.out.println();
        }
    }
}

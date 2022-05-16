package Ex.Abstract;

public class Rectangle extends Shape{
    private final int width;
    private final int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Rectangle(width:" + width + ", height:" + height + ")";
    }

    @Override
    public void draw() {
        for(int i=1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}

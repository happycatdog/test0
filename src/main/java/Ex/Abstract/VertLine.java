package Ex.Abstract;

public class VertLine extends AbstLine{
    public VertLine(int length) {
        super(length);
    }
    @Override
    public String toString(){
        return "VertLine(length:" + getLength() + ")";
    }
    @Override
    public void draw() {
        for(int i=1; i<= getLength(); i++)
            System.out.println('I');
    }
}

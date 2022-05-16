package Ex.Abstract;

public class HorzLine extends AbstLine{
    public HorzLine(int length) {
        super(length);
    }

    @Override
    public String toString(){
        return "HorzLine(length:" + getLength() + ")";
    }
    @Override
    public void draw() {
        for(int i=1; i<=getLength(); i++)
            System.out.print('-');
        System.out.println();
    }
}

package Ex.Abstract;

public abstract class AbstLine extends Shape{
    private int length;
    public AbstLine(int length){
        setLength(length);
    }
    public int getLength(){
        return length;
    }
    private void setLength(int length) {
        this.length = length;
    }
    @Override
    public String toString(){
        return "AbstLine(length:" + length +")";
    }
}

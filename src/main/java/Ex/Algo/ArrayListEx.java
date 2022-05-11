package Ex.Algo;

class ArrayList{
    private Object[] data;
    private int size;
    private int index;

    public ArrayList(){
    this.size = 1;
    this.data = new Object[this.size];
    this.index = 0;
    }
    public void add(Object obj){
        System.out.println("index: " + this.index + ", size: " + this.size
                + ", data size: " + this.data.length);
        if(this.index == this.size - 1){
            doubling();
        }
        data[this.index] = obj;
        this.index++;
    }

    private void doubling() {
        this.size = this.size * 2;
        Object[] newData = new Object[this.size];
        System.arraycopy(data, 0, newData, 0, data.length);
        this.data = newData;
        System.out.println("Doubling After -- index: " + this.index + ", size: " + this.size
                + ", data size: " + this.data.length);
    }
    public Object get(int i) throws Exception{
        if(i>this.index - 1){
            throw new Exception("ArrayIndexOutofBound");
        }else if(i<0){
            throw new Exception("Neagtive Value");
        }
        return this.data[i];
    }
    public void remove(int i) throws Exception{
        if(i>this.index - 1){
            throw new Exception("ArrayIndexOutofBound");
        }else if(i<0){
            throw new Exception("Neagtive Value");
        }
        System.out.println("data removed: " + this.data[i]);
        if (this.data.length - 1 - i >= 0)
            System.arraycopy(data, i + 1, data, i, this.data.length - 1 - i);
        this.index--;
    }

}
public class ArrayListEx {
    public static void main(String[] args) throws Exception {
        ArrayList arrayList = new ArrayList();
        for(int i=0; i< 10; i++){
            arrayList.add(String.valueOf(i));
        }
        System.out.println(arrayList.get(5));
        arrayList.remove(5);
        System.out.println(arrayList.get(5));
    }
}
package Ex.Algo;

class StringBuilderCopy{
    private char[] value;
    private int size;
    private int index;

    StringBuilderCopy(){
        size = 1;
        value = new char[size];
        index = 0;
    }
    public void append(String str){
        if(str == null)str = "null";
        int len = str.length();
        ensureCapacity(len);
        for(int i=0; i<str.length(); i++){
            value[index] = str.charAt(i);
            index++;
        }
    }
    private void ensureCapacity(int len) {
        if(index + len > size){
            size = (size + len) * 2;
            char[] newValue = new char[size];
            for(int i=0; i<value.length; i++){
                newValue[i] = value[i];
            }
            value = newValue;
        }
    }
    public String toString(){
        return new String(value, 0, index);
    }
}

public class StringBuilderEx {
    public static void main(String[] args){
        StringBuilderCopy sb = new StringBuilderCopy();
        sb.append("sung");
        sb.append(" is");
        sb.append(" pretty");

        StringBuffer sbf = new StringBuffer();
        sbf.append("Sung");
        sbf.append(" is not");
        sbf.append(" pretty");

        System.out.println(sb.toString());
        System.out.println(sbf.toString());
    }
}

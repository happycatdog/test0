package Ex.Algo;

public class StringCompressionEx {
    public static void main(String[] args){
        System.out.println(compressString("aabbbbbbcccccdd"));
        System.out.println(compressString("abcd"));
    }
    static String compressString(String str){
        String newStr = compress(str);
        return str.length() < newStr.length() ? str : newStr;
    }
    static String compress(String str){
        int cnt = 0;
        StringBuilder newString = new StringBuilder(getTotal(str));
        for(int i=0; i<str.length(); i++){
            cnt++;
            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                newString.append(str.charAt(i));
                newString.append(cnt);
                cnt=0;
            }
        }
        return newString.toString();
    }
    static int getTotal(String str){
        int cnt = 0;
        int total = 0;
        for(int i=0;i<str.length();i++){
            cnt++;
            if(i +1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                total += 1 +String.valueOf(cnt).length();
                cnt = 0;
            }
        }
        return total;
    }

}

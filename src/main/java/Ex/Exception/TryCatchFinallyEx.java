package Ex.Exception;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatchFinallyEx {

    public static void main(String[] args){
        FileWriter fw = null;

        try{
            fw = new FileWriter("data.txt");
            fw.write("hello");
        }catch (Exception e){
            System.out.println("Exception : " + e.getMessage());
        }finally {
            if(fw != null){
                try{
                    fw.close();
                }catch (IOException e){
                    ;
                }
            }
        }

    }

}

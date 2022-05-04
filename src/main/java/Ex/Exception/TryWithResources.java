package Ex.Exception;

import java.io.FileWriter;

public class TryWithResources {

    public static void main(String[] args){

        try(FileWriter fw = new FileWriter("data.txt");){
            fw.write("hello");
        }catch (Exception e){
            System.out.println("Exception : " + e.getMessage());
        }

    }

}

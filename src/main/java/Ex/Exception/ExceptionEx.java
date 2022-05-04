package Ex.Exception;

class UnsupportedFileException extends Exception{
    public UnsupportedFileException(String msg){
        super(msg);
    }
}

public class ExceptionEx{
    public static void main(String[] args){
        try{
            throw new UnsupportedFileException("UnsupportedFile");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}


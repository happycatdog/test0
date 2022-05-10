package org.example;

class NumbersTemp{
    private boolean duplicateChecked;
    private boolean allNumberChecked;

    public void setAllNumberChecked(boolean allNumberChecked) {
        this.allNumberChecked = allNumberChecked;
    }

    public void setDuplicateChecked(boolean duplicateChecked) {
        this.duplicateChecked = duplicateChecked;
    }

    public boolean getDuplicateChecked(){
        return this.duplicateChecked;
    }
}
public class DuplicateNumbers {

    static boolean chkDuplicateNumbers(String inString){

        NumbersTemp numTemp = new NumbersTemp();

        return true;
    }
    public static void main(String[] args){
        System.out.println(chkDuplicateNumbers("0123456789"));
        System.out.println(chkDuplicateNumbers("01234"));
        System.out.println(chkDuplicateNumbers("01234567890"));
        System.out.println(chkDuplicateNumbers("6789012345"));
        System.out.println(chkDuplicateNumbers("012322456789"));
    }
}

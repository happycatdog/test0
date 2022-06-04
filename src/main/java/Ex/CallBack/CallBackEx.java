package Ex.CallBack;

import java.util.Scanner;

interface callback{
    void addCnt();
    void subtractCnt();
    boolean isLessZero();
}

class Callee{
    private int cnt;
    private callback callBack;

    public Callee(){cnt = 0;}
    public void setCallBack(callback callBack){
        this.callBack=callBack;
    }
    public int getCnt(){
        return cnt;
    }
    public void addCnt(){
        this.cnt++;
    }
    public void subtractCnt(){
        this.cnt--;
    }
    public boolean execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Data : ");
        int condition = scanner.nextInt();
        switch (condition){
            case 1:
                this.callBack.addCnt();
                break;
            case 2:
                this.callBack.subtractCnt();
                break;
        }
        return callBack.isLessZero();
    }
}

public class CallBackEx {
    public static void main(String[] args){
        Callee callee = new Callee();
        callee.setCallBack(new callback() {
            @Override
            public void addCnt() {
                callee.addCnt();
                System.out.println(callee.getCnt());
            }

            @Override
            public void subtractCnt() {
                callee.subtractCnt();
                System.out.println(callee.getCnt());
            }

            @Override
            public boolean isLessZero() {
                if(callee.getCnt() < 0) return true;
                return false;
            }
        });

        while (true){
            if(callee.execute()) break;
        }
    }

}

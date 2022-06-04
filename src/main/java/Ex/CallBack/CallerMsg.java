package Ex.CallBack;

interface CallbackMsg{
    void outPrint(String msg);
    void doSomethingWithCaller();
}
class CalleeMsg{
    public static void sayHello(CallbackMsg callback, String msg){
        callback.outPrint(msg);
        callback.doSomethingWithCaller();
    }
}
public class CallerMsg {
    public static void main(String[] args){
        final String phone = "000-0000-0000";

        CallbackMsg callback = new CallbackMsg() {
            @Override
            public void outPrint(String msg) {
                System.out.println(msg);
            }

            @Override
            public void doSomethingWithCaller() {
                System.out.println("my number is " + phone);
            }
        };
        CalleeMsg.sayHello(callback, "Hello there!");
    }
}

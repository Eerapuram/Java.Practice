package exceptionalHandling;

public class CallByValue {
    int data=50;

    void change(CallByValue c){
        c.data=c.data+100;
    }


    public static void main(String args[]){
        CallByValue c=new CallByValue();

        System.out.println("before change "+c.data);
        c.change(c);//passing object
        System.out.println("after change "+c.data);

    }
}

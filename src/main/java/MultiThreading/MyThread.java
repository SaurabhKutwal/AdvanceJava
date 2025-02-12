package MultiThreading;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Current Thread is : " + Thread.currentThread().getName() + " - count :" + i);
            Thread.yield();
        }
    }
}

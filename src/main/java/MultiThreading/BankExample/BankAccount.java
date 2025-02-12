package MultiThreading.BankExample;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private Lock lock = new ReentrantLock();

    public void withdrawn(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdrawal");
        try {
            if(lock.tryLock(4000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try {
                        System.out.println(Thread.currentThread().getName() + " processing for withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Withdrawal successfully." + " Rem Balance : " + balance);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }finally {
                        lock.unlock();
                    }
                }
                else{
                    System.out.println("Insufficient amount");
                }
            }
            else{
                System.out.println(Thread.currentThread().getName() + " could not aquire the lock, will try later");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

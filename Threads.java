//threads are smallest unit we can work 
/*
 Roles of run() and start() in Java Threads
In Java, the run() and start() methods are fundamental to thread management and execution. Here's a concise overview of their roles:
start() Method:
Purpose: The start() method is used to initiate a new thread. When called, it allocates a new stack for the thread and invokes the run() method in a separate call stack.
Execution: It allows the thread to enter the Runnable state, where it can be scheduled for execution by the thread scheduler.
Concurrency: Multiple threads can run concurrently when start() is called on different thread instances.
 */
class A extends Thread{
    public void run()
    {
        for(int i =0;i<100;i++){
            System.out.println("hi");
        }
    }

}
class B extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
    }
}
public class Threads {
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}

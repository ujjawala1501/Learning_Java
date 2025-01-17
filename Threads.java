//threads are smallest unit we can work 
/*
 Roles of run() and start() in Java Threads
In Java, the run() and start() methods are fundamental to thread management and execution. Here's a concise overview of their roles:
start() Method:
Purpose: The start() method is used to initiate a new thread. When called, it allocates a new stack for the thread and invokes the run() method in a separate call stack.
Execution: It allows the thread to enter the Runnable state, where it can be scheduled for execution by the thread scheduler.
Concurrency: Multiple threads can run concurrently when start() is called on different thread instances.
 
run() Method
Purpose: The run() method contains the code that defines what the thread will execute. It is essentially the entry point for the thread's execution.
Direct Invocation: If run() is called directly (e.g., obj.run()), it does not start a new thread; instead, it runs in the current thread's context, which defeats the purpose of multithreading.
Implementation: It can be overridden when implementing the Runnable interface or extending the Thread class.

Key Differences
Calling start() creates a new thread and invokes run() asynchronously.
Calling run() directly executes it in the current thread without creating a new one.
Conclusion
Using start() is essential for concurrent execution, while run() defines the behavior of the thread.

By default the threads priority is set to 5 which we can see by using obj1.getpriority() we can set priority as well but its like only suggesting the schedular that we can make this a priority but its not must that 
schedular will consider that.
*/
class A extends Thread{
    public void run()
    {
        for(int i =0;i<100;i++){
            System.out.println("hi");
            //sleep method throws interrupted exception alway and hence try and cath is needed
            try{//with sleep we are trying to print "hi" and "hello" alternatively
            Thread.sleep(10); //this thread goes to sleep and B thread will get to work and print Hello.
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    }

}
class B extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
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

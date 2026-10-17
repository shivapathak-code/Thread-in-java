public class ThreadLifeCycle {
public static void main(String[] args)
{
    Thread mainthread = Thread.currentThread();
    Thread t1 = new Thread(()->
    {
        System.out.println("Name of current thread is :"+ Thread.currentThread().getName());
        System.out.println("Name of current thread is :"+ mainthread.getState());
    });

    System.out.println(t1.getState());

    t1.start(); // Runnable state ;

    System.out.println(t1.getState());

    try{
        Thread.sleep(2000);
    } catch (Exception e) {
    }
    System.out.println(t1.getState()); // terminated stage;
}
    // new stage


}

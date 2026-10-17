public class Solution {
    public static void main(String[] args)
    {

        Myranble R1 = new Myranble();
        Thread t1 = new Thread(R1);
        t1.start(); // here is start the thread;
    }
}
//class Thread extends java.lang.Thread   // that is class created Thread;
//{
//    public void run()
//    {
//       System.out.println("Thread is started");
//    }
//}
class Myranble implements Runnable
{

    @Override
    public void run() {
        System.out.println("that is thread implementation by Runnable method : ");
    }
}


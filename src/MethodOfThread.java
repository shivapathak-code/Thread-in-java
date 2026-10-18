import com.sun.jdi.event.ThreadDeathEvent;

public class MethodOfThread {
    public static void main(String[] args) throws InterruptedException
    {
        // thread method;
        // first is sleep method ;
//        System.out.println(Thread.currentThread().getState());
//        Thread t1 = new Thread(()->
//        {
//            System.out.println("main thread is : "+Thread.currentThread().getState());
//        });
//        try{
//            t1.sleep(2000);
//        }catch (Exception e)
//        {
//
//        }
//        t1.start();
//        System.out.println(Thread.currentThread().getState());
//

        // join mathod() that is follow the order
        // print first order and than complete second excution;

//        Thread t1 = new Thread(()->
//        {
//            for(int i = 0;i<5;i++)
//            {
//                System.out.println("t1 "+i);
//            }
//        });
//        Thread t2 = new Thread(()->
//        {
//            for(int i = 5;i<10;i++)
//            {
//                System.out.println("t2 "+i);
//            }
//        });
//        t1.start();
//        t1.join(3000);
//        t2.start();

        // yield method that method work for several threading function;

        // like jaise ek function main ham yield use kerte to usme ham
        // jis function main use kerte hain to vo yield ker dena apne ap ko matlab second function ko
        // jayda priority dena to uska o kaam hoga vo karaege uske
        // baad apna kaam karega;

//        Thread t1 = new Thread(()->
//        {
//           for(int i = 1;i<=10;i++)
//           {
//               System.out.println("T1 "+i);
//               Thread.yield();
//           }
//        });
//
//        Thread t2 = new Thread(()->
//        {
//            for(int i = 1;i<=10;i++)
//            {
//                System.out.println("T2 "+i);
//            }
//        });
//
//        t1.start();
//        t2.start();

        // next method hain inttrupt ka ye ek message bejta hain apne current thread ko
        // ki vo kya kare apne app ko stop ja yahan work kare is tarah ke kaam kerta hain ye
        //to ye jo intrrupt means notify kerna apne thread ko ok ;
        // or hmn isintrrupt ka matlab ki value ko true or false ker deta
        // and intrrupt se bapas se apne thread ko value updata ker deta yahin false by defult set ker deta hain ;

//        Thread t1 = new Thread(()->
//        {
//            while(!Thread.currentThread().interrupted()){
//                System.out.println("Running");
//            }
//        });
//        t1.start();
//        Thread.sleep(1000);
//        t1.interrupt();

        // next method hain isAlive ye batata hain ki tumari thead start ya nhi matlab true of
        // false true or false return
        // kerta hain
//        Thread t1 = new Thread(()->
//        {
//            try{
//                Thread.sleep(2000);
//            }
//            catch(Exception e){}
//        });
//        System.out.println(t1.isAlive());
//        t1.start();
//        System.out.println(t1.isAlive());
//
//        try {
//
//                Thread.sleep(3000);
//            }catch(Exception e){}
//        System.out.println(t1.isAlive());

        // ek or method hota hain jo hota hain
        // currentThread ka -> ye kerta hain ya deta hain refrence of current Thread;
        // yani name batata hain

//        Thread t1 = new Thread(()->
//        {
//            System.out.println(Thread.currentThread().getName());
//        });
//        t1.setName("my thread");
//
//        t1.start();

        // priority
        //MAX_PRIORITY = 10;
        //MIN_PRIORITY = 1;
        //NORM-PRIOROTY = 5;

//        Thread t1 = new Thread(()->
//        {
//           System.out.println("custom thread is running");
//        });
//        t1.start();
//        t1.setPriority(10);
//        System.out.println(t1.getPriority());

        //deamon thread ek thread hain jo background thread chalti hain unhe handle kerta hain
        // ya stop ker deta hain ;

        Thread t1 = new Thread(()->
        {
           while(true)
           {
               System.out.println("Running");
           }
        });
        t1.setDaemon(true);
        t1.start();

        try {
            Thread.sleep(2000);

            }catch(Exception e){}
        return;


    }
}

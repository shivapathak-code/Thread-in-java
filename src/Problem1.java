public class Problem1 { // here is understand what is race conditon
    public static void main(String[] args)
    {
        Thread t1 = new Thread(() ->
        {
           for(int i = 1;i<15;i++)
           {
               if(i%2==0)
               {
                   System.out.println("even thread : " +i);
               }
           }
        });

        Thread t2 = new Thread(() ->
        {
            for(int i = 1;i<15;i++)
            {
                if(i%2!=0)
                {
                    System.out.println("odd thread : " +i);
                }
            }
        });
        t1.start();
        t2.start();
    }
}


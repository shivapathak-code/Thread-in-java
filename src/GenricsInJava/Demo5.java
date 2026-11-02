package GenricsInJava;

public class Demo5 {
    public static void main(String[] args)
    {
        Integer y = getValue(10);
        System.out.println(y);
        String z = getValue("Shiva");
        System.out.println(z);
        printPair(10 , "vaisu");


    }
    static <T> T getValue(T x) // genric methos hain or ye <T> type parameter hain
    {
        return x;
    }
    static <T , U> void printPair(T first , U second)
    {
        System.out.println(first + " " + second);
    }
}

// Syntax
//<T> returnType methodName(T parameter)
//    {
//       }

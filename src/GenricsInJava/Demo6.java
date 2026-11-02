package GenricsInJava;

public class Demo6 {
    public static void main(String[] args)
    {
        Box<Number> b1 = new Box<>();
        b1.value = 10;
        b1.printdouble();
    }
}
// yahan ham shikte hain ki bounds kya hota hain
// bounds means hota hain ki
//koi bi kisi particular method ke liye hi work karen jaise
// ye class maine bnai hui is class main main bound laga dunga ki
// ye keval Numbers ke liye extendble ho jaise
// use only int float double and not use String and boolean ;
class Box<T extends Number> //  yahan bound laga diya hain
{
   T value;

   public void printdouble()
   {
       System.out.println(value.doubleValue());
   }
}

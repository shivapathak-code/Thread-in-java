package GenricsInJava;
// yahan ham shikne ja rahe hain genrics kya hain java main uski concept kya
// java mein
public class Demo1 {
    public static void main(String[] args) {
        // upcasting
        String s = "hello";/// ye hamari ek specific class ;
        Object obj = s;// isko hamne ek genric yr parent class main convert ker diya hain jo ki ho sakta hain koi
        // problem nhi ayegi
        System.out.println(obj);// yahan ashani se print ho sakta hain

        // Downcasting
        // kisi ek genric class ko specific class main convert kerna hain vo hain down casting';
        Object obj2 = "Shiva";
        String s2 = (String) obj2;
        System.out.println(s2);

        //ek tarah se down casting dengerous ho sakti hain kyoki complie time pe check kerti hain
        //vahan pe thik bi ho skti hain lekin jab jbm check kerta hain
        // to ek exception throw ker deta hain
        //vo kyo abhi dekete hain

        Object obj3 = 10;
        String s3 = (String) obj3; // hamne cast kerne se complie time error ko thi ker diya hain per
        // run time main usme class check kerke dekh liya hain jisse
        //dono ki class different


        System.out.println(s3);


    }
}

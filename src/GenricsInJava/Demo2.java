package GenricsInJava;
// ham kyo ue kerte hain genrics kyo zaroorat pai kya
//kya problem a rahi thi
//problem ye thi jaise main kisi ek class ki diffrenrent type se use kerna
// chayta hu matlab
// vo integer bi le  , string bi le  , boolean be le,
// to uske liye hame
// 3 type ki differnet class banani hogi
// alag alag ek int ki ek string ki or ek booolean kii
// to isse multiple classe bana jayegii
// el solution ata hain ki
// ham ek object class banate hain kyoki vo sab kuch store ker sakte hain

public class Demo2 {
    Box b1 = new Box(10);
    Box b2 = new Box("hello");
    Box b3 = new Box(true);

    // yahan hame down casting kerni padegi ;
    // or down casting kabhi kabhi dengerius ho sakti
    // jab bi input user ayega to complier ki baad main pata chalega
    // ki kis type k object hain
    // per koi operation ham perfrom nhi ker sakte hain


    //for example

    Integer x = (Integer) b1.getValue();
    String s = (String) b2.getValue();
    Boolean b = (Boolean) b3.getValue();
    // pahle ham ager cast ker de to problem hat skati hain lekin
    // jab hame value jo hain dikegi to ham cast ker sakte
    //lekin jab user se ayegi to todi pata hoga
    // kis type ki value jo hain a rahi hogi;
   // System.out.println(b1+3);// not valis kyoki pata nhi hain complier ko ki value kis type ki a rahi hain or
    // usme ham integer add ker rahe hain




}
class Box
{
    private Object value;

    public Object(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

// casting ye type reference lost ho jata hain is liye ye problem ati

// tabi ham genrics ko laye
// use dekenge next class demo3 main
// BYY;

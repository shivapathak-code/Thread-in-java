package GenricsInJava;

public class Demo4 {
    public static void main(String[] args) { // ye banana main bool jata hu ap mat boolna ;

        Pair<Integer, String> p1 = new Pair<>(10, "Shiva");
        System.out.println(p1.first);
        System.out.println(p1.second);

    }
}
class Pair<T,U>
{
    T first;
    U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}

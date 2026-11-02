package GenricsInJava;

public class Demo3 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        Box<String> b2 = new Box<>("Say");
        Box<Boolean> b3 = new Box<>(false);

        System.out.println(b1.getValue()+10);
        System.out.println(b2.getValue()+" hello");
        System.out.println(b3.getValue());
    }
}
// Genrics;
class Box<T>{ // type parameter
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

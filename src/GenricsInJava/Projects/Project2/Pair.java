package GenricsInJava.Projects.Project2;

//Generic Pair System
public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {

        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

 class Main {

    public static void main(String[] args) {

        Pair<Integer, String> product1 =
                new Pair<>(101, "Laptop");

        Pair<Integer, Double> product2 =
                new Pair<>(102, 55000.0);

        Pair<String, Double> product3 =
                new Pair<>("VIVOT4r", 55000.0);

        System.out.println(product1.getKey()+" "+ product1.getValue());

        System.out.println(product2.getKey()+ " "+ product2.getValue());

        System.out.println(product3.getKey()+" "+product3.getValue());
    }
}
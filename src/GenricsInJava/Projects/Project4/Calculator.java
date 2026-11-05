package GenricsInJava.Projects.Project4;

// here i understand mutiple bounds in genrics;
// where T is extends from 1 type and second type to comparable;
// that is the concept of bounding;
public class Calculator <T extends Number & Comparable<T>> {

    T value;

    Calculator(T value) {
        this.value = value;
    }

    public void compare(T other) {

        if (value.compareTo(other) > 0) {
            System.out.println("First is greater");
        } else {
            System.out.println("Second is greater or equal");
        }
    }
}

class Main {

    public static void main(String[] args) {

        Calculator<Integer> c =
                new Calculator<>(100);

        c.compare(50);
    }
}

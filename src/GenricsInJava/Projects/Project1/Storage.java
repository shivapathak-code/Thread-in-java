package GenricsInJava.Projects.Project1;

// ye genricks ka 1 projct hain jisme ham shik pa rahe hain ki
// ek hi claas main different type ke data ko kaise store kerna hain
// using different datatypes
public class Storage <T> { // that is genric class;

    private T data;

    public void save(T data) { // genric method hain
        this.data = data;
        System.out.println("Data Saved Successfully");
    }

    public T getData() {
        return data;
    }
}
class Main {

    public static void main(String[] args) {

        Storage<String> student = new Storage<>();

        student.save("Shiva");

        System.out.println(student.getData());


        Storage<Integer> marks = new Storage<>();

        marks.save(95);

        System.out.println(marks.getData());


        Storage<Double> price = new Storage<>();

        price.save(999.99);

        System.out.println(price.getData());
    }
}

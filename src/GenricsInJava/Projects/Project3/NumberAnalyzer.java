package GenricsInJava.Projects.Project3;
// Number Analyzer;
public class NumberAnalyzer <T extends Number> {

    private T number;

    NumberAnalyzer(T number) {
        this.number = number;
    }

    public double getDoubleValue() {
        return number.doubleValue();
    }

    public boolean isPositive() {
        return number.doubleValue() > 0;
    }

    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Positive: " + isPositive());
    }
}

class Main {

    public static void main(String[] args) {

        NumberAnalyzer<Integer> n1 =
                new NumberAnalyzer<>(100);

        NumberAnalyzer<Double> n2 =
                new NumberAnalyzer<>(-25.5);

        n1.display();
        n2.display();
    }
}

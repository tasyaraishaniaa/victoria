public class Main {
    public static void main(String[] args) {
        MyCalculator math = new MyCalculator();
        System.out.println("a = 10, b = 5");
        System.out.println("Add: " + math.add());
        System.out.println("Subtract: " + math.subtract());
        System.out.println("Multiply: " + math.multiply());
        System.out.println("Divide: " + math.divide());
    }
}

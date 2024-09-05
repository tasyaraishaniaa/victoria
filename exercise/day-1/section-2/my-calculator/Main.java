public class Main {
    public static void main(String[] args) {
        MyCalculator math = new MyCalculator();
        System.out.println("a = 10, b = 5");
        System.out.println("Add: " + math.add(10,5));
        System.out.println("Subtract: " + math.subtract(10,5));
        System.out.println("Multiply: " + math.multiply(10,5));
        System.out.println("Divide: " + math.divide(10,5));
    }
}

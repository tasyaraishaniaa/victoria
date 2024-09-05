public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Tasya";
        emp1.npk = "68769";
        emp1.salary = 10000000;
        emp1.address = "Bekasi";
        emp1.age = 24;

        Employee emp2 = new Employee();
        emp2.name = "David";
        emp2.npk = "68770";
        emp2.salary = 13000000;
        emp2.address = "Bandung";
        emp2.age = 25;

        emp1.sayHello();

        System.out.println("Nama: " + emp1.name);
        System.out.println("NPK: " + emp1.npk);
        System.out.println("Salary: " + emp1.salary);
        System.out.println("Address: " + emp1.address);
        System.out.println("Age: " + emp1.age);

        System.out.println("Nama: " + emp2.name);
        System.out.println("NPK: " + emp2.npk);
        System.out.println("Salary: " + emp2.salary);
        System.out.println("Address: " + emp2.address);
        System.out.println("Age: " + emp2.age);

    }
}
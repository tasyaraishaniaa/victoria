public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Toyota";
        myCar.year = 2020;
        myCar.drive();

        Motor myMotor1 = new Motor ("Nmax", 2018);
        Motor myMotor2 = new Motor ("PCX", 2023);
        System.out.println(myMotor1.model + " " + myMotor1.year);
        System.out.println(myMotor2.model + " " + myMotor2.year);

        Sepeda mySepeda1 = new Sepeda();
        Sepeda mySepeda2 = new Sepeda();
        System.out.println(mySepeda1.model + " " + mySepeda1.year);
        System.out.println(mySepeda2.model + " " + mySepeda2.year);

    }
}
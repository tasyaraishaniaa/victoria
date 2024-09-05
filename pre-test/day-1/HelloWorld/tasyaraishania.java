public class tasyaraishania {
    public static void main(String[] args) {

//        System.out.println("Hello, World!");
//
//        long tabungan;
//        tabungan = 9223372036854775807L;
//
//        int umur;
//        umur =  24;
//
//        float berat;
//        berat = 49.5f;
//
//        char inisial;
//        inisial = 'T';
//
//        boolean isGirl;
//        isGirl = true;
//
//        System.out.println("Jumlah tabungan: " + tabungan);
//        System.out.println("Umur: "+  umur);
//        System.out.println("Berat badan: " + berat);
//        System.out.println("Inisial: " + inisial);
//        System.out.println("Perempuan? " + isGirl);

//        final float phi = 3.14f;
//        int r1 = 10;
//        System.out.println("Luas lingkaran 1= " + phi*r1*r1);
//        r1 = 15;
//        System.out.println("Luas lingkaran 2= " + phi*r1*r1);

//        int a = 4;
//        System.out.println(a+ " merupakan bilangan genap? " + (a %2 == 0));

//        int myNumber = 47;
//        if (myNumber > 50 && myNumber % 2 == 0) {
//            System.out.println(myNumber + " lebih besar dari 50 dan merupakan bilangan genap");
//        } else if (myNumber > 50 && myNumber % 2 != 0) {
//            System.out.println(myNumber + " lebih besar dari 50 dan merupakan bilangan ganjil");
//        } else if (myNumber < 50 && myNumber % 2 == 0) {
//            System.out.println(myNumber + " lebih kecil dari 50 dan merupakan bilangan genap");
//        } else {
//            System.out.println(myNumber + " lebih kecil dari 50 dan merupakan bilangan ganjil");
//        }

//        int day = 5;
//        String dayName;
//        switch (day) {
//            case 1: dayName = "Sunday"; break;
//            case 2: dayName = "Monday"; break;
//            case 3: dayName = "Tuesday"; break;
//            default: dayName = "Invalid day"; break;
//        }
//        System.out.println(dayName);

//        int myNumber = 75;
//        String keterangan;
//
//        switch (myNumber %2) {
//            case 0: keterangan = "genap"; break;
//            default: keterangan = "ganjil"; break;
//        }
//        System.out.println(myNumber + " merupakan bilangan " + keterangan);

//        for (int i = 1; i <= 50; i++) {
//            if (i %2 == 0) {
//                System.out.print(" Even ");
//            } else {
//                System.out.print(i);
//            }
//        }

//        int i = 1;
//        while (i <= 50) {
//            if (i %2 == 0) {
//                System.out.print(" Even ");
//            } else {
//                System.out.print(i);
//            }
//            i++;
//        }

        for (int i = 1; i <= 50; i++) {
            if (i %15 == 0) {
                break;
            }
            System.out.print(i + " ");
        }

    }
}
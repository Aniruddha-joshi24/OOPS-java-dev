package week2;


public class wrapper {
    public static void main(String[] args) {
        int daystayed = 3 ;
        double roomtariff = 2444.4;

        Integer integer1 = daystayed;
        Double double1 = roomtariff;
        System.out.println("Autoboxing example.....");

           double totalbill = integer1*double1;
System.out.println("unboxing example...");
           System.out.println("the total bill is....."+totalbill);




    }
    
}

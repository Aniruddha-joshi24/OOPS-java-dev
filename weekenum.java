package week2;

enum RoomType {
    STANDARD(2000),
    DELUXE(5000),
    SUITE(7500);

    private int pricepernight;
    //  constructor
    RoomType(int pricepernight){
        this.pricepernight=pricepernight;
    }
//method to return the instance variable
    public int getBasePrice(){
        return this.pricepernight;
    }
//method to return total price 
    public int calculateCost(int nights){
        return pricepernight*nights;
    }
}

public class weekenum {
    public static void main(String[] args) {
        //making an enum type variable
        RoomType room = RoomType.STANDARD;
        int nights= 2;

        int k = room.calculateCost(nights);
        System.out.println("The total cost of your stay is..:"+k);


        
        
        int f = room.getBasePrice();
        System.out.println("This was calculated based on the base price of.."+f);
    }
    
}

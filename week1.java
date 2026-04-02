package week1;

public class week1 { // Capitalized class name!
    public static void main(String[] args) {
        
        // Base class reference
        LibraryItem l1; 
        
        System.out.println("--- Reference Book Penalty ---");
        // Creating ReferenceBook (Notice the capitalized class name)
        l1 = new referencebook(22, "Amar Chitra Katha", 7);
        
        // We MUST print the returned values!
        System.out.println("Book Title: " + l1.getTitle());
        System.out.println("Item ID: " + l1.getItemid());
        System.out.println("Late Fee for 3 days: Rs. " + l1.calculateLateFee(3));


        System.out.println("\n--- Magazine Penalty ---");
        // Reassigning to Magazine to demonstrate Runtime Polymorphism
        l1 = new magazine(2, "My Name is Khan", "May");
        
        System.out.println("Magazine Title: " + l1.getTitle());
        System.out.println("Late Fee for 2 days: Rs. " + l1.calculateLateFee(2));
    }
}
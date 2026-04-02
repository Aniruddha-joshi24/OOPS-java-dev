package week1;

class referencebook extends LibraryItem{

    private int edition;
    //make the extra shit and then YOU GOTTA MAKE THE CONSTRUCTOR YOU MUST
    public referencebook(int itemid, String title,int edition) {
        super(itemid, title);
        this.edition=edition;
    }
   
    @Override
    double calculateLateFee(int daysLate) {
        
        return 50*daysLate;
    }
}

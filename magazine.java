package week1;
class magazine extends LibraryItem{
    private String issuemonth;
    public magazine(int itemid,String title,String issuemonth){
        super(itemid, title);
        this.issuemonth=issuemonth;
    }

    @Override
    double calculateLateFee(int daysLate) {
        
        return 20*daysLate;
    }
    
}

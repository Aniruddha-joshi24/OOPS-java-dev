package week1;

public abstract class LibraryItem {
    private int itemid;
    private String title;

    public LibraryItem(int itemid,String title){
        setItemid(itemid);
        setTitle(title);
    }

    public void setItemid(int itemid){
        this.itemid=itemid;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public int getItemid(){
        return itemid;
    }

    public String getTitle(){
        return title;
    }

    abstract double calculateLateFee(int daysLate);
    
}

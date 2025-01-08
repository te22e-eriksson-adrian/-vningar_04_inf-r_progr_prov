public class Book {
    private String name;
    private int pages;
    private int currentPage = 0;

    public Book(String n, int p){
        this.name = n;
        this.pages = p;
    }
    public String getName(){
        return name;
    }
    public int getPages(){
        return pages;
    }
    public void turnPage(){
        currentPage++;
    }
    public int getCurrentPage(){
        return currentPage;
    }
}

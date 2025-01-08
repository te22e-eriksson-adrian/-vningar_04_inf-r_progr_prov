import java.util.ArrayList;

public class ProgramMain {
    private ArrayList<Book> books = new ArrayList<>();

    public ProgramMain(){
        //Instanser i början.
        createInfo();
    }
    public void createInfo(){
        books.add(new Book("Exploring lost worlds", 235));  //Varför fungerar inte detta?
    }
}

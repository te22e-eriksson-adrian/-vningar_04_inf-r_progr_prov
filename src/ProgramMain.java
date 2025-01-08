import java.util.Scanner;
import java.util.ArrayList;

public class ProgramMain {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Rock> rockList = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);

    public ProgramMain(){
        //Instanser i början.
        createInfo();

        System.out.println();
        System.out.print("How many rocks would you like to create?: ");
        int amountOfRocks = keyboard.nextInt();
        keyboard.nextLine();

        for (int i = 0; i < amountOfRocks; i++){
            System.out.print("How much should rock "+(i + 1)+" weigh (kg)?: ");
            int weight = keyboard.nextInt();
            keyboard.nextLine();
            rockList.add(new Rock(weight));
        }
    }
    public void createInfo(){
        books.add(new Book("Exploring lost worlds", 235));  //Varför fungerar inte detta?
    }
}

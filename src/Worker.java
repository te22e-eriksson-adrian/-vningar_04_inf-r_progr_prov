public class Worker {
    protected String name;
    protected int age;
    protected int wage = 0;

    public void setWage(int newWage){
        this.wage = newWage;
        System.out.println();
        System.out.println("The new wage is: "+newWage);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getWage(){
        return wage;
    }
}

package ObjectOrientedProgramming;

public class Human {
    int Age;
    String Name;
    
    public Human(String Na,int Ag){
        this.Name = Na;
        this.Age = Ag;
    }

    public void disp(){
        System.out.println("Name: " + this.Name);
        System.out.println("Age: " + this.Age);
    }
}

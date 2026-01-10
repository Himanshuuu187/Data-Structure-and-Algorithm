package OOP.Day3;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){

        
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;

    }

    public BoxWeight(double l,double w,double h,double weight){
        super(l,w,h);   // Calls the parent class constructor
        
        this.weight = weight;
        System.out.println(this.h);
    }
    
}

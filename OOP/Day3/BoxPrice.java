package OOP.Day3;

public class BoxPrice extends BoxWeight {

    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super();
        this.cost = other.cost;

    }

    public BoxPrice(double l,double w,double h,double weight,double cost){
        super(l,w,h,weight);
        this.cost = cost;
    }
    
}

import java.io.*;
import java.util.*;
import java.util.stream.IntStream.IntMapMultiConsumer;

class finding{ 
    private double height;
    private double weight;
    
    public void setheight(double h){
        height =h;
    }
    public void setweight(double w){
        weight=w;
    }
    public double bgmi(){
        return weight/(height*height);
    }
    
public static void main(String args[]){
    // calling the function
    finding obj= new finding();

    obj.setheight(1.7);
    obj.setweight(60);

    System.out.println(obj.bgmi()+ " kg/m2");
    }
}

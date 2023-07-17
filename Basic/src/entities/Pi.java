package entities;

public class Pi {

    public double radius;

    public static final double PI = 3.14; //CONSTANT = FULL CAPS

    public static double circumference(double radius){
        return 2*PI*radius;
    }
    public static double volume(double radius){
        return 4*PI*radius*radius*radius/3;
    }
    public String toString(){
        return String.format("Circumference: %.2f%n",circumference(radius))+
               String.format("Volume: %.2f%n",volume(radius))+
               String.format("PI value: %.2f%n",PI);
    }
}

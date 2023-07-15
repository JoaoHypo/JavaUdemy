package entities;

public class Pi {

    public double radius;

    public static final double PI = 3.14; //CONSTANT = FULL CAPS

    public double circumference(){
        return 2*PI*radius;
    }
    public double volume(){
        return (4*PI*radius*radius*radius)/3;
    }



    public String toString(){
        return String.format("Circumference: %.2f%n",circumference())+
               String.format("Volume: %.2f%n",volume())+
               String.format("PI value: %.2f%n",PI);
    }
}

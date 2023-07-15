package entities;

public class Pi {

    public double radius;

    public static final double pi = 3.14;

    public double circumference(){
        return 2*pi*radius;
    }
    public double volume(){
        return (4*pi*radius*radius*radius)/3;
    }



    public String toString(){
        return String.format("Circumference: %.2f%n",circumference())+
               String.format("Volume: %.2f%n",volume())+
               String.format("PI value: %.2f%n",pi);
    }
}

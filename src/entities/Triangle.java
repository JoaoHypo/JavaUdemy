package entities;

public class Triangle {
    // CLASSE É UM TIPO, TAL QUAL INT, BOOL, W/e
    //declarando atributos, membros
    public double a;
    public double b;
    public double c;

    public double area(){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

     }
    }

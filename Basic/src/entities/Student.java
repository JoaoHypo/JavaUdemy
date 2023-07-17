package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double sum(){
        return grade1 + grade2 + grade3;
    }

    public String toString(){
        if (sum() >= 60){
            return String.format("FINAL GRADE = %.2f%nPASS",sum());
        }
        else {
            return String.format("FINAL GRADE = %.2f%nFAILED%nMISSING %.2f POINTS",sum(),60-sum());
        }
    }
}

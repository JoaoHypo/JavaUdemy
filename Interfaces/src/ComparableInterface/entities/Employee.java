package ComparableInterface.entities;

public class Employee implements Comparable<Employee>{
    private String name;
    private Double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return - (getSalary().compareTo(o.getSalary()));
        //added minus sign to do a reverse sorting- based on salary
    }

    public String toString(){
        return  "Name: " +
                getName() +
                "Salary: " +
                String.format("%.2f",getSalary());
    }
}

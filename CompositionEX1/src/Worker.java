public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addContract(){

    }

    public void removeContract(){

    }

    public Double income(){
        return 2.0;
    }
}

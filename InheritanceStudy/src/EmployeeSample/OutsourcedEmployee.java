package EmployeeSample;

public class OutsourcedEmployee extends Employee{
    private Double addtionalCharge;

    public OutsourcedEmployee(){
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addtionalCharge) {
        super(name, hours, valuePerHour);
        this.addtionalCharge = addtionalCharge;
    }

    public Double getAddtionalCharge() {
        return addtionalCharge;
    }

    public void setAddtionalCharge(Double addtionalCharge) {
        this.addtionalCharge = addtionalCharge;
    }

    @Override
    public Double payment(){
        double bonusRate = 1.1;
        return super.payment() + bonusRate * addtionalCharge;

    }
}

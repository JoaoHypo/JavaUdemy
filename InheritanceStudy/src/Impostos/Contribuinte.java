package Impostos;

public abstract class Contribuinte {
    protected String name;
    protected Double rendaAnual;

    public Contribuinte(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract Double imposto();

    public String toString(){
        return String.format("%s: $ %.2f%n",name,imposto());
    }
}

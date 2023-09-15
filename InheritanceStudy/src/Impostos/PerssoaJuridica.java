package Impostos;

public class PerssoaJuridica extends Contribuinte{
    private int numFuncionarios;

    public PerssoaJuridica(String name, Double rendaAnual, int numFuncionarios) {
        super(name, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public Double imposto() {
        return numFuncionarios > 10 ?
                rendaAnual * 0.14 :
                rendaAnual * 0.16 ;
    }
}

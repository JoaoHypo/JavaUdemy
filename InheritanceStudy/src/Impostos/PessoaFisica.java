package Impostos;

public class PessoaFisica extends Contribuinte{
    private Double gastosSaude = 0.0;

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double imposto() {
        return rendaAnual < 20000.0 ?
                rendaAnual * 0.15 - gastosSaude/2.0 :
                rendaAnual * 0.25 - gastosSaude/2.0 ;

    }
}

import exceptions.*;



public class ContaBancariaControlada extends ContaBancariaBasica {

    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal(){
       if (saldo == 0 || saldo <= saldoMinimo){
           this.saldo =  (saldo - calcularTarifaMensal() + calcularJurosMensal()) - valorPenalidade;
       }else {
           this.saldo =  saldo - calcularTarifaMensal() + calcularJurosMensal();
       }


    }
}

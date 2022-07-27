import exceptions.*;




public class ContaBancariaBasica {

    private String numeracao;
    protected double saldo = 0.0;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }else {
            this.saldo = this.saldo + valor;
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException{
        if (valor < 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        }else if (valor > saldo){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }else {
            saldo = saldo - valor;
        }
    }

    public double calcularTarifaMensal(){
        if (saldo * 0.10 < 10){
            return saldo * 0.10;
        }
        return 10;
    }

    public double calcularJurosMensal(){
        if (saldo < 0){
            return 0.00;
        }
        return saldo * ((taxaJurosAnual / 100) / 12);
    }

    public void aplicarAtualizacaoMensal(){
        this.saldo =  saldo - calcularTarifaMensal() + calcularJurosMensal();

    }
}

import exceptions.*;





public class ContaBancariaTarifada extends ContaBancariaBasica {

    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = quantidadeTransacoes;
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
          if (valor <= 0){
                throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
            }else {
                this.saldo = saldo + valor - 0.10;
            }
        }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor < 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        }else if (valor > saldo){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }else {
            this.saldo = saldo - valor - 0.10;
        }
    }
}

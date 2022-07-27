package provedores;

public class Sedex implements ProvedorFrete{
    @Override
    public double calcularFrete(double peso, double valor) {
        double valorFerte = 0;
        if (peso > 1000){
            valorFerte = (valor * 0.10);
        }else {
            valorFerte = (valor * 0.05);
        }
        return valorFerte;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}

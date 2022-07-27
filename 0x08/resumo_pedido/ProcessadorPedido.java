

import provedores.*;

public class ProcessadorPedido {
    
    private ProvedorFrete provedorFrete;
    Frete frete = new Frete();

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido) {
       pedido.setFrete(frete);
       frete.setTipoProvedorFrete(provedorFrete.obterTipoProvedorFrete());
       double valor = provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal());
       frete.setValor(valor);
    }
}

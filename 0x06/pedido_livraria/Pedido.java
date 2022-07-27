

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public double calcularTotal() {
        double valor = 0;
        for (ItemPedido itens: itens) {
            valor += itens.produto.obterPrecoLiquido() * itens.quantidade;
        }
        valor = valor - ((this.percentualDesconto/100)*valor);
        return valor;
    }
}

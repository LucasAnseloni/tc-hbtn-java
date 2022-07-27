


public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public Pedido(double percentualDesconto, ItemPedido[] itensPedido4) {
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

    public void apresentarResumoPedido() {
        double desconto = 0;
        double valor = 0;
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item: itens) {
            valor = valor + item.produto.obterPrecoLiquido() * item.quantidade;
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",item.getProduto().getClass().getSimpleName(),item.getProduto().getTitulo(),item.getProduto().obterPrecoLiquido(),item.getQuantidade(),(item.quantidade * item.getProduto().obterPrecoLiquido()));
        }
        desconto = ((this.percentualDesconto/100)*valor);
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n",(desconto));
        System.out.printf("TOTAL PRODUTOS: %.2f\n",valor);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", valor - desconto);
        System.out.println("----------------------------");
    }
}

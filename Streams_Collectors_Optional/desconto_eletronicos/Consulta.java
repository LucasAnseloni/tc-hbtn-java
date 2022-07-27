


import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido){
        return pedido.getProdutos()
                .stream()
                .filter(produto -> produto.getCategoria().equals(CategoriaProduto.LIVRO))
                .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos
                .stream()
                .max(Comparator.comparing(Produto::getPreco))
                .orElse(null);
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
        return produtos
                .stream()
                .filter(produto -> produto.getPreco() >= precoMinimo)
                .collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        Predicate<Pedido> pedidoPredicate = pedido -> pedido.getProdutos()
                .stream()
                .anyMatch(produto -> produto.getCategoria().equals(CategoriaProduto.ELETRONICO));
        return pedidos
                .stream()
                .filter(pedidoPredicate)
                .collect(Collectors.toList());
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos
                .stream()
                .peek(produto -> {
                    if (produto.getCategoria().equals(CategoriaProduto.ELETRONICO)){
                        produto.setPreco(produto.getPreco()-produto.getPreco() * 0.15);
                    }
                })
                .collect(Collectors.toList());
    }
}

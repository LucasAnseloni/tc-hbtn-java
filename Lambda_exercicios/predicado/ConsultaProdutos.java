

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produto, Predicate<Produto> produtoPreditcate) {
        return produto.stream().filter(produtoPreditcate).collect(Collectors.toList());
    }
}

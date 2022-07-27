

import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produto,CriterioFiltro criterioFiltro){
        List<Produto> novaLista = new ArrayList<>();
        for (Produto produtos: produto) {
            if (criterioFiltro.testar(produtos)){
                novaLista.add(produtos);
            }
        }
        return novaLista;
    }
}

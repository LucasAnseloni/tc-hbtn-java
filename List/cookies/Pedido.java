

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    ArrayList<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<PedidoCookie>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);

    }

    public int obterTotalCaixas() {
        int total =0;
        for (int i =0; i < cookies.size(); i++) {
            total = total + cookies.get(i).getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        int total =0;
        for (int i =0;i < cookies.size();i++) {
            if (sabor.equals(cookies.get(i).getSabor())){
                total = total + cookies.get(i).getQuantidadeCaixas();
                cookies.remove(cookies.get(i));
            }
        }
        return total;
    }
}

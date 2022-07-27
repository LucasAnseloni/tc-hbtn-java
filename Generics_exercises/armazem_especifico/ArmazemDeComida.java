

public class ArmazemDeComida extends Armazem<Comida>{

    public ArmazemDeComida() {
    }

    @Override
    public void adicionarAoInventario(String nome, Comida valor) {
        this.getEstoque().put(nome,valor);
    }

    @Override
    public Comida obterDoInventario(String nome) {
        return this.getEstoque().get(nome);
    }
}

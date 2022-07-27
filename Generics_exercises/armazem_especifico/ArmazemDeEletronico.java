

public class ArmazemDeEletronico extends Armazem<Eletronico>{

    public ArmazemDeEletronico() {
    }

    @Override
    public void adicionarAoInventario(String nome, Eletronico valor) {
            this.getEstoque().put(nome, valor);
    }

    @Override
    public Eletronico obterDoInventario(String nome) {
        return this.getEstoque().get(nome);
    }
}

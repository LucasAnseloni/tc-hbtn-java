

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private double preco;
    private double percentualMarkUp = 0.1;

    public Produto(Double preco,String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    Supplier<Double> precoComMarkUp = () -> preco * (1 + percentualMarkUp);
    Consumer<Double> atualizarMarkUp = valor -> this.percentualMarkUp = (valor/100);


    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
}

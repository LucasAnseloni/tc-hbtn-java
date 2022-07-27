


public class Livro {

    String titulo;
    String autor;
    double preco;

    public Livro() {
    }

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        if (titulo.length() < 3){
            throw new IllegalArgumentException("Titulo de livro invalido");
        }

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getAutor() {
        if (!autor.contains(" ")) {
            throw new IllegalArgumentException("Nome de autor invalido");
        }


        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public double getPreco() {
        if (preco <= 0){
            throw new  IllegalArgumentException ("Preco de livro invalido");
        }
        return preco;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }
}

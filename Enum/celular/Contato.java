

public class Contato {

    private String nome;
    private String numeroDeTelefone;
    private TipoNumero tipoNumero;

    public Contato() {
    }

    public Contato(String nome, String numeroDeTelefone, TipoNumero tipoNumero) {
        this.nome = nome;
        this.numeroDeTelefone = numeroDeTelefone;
        this.tipoNumero = tipoNumero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }

    public void setTipoNumero(TipoNumero tipoNumero) {
        this.tipoNumero = tipoNumero;
    }
}

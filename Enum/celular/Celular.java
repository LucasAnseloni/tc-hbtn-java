

import java.util.ArrayList;
import java.util.List;

public class Celular {

    private List<Contato> contatos;

    public Celular() {
        contatos = new ArrayList<Contato>();
    }

    public int obterPosicaoContato(String nome){
        for (int i =0; i< contatos.size();i++){
            if (contatos.get(i).getNome() == nome){
                return i;
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contato){
        if (obterPosicaoContato(contato.getNome()) == -1){
            contatos.add(contato);
        }else{
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        int nomeExiste = obterPosicaoContato(contatoAntigo.getNome());
        if (nomeExiste != -1) {
            if (!contatoAntigo.getNome().equals(novoContato.getNome())) {
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            }
            contatos.set(nomeExiste, novoContato);
        }else {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }
    }

    public void removerContato(Contato contato){
        int existe = obterPosicaoContato(contato.getNome());
        if (existe == -1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }else {
            contatos.remove(existe);
        }
    }

    public void listarContatos(){
        for (Contato lista: contatos) {
            System.out.println(lista.getNome()+" -> "+ lista.getNumeroDeTelefone()+" ("+lista.getTipoNumero()+")");
        }
    }
}


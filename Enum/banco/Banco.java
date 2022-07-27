

import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco() {
    }

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nomeAgencia){
            for (int i =0; i < agencias.size();i++){
                if (agencias.get(i).getNome().equals(nomeAgencia)){
                    return agencias.get(i);
                }
            }

        return null;
    }

    public boolean adicionarAgencia(String adicionarAgencia){
            Agencia percorrerAgencia = buscarAgencia(adicionarAgencia);
            if (percorrerAgencia != null){
                return false;
            }
            Agencia novaAgencia = new Agencia(adicionarAgencia);
            agencias.add(novaAgencia);
        return true;
    }

    public boolean adicionarCliente(String nomeAgencia,String nomeCliente, double valorTransacaoInicial){
            Agencia percorrerAgencia = buscarAgencia(nomeAgencia);
            if (percorrerAgencia == null){
                return false;
            }
            percorrerAgencia.novoCliente(nomeCliente,valorTransacaoInicial);
            percorrerAgencia.adicionarTransacaoCliente(nomeCliente,valorTransacaoInicial);
        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia,String nomeCliente,double valorTransacao){
        Agencia percorrerAgencia = buscarAgencia(nomeAgencia);
        if (percorrerAgencia == null){
            return false;
        }
        percorrerAgencia.adicionarTransacaoCliente(nomeCliente,valorTransacao);
        return true;
    }

    public boolean listarClientes(String nomeAgencia,boolean imprimeTrasancao){
            Agencia percorrerAgencia = buscarAgencia(nomeAgencia);
            if (percorrerAgencia == null){
                return false;
            }
            for (int i = 0; i < percorrerAgencia.getClientes().size();i++){
                Cliente encontrarCliente = percorrerAgencia.getClientes().get(i);
                System.out.println("Cliente: "+ encontrarCliente.getNome()+" ["+(i+1) + "]");

                if (imprimeTrasancao){
                    for (int j =0; j < encontrarCliente.getTransacoes().size();j++){
                        System.out.println("  ["+(j + 1)+"] valor "+ encontrarCliente.getTransacoes().get(j));
                    }
                }
            }
        return true;
    }

}

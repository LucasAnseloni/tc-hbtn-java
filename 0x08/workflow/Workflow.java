import atividades.*;

import java.util.ArrayList;
import java.util.List;

public class Workflow {

    List<Atividade> atividades;

    public Workflow() {
        this.atividades = new ArrayList<Atividade>();
    }


    public void registrarAtividade(Atividade atividade) {

        this.atividades.add(atividade);
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }
}

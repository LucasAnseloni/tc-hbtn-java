

import java.util.List;
import java.util.ArrayList;

public class ProcessadorVideo {

    List<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<CanalNotificacao>();
    }

    public void registrarCanal(CanalNotificacao canais) {
        this.canais.add(canais);
    }

    public void processar(Video video) {
        Mensagem mensagem = new Mensagem();
        mensagem.setTexto(video.getArquivo()+ " - " + video.getFormato() + "\n");
        mensagem.setTipoMensagem(TipoMensagem.LOG);
        for (CanalNotificacao canal : canais) {
            canal.notificar(mensagem);
        }
    }

    }

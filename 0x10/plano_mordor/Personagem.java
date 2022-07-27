

import comida.Comida;
import humor.*;

public class Personagem {

    private int pontosDeFelicidade;

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }

    public Humor obterHumorAtual(){
        if (this.pontosDeFelicidade < -5){
        return new Irritado();
        }else if(this.pontosDeFelicidade > -5 && this.pontosDeFelicidade <=0){
            return  new Triste();
        } else if (this.pontosDeFelicidade >=1 && this.pontosDeFelicidade <=15) {
            return new Feliz();
        }else {
            return new MuitoFeliz();
        }
    }



    void comer(Comida[] comidas){
        int total =0;
        for (Comida comida: comidas) {
            total = total + (comida.getPontosDeFelicidade());
        }
        this.pontosDeFelicidade = this.pontosDeFelicidade + total;
    }

    @Override
    public String toString(){

        return String.format("%d - %s",this.pontosDeFelicidade,obterHumorAtual().getClass().getSimpleName());
    }
}

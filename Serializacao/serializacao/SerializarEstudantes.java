

import java.io.*;
import java.util.List;

public class SerializarEstudantes<T> {

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        FileOutputStream fos =null;
        ObjectOutputStream oos = null;

        try{
            fos = new FileOutputStream(this.nomeArquivo);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(estudantes);
        } catch (Exception e) {
            System.out.println("Nao foi possivel serializar");;
        }finally {
            if (oos != null){
                try{
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Nao foi possivel fechar o arquivo");
                }
            }
        }
    }

    public List<T> desserializar() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try{
            fis = new FileInputStream(this.nomeArquivo);
            ois = new ObjectInputStream(fis);

            @SuppressWarnings("unchecked") List<T> result = (List<T>) ois.readObject();

            return result;
        } catch (Exception e) {
            System.out.println("Nao foi possivel desserializar");
            return null;
        }finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("Nao foi possivel fechar o arquivo");
                }
            }
        }
    }
}

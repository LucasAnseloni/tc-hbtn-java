

import java.util.Locale;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        String fraseTratada = frase.toLowerCase().replaceAll("[?.!]+", "");
        String[] palavrasNaFrase = fraseTratada.split(" ");

        TreeMap<String, Integer> contagemDePalavras = new TreeMap<>();
        for (String palavra : palavrasNaFrase) {
            if (!contagemDePalavras.containsKey(palavra)) {
                contagemDePalavras.put(palavra, 1);
            } else {
                contagemDePalavras.put(palavra, contagemDePalavras.get(palavra) + 1);
            }
        }

        return contagemDePalavras;

    }
}
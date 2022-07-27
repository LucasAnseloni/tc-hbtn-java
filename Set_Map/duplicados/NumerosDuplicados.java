

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int num[]){
        TreeSet<Integer> duplicados = new TreeSet<Integer>();
        Set<Integer> entradaNumeros = new HashSet<>();

        for (Integer numeros: num) {
            if (entradaNumeros.contains(numeros)){
                duplicados.add(numeros);
            }
            entradaNumeros.add(numeros);
        }
        return duplicados;
    }
}

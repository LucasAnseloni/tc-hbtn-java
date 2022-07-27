

import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<T> implements Armazenavel<T> {

    private Map<String, T> estoque = new HashMap<>();

    public Map<String, T> getEstoque() {
        return estoque;
    }
}

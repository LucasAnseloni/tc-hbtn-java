

import java.util.*;

public class Blog {

   private List<Post> post = new ArrayList<>();

        public void adicionarPostagem(Post postagem){
            this.post.add(postagem);
        }

        public Set<String> obterTodosAutores(){
            Set<String> autores = new TreeSet<>();
            post.forEach(postagem -> autores.add(postagem.getAutor()));
            return autores;
        }

        public Map<String,Integer> obterContagemPorCategoria(){
            Map<String,Integer> contagem = new TreeMap<>();
            ArrayList<String> tipoCategoria = new ArrayList<>();
            post.forEach(postagem -> tipoCategoria.add(postagem.getCategoria()));
            for (String categoria : tipoCategoria) {
                if (!contagem.containsKey(categoria)) {
                    contagem.put(categoria, 1);
                } else {
                    contagem.put(categoria, contagem.get(categoria) + 1);
                }
            }
            return contagem;
        }
}

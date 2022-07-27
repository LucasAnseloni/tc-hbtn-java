



import java.util.*;

public class Blog {

    private List<Post> posts;

    public Blog(){
        this.posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) throws IllegalArgumentException{
        if(this.posts.stream().filter(p -> p.getAutor().equals(post.getAutor()) && p.getTitulo().equals(post.getTitulo())).count() > 0)
            throw new IllegalArgumentException("Postagem jah existente");

        this.posts.add(post);
    }

    public Set<Autor> obterTodosAutores(){
        Set<Autor> autores = new TreeSet<Autor>();

        Collections.sort(this.posts);

        this.posts.forEach(post -> autores.add(post.getAutor()));

        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> result = new TreeMap<Categorias, Integer>();

        this.posts.forEach(posts -> {
            result.compute(posts.getCategoria(), (key, value) -> {
                if(value == null)
                    return 1;
                else
                    return value + 1;
            });
        });

        return result;
    }

    public Set<Post> obterPostsPorAutor(Autor autor){
        Set<Post> posts = new TreeSet<Post>();

        this.posts.forEach(post -> {
            if(post.getAutor().toString().equals(autor.toString()))
                posts.add(post);
        });

        return posts;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        Set<Post> posts = new TreeSet<Post>();

        this.posts.forEach(post -> {
            if(post.getCategoria().equals(categoria))
                posts.add(post);
        });

        return posts;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        Map<Categorias, Set<Post>> postsMap = new TreeMap<Categorias, Set<Post>>();

        this.posts.forEach(post -> {
            postsMap.compute(post.getCategoria(), (key, value) -> {
                return obterPostsPorCategoria(key);
            });
        });

        return postsMap;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        Map<Autor, Set<Post>> postsMap = new LinkedHashMap<Autor, Set<Post>>();

        obterTodosAutores().forEach(autor -> {
            postsMap.compute(autor, (key, value) -> {
                return obterPostsPorAutor(key);
            });
        });

        return postsMap;
    }
}

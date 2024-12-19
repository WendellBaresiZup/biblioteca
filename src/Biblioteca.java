import java.util.ArrayList;

public class Biblioteca {

    // Atributos da Classe Biblioteca
    public ArrayList<Livro> livros;
    public ArrayList<Usuario> usuarios;

    // Metodo Construtor
    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }


    // Metodos da Classe Biblioteca
    public void cadastrarLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro " + livro.getTitulo() + " cadastrado");
    }

    public void cadastrarUsuario(Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuario " + usuario.getNome() + " cadastrado.");
    }

    public void realizarEmprestimo(String titulo, int id){
        Livro livro = buscaDeLivro(titulo);
        Usuario usuario = buscaDeUsuario(id);

    }


    public void realizarDevolucao(String titulo, int id){
        Livro livro = buscaDeLivro(titulo);
        Usuario usuario = buscaDeUsuario(id);
    }

    public void exibirLivrosDisponiveis(){
        if (false){
            System.out.println("Livros indisponiveis");
        } else{
            System.out.println("Livro disponivel");
            for (Livro livro : livros){
                System.out.println(livro);
            }
        }
    }

    // Metodos Criados pela propria IDE para os metodos que foram criados para fazer a busca
    private Usuario buscaDeUsuario(int id) {
        return null;
    }

    private Livro buscaDeLivro(String titulo) {
        return null;
    }

}

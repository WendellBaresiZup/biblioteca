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

    public void realizarEmprestimo(String titulo, int idUsuario){
        Livro livro = buscaDeLivro(titulo);
        Usuario usuario = buscaDeUsuario(idUsuario);
        if (livro != null && usuario != null){
            if (livro.isDisponivel()){
                livro.emprestar();
            usuario.adicionarLivro(livro);
            } else {
                System.out.println("Livro " + livro.getTitulo() + " está emprestado");
            }
        }
    }


    public void realizarDevolucao(String titulo, int idUsuario){

        Livro livro = buscaDeLivro(titulo);
        Usuario usuario = buscaDeUsuario(idUsuario);

        if (livro != null && usuario != null){
            if (!livro.isDisponivel()){
                livro.devolver();
                usuario.removerLivro(livro);
            } else {
                System.out.println("Livro " + livro.getTitulo() + " não está emprestado");
            }
        }
    }

    public void exibirLivrosDisponiveis(){
        boolean encontrou = false;
        for (Livro livro : livros){
            if (livro.isDisponivel()){
                livro.exibirDetalhesLivro();
                encontrou = true;
            }
        }
        if (!encontrou){
            System.out.println("Não existem livros disponiveis");
        }
    }

    // Metodos Criados pela propria IDE para os metodos que foram criados para fazer a busca
    private Usuario buscaDeUsuario(int id) {

        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        System.out.println("Usuario com o ID " + id + " não encontrado");
        return null;
    }

    private Livro buscaDeLivro(String titulo) {

        for (Livro livro : livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
          System.out.println("Livro " + titulo + " não encontrado");
          return null;
    }
}

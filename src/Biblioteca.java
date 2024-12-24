// 1 - Criar a classe Biblioteca

// 2 - Criar os atributos da classe Biblioteca

// 3 - Criar o construtor da classe Biblioteca

// 4 - Criar os Getter e Setter

// 5 - Implementar o metodo Cadastrar Livro

// 6 - Implementar o metodo Cadastrar Usuario

// 7 - Implementar o metodo Realizar Emprestimo

// 8 - Implementar o metodo Realizar Emprestimo

import java.util.ArrayList;

public class Biblioteca {

    // Atributos da Classe Biblioteca
    public ArrayList<Livro> livros;
    public ArrayList<Usuario> usuarios;


    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }


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
                livro.emprestar(usuario);
                usuario.adicionarLivro(livro);
            } else {
                System.out.println("Livro " + livro.getTitulo() + " está emprestado para o usuário " + usuario.getId());
            }
        }
    }

    public void realizarDevolucao(String titulo, int idUsuario){
        Livro livro = buscaDeLivro(titulo);
        Usuario usuario = buscaDeUsuario(idUsuario);
        if (livro != null && usuario != null){
            if (!livro.isDisponivel()){
                livro.devolver(usuario);
                usuario.removerLivro(livro);
            } else {
                System.out.println("O usuário " + usuario.getNome() + " , devolveu o livro "+ livro.getTitulo() + ".");
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

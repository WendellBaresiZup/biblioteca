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
        // Criacao do metodo buscaDeLivro para chamar a classe Livro e retornar o título do objeto.
        Livro livro = buscaDeLivro(titulo);
        // Criacao do metodo buscaDeUsuario para chamar a classe Usuário e retornar o título do objeto.
        Usuario usuario = buscaDeUsuario(idUsuario);
        // Condicao se caso o livro e o usuario forem diferentes de Nulo ele continua a condicao
        if (livro != null && usuario != null){
            // Entao o livro esta disponivel, e chama o metodo emprestar que esta na classe livro, e pedindo os atributos da classe livro e usuario.
            if (livro.isDisponivel()){
                livro.emprestar(usuario);
                usuario.adicionarLivro(livro);
            } else {
                System.out.println("Livro " + livro.getTitulo() + " está emprestado para o usuário " + usuario.getId());
            }
        }
    }


    public void realizarDevolucao(String titulo, int idUsuario){
        // Criacao do metodo buscaDeLivro para chamar a classe Livro e retornar o título do objeto.
        Livro livro = buscaDeLivro(titulo);
        // Criacao do metodo buscaDeUsuario para chamar a classe Usuário e retornar o título do objeto.
        Usuario usuario = buscaDeUsuario(idUsuario);
        // Condicao se caso o livro e o usuario forem diferentes de Nulo ele continua a condicao
        if (livro != null && usuario != null){
            // Entao o livro esta disponivel, e chama o metodo emprestar que esta na classe livro, e pedindo os atributos da classe livro e usuario.
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

    // Metodos Criados pela propria IDE para os metodos que foram criados para fazer a busca

    // Criada o metodo de modo privado, pois so poderia ser chamado pela propria classe.
    private Usuario buscaDeUsuario(int id) {

        // Um laco de usuario criado dentro da condicao, pois usuarios é uma lista.
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

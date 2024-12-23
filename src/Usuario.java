// 1 - Criar a classe Usuario

// 2 - Criar os atributos da classe Usuario

// 3 - Criar o construtor da classe Usuario

// 4 - Criar os Getter e Setter

// 5 - Implementar o metodo Adicionar Livro

// 6 - Implementar o metodo Remover Livro


import java.util.ArrayList;

public class Usuario {

    // Atributos da Classe Usuario
    public String nome;
    public int id;

    public ArrayList<Livro> livrosEmprestados;


    // Metodo Construtor
    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }


    // Metodos da classe Usuario
    public void exibirDetalhesUsuario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("ID: " + this.id);
        System.out.println("Livros Emprestados");
        if (livrosEmprestados.isEmpty()){
            System.out.println("Nenhum livro emprestado");
        } else {
            for (Livro livro : livrosEmprestados){
                livro.exibirDetalhesLivro();
            }
        }
    }

    public void adicionarLivro(Livro livro){
        // Caso de condicao criada conforme a regra de negocio que o usuario so pode pegar 3 livros por vez. Mas o atributo LivrosEmpretados por ser uma array então precisa ser do tamanho SIZE, LENGHT OU LONG
        if (livrosEmprestados.size() <= 3){
            livrosEmprestados.add(livro);
        } else {
            System.out.println("Você pode pegar emprestado 3 livros por vez.");
        }
    }

    public void removerLivro(Livro livro){
        livrosEmprestados.remove(livro);
    }


    // Metodo que a classe biblioteca cadastra o usuario
    public void adicionarUsuario(Usuario usuario) {
    }


    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

// 1 - Criar a classe Usuario

// 2 - Criar os atributos da classe Usuario

// 3 - Criar o construtor da classe Usuario

// 4 - Criar os Getter e Setter

// 5 - Implementar o metodo Adicionar Livro

// 6 - Implementar o metodo Remover Livro


import java.util.ArrayList;

public class Usuario {

    // Atributos da Classe Usuario
    private String nome;
    private int id;

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
        if (livrosEmprestados.size() <= 3){
            livrosEmprestados.add(livro);
        } else {
            System.out.println("Você pode pegar emprestado 3 livros por vez.");
        }
    }

    public void removerLivro(Livro livro){
        livrosEmprestados.remove(livro);
    }

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

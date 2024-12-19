public class Usuario {

    // Atributos da Classe Usuario
    public String nome;
    public int id;


    // Metodo Construtor
    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }


    // Metodos da classe Usuario
    public void exibirDetalhes(String nome, int id){
        System.out.println("Nome: " + this.nome);
        System.out.println("ID: " + this.id);
    }

    public void adicionarLivro(Livro livro){

    }

    public void removerLivro(){

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

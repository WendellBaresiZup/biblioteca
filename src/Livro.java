// 1 - Criar a classe Livro

// 2 - Criar os atributos da classe Livro

// 3 - Criar o construtor da classe Livro

// 4 - Criar os Getter e Setter

// 5 - Implementar o metodo Exibir Detalhes

// 6 - Implementar o metodo Emprestar

// 7 - Implementar o metodo Devolver

public class Livro {


    // Atributos do Livro
    public String titulo;
    public String autor;
    public String isbn;
    public boolean disponivel;

    // Atributo Usuario criado dentro da Classe Livro, pois vai realizar algumas chamadas dos atributos da classe Usuário
    public Usuario usuario;

    // Metodo Construtor
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        // Atributo Disponível recebe verdadeiro, pois sempre vai estar disponível
        this.disponivel = true;
    }

    // Metodos do Livro

    // Metodo Exibir Detalhes
     public void exibirDetalhesLivro(){
         System.out.println("Título: " + this.titulo);
         System.out.println("Autor: " + this.autor);
         System.out.println("ISBN: " + this.isbn);
         if (disponivel == true) {
             System.out.println("Disponível: " + "Sim");
         } else {
             System.out.println("Disponível: " + "Nao");
         }
         // Condicao criada para caso o usuário for diferente de nulo entao o livro foi emprestado para algum usuário.
         if (usuario != null){
             System.out.println("Foi emprestado para o usuario: " + usuario.getNome());
         }
     }

    // Metodo Emprestar
     public void emprestar(Usuario usuario){
       if (disponivel){
           disponivel = false;
           this.usuario = usuario;
           System.out.println("Livro " + titulo + " está emprestado.Para o usuario " + usuario.getNome());
       } else {
           System.out.println("Livro " + titulo + " não esta disponivel.");
       }
     }

    // Metodo Devolver
     public void devolver(Usuario usuario){
         if (!disponivel){
             disponivel = true;
             System.out.println("Livro " + titulo + " foi devolvido, pelo usuario " + usuario.getNome());
         } else {
             System.out.println("Livro " + titulo + " não esta disponível.");
         }
     }

     // Getter e Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Metodo Cosntrutor adicionar livro que vai ser chamado na classe biblioteca
    public void adicionarLivro(Livro livro) {
    }
}

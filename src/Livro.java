// 1 - Criar a classe Livro

// 2 - Criar os atributos da classe Livro

// 3 - Criar o construtor da classe Livro

// 4 - Criar os Getter e Setter

// 5 - Implementar o metodo Exibir Detalhes

// 6 - Implementar o metodo Emprestar

// 7 - Implementar o metodo Devolver

public class Livro {


    // Atributos do Livro
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;
    public Usuario usuario;

    // Metodo Construtor
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        // Livro vai iniciar disponível
        this.disponivel = true;
    }

     public void exibirDetalhesLivro(){
         System.out.println("Título: " + this.titulo);
         System.out.println("Autor: " + this.autor);
         System.out.println("ISBN: " + this.isbn);
         if (disponivel == true) {
             System.out.println("Disponível: " + "Sim");
         } else {
             System.out.println("Disponível: " + "Nao");
         }
         if (usuario != null){
             System.out.println("Foi emprestado para o usuario: " + usuario.getNome());
         }
     }


     public void emprestar(Usuario usuario){
       if (disponivel){
           disponivel = false;
           this.usuario = usuario;
           System.out.println("Livro " + titulo + " está emprestado.Para o usuario " + usuario.getNome());
       } else {
           System.out.println("Livro " + titulo + " não esta disponivel.");
       }
     }


     public void devolver(Usuario usuario){
         if (!disponivel){
             disponivel = true;
             System.out.println("Livro " + titulo + " foi devolvido, pelo usuario " + usuario.getNome());
         } else {
             System.out.println("Livro " + titulo + " não esta disponível.");
         }
     }

    public void adicionarLivro(Livro livro) {
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


}

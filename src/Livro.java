public class Livro {


    // Atributos do Livro
    public String titulo;
    public String autor;
    public String isbn;
    public boolean disponivel;

    // Metodo Construtor
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        // Atributo Disponível recebe verdadeiro, pois sempre vai estar disponível
        this.disponivel = true;
    }

    // Metodos do Livro
     public void exibirDetalhesLivro(){
         System.out.println("Título: " + this.titulo);
         System.out.println("Autor: " + this.autor);
         System.out.println("ISBN: " + this.isbn);
         if (disponivel == true) {
             System.out.println("Disponível: " + "Sim");
         } else {
             System.out.println("Disponível: " + "Nao");
         }
     }

     public void emprestar(){
       if (disponivel){
           disponivel = false;
           System.out.println("Livro " + titulo + " está emprestado.");
       } else {
           System.out.println("Livro " + titulo + " não esta disponivel.");
       }
     }

     public void devolver(){
         if (!disponivel){
             disponivel = true;
             System.out.println("Livro " + titulo + " foi devolvido.");
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

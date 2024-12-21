public class Teste {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Harry Potter", "J.k Howling", "123453");
        Livro livro2 = new Livro("O senhor dos aneis", "R.R. Tolken", "987654");

        Usuario usuario1 = new Usuario("João", 1);
        Usuario usuario2 = new Usuario("Baresi", 2);


        // Cadastrando livros
        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);

        // Cadastrando usuario
        biblioteca.cadastrarUsuario(usuario1);
        biblioteca.cadastrarUsuario(usuario2);

        //Livros disponiveis
        System.out.println("\nLivros Disponiveis");
        biblioteca.exibirLivrosDisponiveis();

        // Emprestando Livros
        System.out.println("\nEmprestando Livros");
        biblioteca.realizarEmprestimo("Harry Potter", 1);
        biblioteca.realizarEmprestimo("O senhor dos aneis", 2);

        // Livros Disponiveis apos emprestimo
        System.out.println("\nLivros Disponiveis");
        biblioteca.exibirLivrosDisponiveis();


        // Devolvendo os livros
        System.out.println("\nLivros Devolvidos");
        biblioteca.realizarDevolucao("Harry Potter", 1);
        biblioteca.realizarDevolucao("O senhor dos aneis", 2);

        // Livros disponivesi
        System.out.println("\nLivros Disponiveis");
        biblioteca.exibirLivrosDisponiveis();

        System.out.println("\nLivros Disponiveis");
        biblioteca.exibirLivrosDisponiveis();


    }
}
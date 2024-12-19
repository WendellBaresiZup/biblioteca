public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Harry Potter", "J.k Howling", "123453");

        Usuario usuario1 = new Usuario("João", 1);

        //System.out.println("Bem vindo ao sistema de gerenciamento de Biblioteca");
        //System.out.println("Escolha uma opção" +
        //        "\n1 - Cadastrar Livro " +
        //        "\n2 - Cadastrar Usuario " +
        //        "\n3 - Realizar Empréstimo " +
        //        "\n4 - Realizar Devolução " +
        //        "\n5 - Exibir Livros Disponiveis " +
        //        "\n6 - Sair");


        System.out.println(livro1);
        System.out.println(usuario1);

        biblioteca.cadastrarLivro(livro1);

        biblioteca.cadastrarUsuario(usuario1);

        biblioteca.exibirLivrosDisponiveis();

        System.out.println(livro1);
        System.out.println(usuario1);
    }
}
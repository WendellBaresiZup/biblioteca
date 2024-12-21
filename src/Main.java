import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int menu = 0;
        Biblioteca biblioteca = new Biblioteca();

        // 1 - Implementar o menu com switch case dentro de um while, enquanto for diferente de sair ele nao fecha e quando for 6 ele fecha

        // 2 - Implementar funcao para cada açao, toda vez que finalizar ele volta para o menu !6

        // 3 - Implementar a funcao cadastrar livro

        while (menu != 6){

            System.out.println("Bem vindo ao sistema de gerenciamento de Biblioteca");
            System.out.println("Escolha uma opção" +
                    "\n1 - Cadastrar Livro " +
                    "\n2 - Cadastrar Usuario " +
                    "\n3 - Realizar Empréstimo " +
                    "\n4 - Realizar Devolução " +
                    "\n5 - Exibir Livros Disponiveis " +
                    "\n6 - Sair");

            menu = scanner.nextInt();
            // Criar um nextLine após o nextInt para não pular linha ao entrar na funcão do usuário.
            scanner.nextLine();

            switch (menu){
                case 1:
                    cadastrarLivro(biblioteca);
                    break;
                case 2:
                    cadastrarUsuario(biblioteca);
                    break;
                case 3:
                    realizarEmprestimo( biblioteca);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Finalizando o Sistema");
                    break;
                default:
                    System.out.println("Não tem essa opção");
                    break;
            }
        }
        scanner.close();
    }

    public static void cadastrarLivro(Biblioteca biblioteca){

        System.out.print("Digite o Título do livro: ");
        String tituloLivro = scanner.nextLine();

        System.out.print("Digite o Autor do livro: ");
        String autorLivro = scanner.nextLine();

        System.out.print("Digite o ISBN do livro: ");
        String isbnLivro = scanner.nextLine();

        Livro livro = new Livro(tituloLivro, autorLivro, isbnLivro);
        biblioteca.cadastrarLivro(livro);

    }

    public static void cadastrarUsuario(Biblioteca biblioteca){
        System.out.println("Digite o nome do Usuário: ");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite o ID do Usuario");
        int idUsuario = scanner.nextInt();

        Usuario usuario = new Usuario(nomeUsuario, idUsuario);
        biblioteca.cadastrarUsuario(usuario);
    }

    public static void realizarEmprestimo(Biblioteca biblioteca){
        System.out.println("Digite o nome do Livro: ");
        String emprestimoLivro = scanner.nextLine();

        System.out.println("Digite o ID do Usuario");
        int idUsuario = scanner.nextInt();

        biblioteca.realizarEmprestimo(emprestimoLivro, idUsuario);
    }
}
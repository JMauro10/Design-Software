package Aula24_09;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n----- Menu -----");
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Editar livro");
            System.out.println("4. Remover livro");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite a edição do livro: ");
                    String edicao = scanner.nextLine();
                    Livro novoLivro = new Livro(titulo, autor, edicao);
                    biblioteca.adicionarLivro(novoLivro);
                    break;
                case 2:
                    biblioteca.listarLivros();
                    break;
                case 3:
                    System.out.print("Digite o ID do livro que deseja editar: ");
                    int idEditar = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Digite o novo título: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.print("Digite o novo autor: ");
                    String novoAutor = scanner.nextLine();
                    System.out.print("Digite a nova edição: ");
                    String novaEdicao = scanner.nextLine();
                    biblioteca.editarLivro(idEditar, novoTitulo, novoAutor, novaEdicao);
                    break;
                case 4:
                    System.out.print("Digite o ID do livro que deseja remover: ");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine(); 
                    biblioteca.removerLivro(idRemover);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
}           
}

    


import java.util.ArrayList;
import java.util.Scanner;
public class CrudEPI {
    static ArrayList<String> epis = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Sistema de EPIs ---");
            System.out.println("1. Cadastrar EPI");
            System.out.println("2. Listar EPIs");
            System.out.println("3. Atualizar EPI");
            System.out.println("4. Remover EPI");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> cadastrarEPI();
                case 2 -> listarEPIs();
                case 3 -> atualizarEPI();
                case 4 -> removerEPI();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
    static void cadastrarEPI() {
        System.out.print("Digite o nome do EPI: ");
        String nome = input.nextLine();
        epis.add(nome);
        System.out.println("EPI cadastrado com sucesso!");
    }
    static void listarEPIs() {
        System.out.println("\n--- Lista de EPIs ---");
        for (int i = 0; i < epis.size(); i++) {
            System.out.println(i + " - " + epis.get(i));
        }
    }
    static void atualizarEPI() {
        listarEPIs();
        System.out.print("Digite o índice do EPI a atualizar: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < epis.size()) {
            System.out.print("Digite o novo nome: ");
            String novoNome = input.nextLine();
            epis.set(index, novoNome);
            System.out.println("EPI atualizado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
    static void removerEPI() {
        listarEPIs();
        System.out.print("Digite o índice do EPI a remover: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < epis.size()) {
            epis.remove(index);
            System.out.println("EPI removido.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
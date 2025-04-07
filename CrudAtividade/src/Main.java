import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao = -1;
        ArrayList<Usuario> ArrayUsuario = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (opcao != 0) {
            System.out.println("+----Sistema de  Usuarios----+");
            System.out.println("|   1 - Cadastrar Usuario    |");
            System.out.println("|   2 - Listar Usuario       |");
            System.out.println("|   3 - Atualizar Usuario    |");
            System.out.println("|   4 - Remover Usuario      |");
            System.out.println("+----------------------------+");
            System.out.println("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1: ArrayUsuario.add(cadastrarUsuario());
                break;
                case 2: listarUsuario(ArrayUsuario);
                break;
                case 3: atualizarUsuario(ArrayUsuario);
                break;
                case 4: removerUsuario(ArrayUsuario);
                break;
                case 0: opcao = 0;
                break;
            }
        }
    }

    static Usuario cadastrarUsuario() {
        Scanner sc = new Scanner(System.in);
        String nome, email;
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu email: ");
        email = sc.nextLine();

        return new Usuario(nome, email);

    }
    static void listarUsuario(ArrayList ArrayUsuario) {
        System.out.println("----------- Lista -----------");
        for (int i = 0; i < ArrayUsuario.size(); i++) {
           Usuario usuario = (Usuario) ArrayUsuario.get(i);
           System.out.println(i+" - "+"Nome: "+usuario.getNome() + " Email: " + usuario.getEmail());
            System.out.println("");
        }
        System.out.println("----------------------------");
    }
    static void atualizarUsuario(ArrayList ArrayUsuario) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String email;

        System.out.println("Informe o Indice: ");
        int indice = sc.nextInt();

        if (ArrayUsuario.size() >= indice) {
            Usuario usuario = (Usuario) ArrayUsuario.get(indice);

            System.out.println("Informe novo Nome: ");
            nome = sc.nextLine();
            nome = sc.nextLine();
            System.out.println("Informe novo Email: ");
            email = sc.nextLine();

            usuario.setNome(nome);
            usuario.setEmail(email);
        } else {
            System.out.println("Indice informado incorreto!");
        }


    }

    static void removerUsuario(ArrayList ArrayUsuario) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o Indice: ");
        int indice = sc.nextInt();

        if (ArrayUsuario.size() >= indice) {
            ArrayUsuario.remove(indice);
        } else {
            System.out.println("Indeice Incorreto");
        }

    }

}
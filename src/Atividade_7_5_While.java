import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_7_5_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = 1;
        String nome;
        System.out.println("Programa de Cadastros");

        ArrayList<String> nomes = new ArrayList<>();

        while (v != 0) {
            System.out.print("Digite o nome da(s) pessoa(s) que deseja cadastrar:");
            nome = sc.nextLine();
            nomes.add(nome);

            System.out.println("Deseja finalizar? 0 - Finalizar || 1 - Continuar");
            v = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Os nomes cadastrados foram " + nomes);

    }
}

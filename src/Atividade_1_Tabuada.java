import java.util.Scanner;

public class Atividade_1_Tabuada {
    public static void main(String[] args) {

        // Cria um vetor chamado "cleitonTabuado"
        int[] cleitoTabuado = new int[11];

        // Cria um Scanner chamado Jorge
        Scanner jorge = new Scanner(System.in);

        // Mensagem e armazenamento da varíável
        System.out.println("Olá!\n" + "Seja bem vindo ao programa de tabuada!\n" + "Insira um número de 1 a 10:");
        int num = jorge.nextInt();

        for (int i = 1; i < 11; i++) {
            cleitoTabuado[i] = num * i;
            System.out.println(num + " * " + i + " = " + cleitoTabuado[i]);
        }

    }
}
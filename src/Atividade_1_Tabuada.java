import java.util.Scanner;

public class Atividade_1_Tabuada {
    public static void main(String[] args) {

        // Cria um vetor chamado "cleitonTabuado"
        int[] cleitonTabuado = new int[11];

        // Cria um Scanner chamado Jorge
        Scanner jorge = new Scanner(System.in);

        // Mensagem e armazenamento da varíável
        System.out.println("""
                Olá!
                Seja bem vindo ao programa de tabuada!
                Insira um número de 1 a 10:""");
        int num = jorge.nextInt();

        // Laço de repetição que irá inserir o valor da multiplicação entre "num" e "i" no espaço do vetor
        // "cleitonTabuado" determinado pela adição contínua do i (i++). Tudo isso enquanto i for menor que 11.
        // Também irá imprimir o resultado de cada multiplicação realizada nos ciclos.
        for (int i = 1; i < 11; i++) {
            cleitonTabuado[i] = num * i;
            System.out.println(num + " * " + i + " = " + cleitonTabuado[i]);
        }

    }
}
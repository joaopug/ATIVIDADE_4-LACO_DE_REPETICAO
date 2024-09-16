import java.util.Scanner;

public class Atividade_5_Jogo_de_Adivinhacao {
    public static void main(String[] args) {
        // Cria um Scanner chamado "sc"
        Scanner sc = new Scanner(System.in);

        // Criação da variável chamada "num" com valor 0 e das variáveis "min" e "max",
        // elas definem o alcance da aleatoriedade
        int num = 0;
        int min = 1;
        int max = 100;

        // Criação da variável "nun_al" (número aleatório) que contém um cálculo
        // que resulta num número "aleatório"
        int num_al = (int) (Math.random() * (max - min + 1) + min);

        // Pedido de input
        System.out.println("Bem vindo ao Jogo de Adivinhação Com Nome Nada Genêrico!\n" + "Digite um número de 1 a 100 e tente acertar o número escolhido: ");

        // Laço de repetição que insere o input na variável "num" e verifica qual é o número digitado
        // enquanto "num" for diferente de "num_al"
        do {
            num = sc.nextInt();
            if (num == 13) {
                System.out.println("Tudo, menos esse número cara");
            } else if (num == 22) {
                System.out.println("Bolsonaro Capitão! 😎😎");
            } else if (num == 24) {
                System.out.println("🦌");
            } else if (num == 69) {
                System.out.println("HAHAHAHAHAHAHAHHAHAAHAHAHAHAHAHAHHAHAHAHAHAHAH");
            } else if (num == 88) {
                System.out.println("💀");
            } else {
                System.out.println("Errrrrrrrrrrrou! Tenta de novo");
            }
        } while (num != num_al);

        // Mensagem final quando o laço é enfim parado
        System.out.println("\nParabéns! Você acertou, o número é " + num + "!");
    }
}

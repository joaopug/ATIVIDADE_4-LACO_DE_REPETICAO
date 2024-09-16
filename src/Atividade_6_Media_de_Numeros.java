import java.util.Scanner;

public class Atividade_6_Media_de_Numeros {
    public static void main(String[] args) {
        // Cria um Scanner chamado "sc"
        Scanner sc = new Scanner(System.in);

        // Pedido de input da quantidade de vezes que será necessário dividir a soma dos números e rebebimento dela na variável "m"
        System.out.println("Bem vindo ao programa de Média de Números! \n" + "Quantos números deseja fazer a média?");
        int m = sc.nextInt();

        // Criação de variáveis de controle
        // "i" acaba recebendo o valor de "m" para que ele seja usado de controle e "m" fique constante
        double soma = 0;
        double n = 0;
        int i = m;

        // Pedido de input dos números que terão a média feita
        System.out.println("Interessante, quais são os números que deseja fazer a media?");

        // Laço de repetição que insere o valor do input em "n", soma com a variável "soma" e depois 1 de i.
        // Faz isso enquanto i for diferente de 0
        do {
            n = sc.nextInt();
            soma = soma + n;
            i--;
        } while (i != 0);

        // Criação da variável média que contém o cálculo da "soma" dividido pelo "m"
        double media = (soma / m);

        // Mensagem final exibindo a média dos números dados
        System.out.println("A média dos números dados fica " + media + ".");
    }
}

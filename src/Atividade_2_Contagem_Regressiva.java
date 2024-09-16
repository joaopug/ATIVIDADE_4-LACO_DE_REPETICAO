import java.util.Scanner;

public class Atividade_2_Contagem_Regressiva {
    public static void main(String[] args) {
        // Cria um Scanner chamado "entrada"
        Scanner entrada = new Scanner(System.in);

        // Pedido de input e rebebimento dele na variável "num"
        System.out.println("Bem vindo ao programa de Contagem Regressiva!\n" + "Digite o número: ");
        int num = entrada.nextInt();

        // Laço de repetição que irá imprimir "num" e subtrair a variável "num" por 1 enquanto ela for maior ou igual a 0
        while (num >= 0) {
            System.out.println(num);
            num--;
        }
    }
}

import java.util.Scanner;

public class Atividade_3_Fatorial {
    public static void main(String[] args) {
        // Cria um Scanner chamado "sc"
        Scanner sc = new Scanner(System.in);

        // Cria nossa variável para a realizar e receber a multiplicação dos números
        int calculo = 1;

        // Pedido de input e rebebimento dele na variável "n"
        System.out.println("Cáculadora de Fatorial\n" + "Insira um número:");
        int n = sc.nextInt();

        // Laço de repetição que irá multiplicar o "n" pelo "calcúlo" enquanto a subtração de "n" por 1 ser maior que 1
        do {
            calculo = calculo * n;
            n--;
        } while (n > 1);

        // Verificação do "calculo" para saber se é igual a 0, para caso for, imprimir 1
        if (calculo == 0) {
            System.out.println(1);
        } else {
            System.out.println("O fatorial deste número é " + calculo);
        }
    }
}

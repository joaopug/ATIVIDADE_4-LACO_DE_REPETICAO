import java.util.Scanner;

public class Atividade_4_Validacao_de_Entrada {
    public static void main(String[] args) {
        // Cria um Scanner chamado "entrada"
        Scanner entrada = new Scanner(System.in);

        // Cria uma variável chamada "id" com valor 0
        double id = 0.0;

        // Laço de repetição que ficará ligado enquanto o valor de "id" for menor que 0
        do {
            System.out.println("Digite sua idade(anos): ");
            id = entrada.nextDouble();
            if (id <= 0) {
                System.out.println("Outra idade, essa é inválida!");
            } else {
                System.out.println("Idade válida, muito bem!");
            }
        } while (id <= 0);
    }
}

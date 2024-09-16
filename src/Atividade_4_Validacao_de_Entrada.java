import java.util.Scanner;

public class Atividade_4_Validacao_de_Entrada {
    public static void main(String[] args) {
        // Cria um Scanner chamado "entrada"
        Scanner entrada = new Scanner(System.in);

        // Cria uma variável chamada "id" com valor 0
        int id = 0;

        // Laço de repetição que ficará ligado enquanto o valor de "id" for mair que 0
        do {
            System.out.println("Digite sua idade: ");
            id = entrada.nextInt();
        } while (id > 0);
    }
}

import java.util.Scanner;

public class Atividade_7_9_While_Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Verificador de Números Primos 2
                Digite o número:
                """);
        int n = sc.nextInt();
        int i = 2;
        int v = 0;


        if (n <= 1) {
            v = 1;
            System.out.println("Não é primo");
        } else {
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    v = 1;
                    break;
                }
                i++;
            }
        }

        if (v == 1) {
            System.out.println("Não é primo");
        } else {
            System.out.println("É primo");
        }
    }
}

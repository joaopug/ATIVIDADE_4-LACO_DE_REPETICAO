import java.util.Scanner;

public class Exemplo_Cleiton2 {
    public static void main(String[] args) {
        int valor = 0;
        int somaTotal = 0;
        Scanner sc = new Scanner(System.in);

        while (valor != 99) {
        /*System.out.println(valor);
        valor= valor+ 1; // igual valor++*
         */
            System.out.println("Digite um valor: ");
            System.out.println("Informe 99 para sair");
            valor = sc.nextInt();

            somaTotal += valor;
        }

        System.out.println("Total: " + somaTotal);
    }
}

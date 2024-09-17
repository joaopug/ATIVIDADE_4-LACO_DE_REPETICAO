import java.util.Arrays;
import java.util.Scanner;

public class Atividade_7_3_While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] jorge = new String[5];
        int i = 0;

        System.out.println("Me dê o nome de 5 pessoas: ");

        while(i != 5){
            System.out.println("Digite o nome: ");
            jorge[i] = sc.nextLine();
            i++;
        }

        System.out.println("Nomes: " + Arrays.toString(jorge));
    }
}

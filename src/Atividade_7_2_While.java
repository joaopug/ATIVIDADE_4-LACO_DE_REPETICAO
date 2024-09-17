import java.util.Scanner;

public class Atividade_7_2_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um limite: ");
        int n = sc.nextInt();
        int i = 0;

        while(n >= i){
            System.out.println(i);
            i++;
        }

    }
}

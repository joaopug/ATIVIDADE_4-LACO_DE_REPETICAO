import java.util.Scanner;

public class Exemplo_Cleiton {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Me dê o nome do time A");
        String timeA = entrada.nextLine();
        String[] timePlayersA = new String[6];

        System.out.println("Me dê o nome da galera do time A (5 nomes)");
        for (int i = 1; i < 6; i++) {
            System.out.println("Nome do jogador " + i + ":");
            timePlayersA[i] = entrada.nextLine();
        }

        System.out.println("Agora me dá o nome do time B");
        String timeB = entrada.nextLine();
        String[] timePlayersB = new String[6];

        System.out.println("Me dê o nome da galera do time B (5 nomes)");
        for (int i = 1; i < 6; i++) {
            System.out.println("Nome do jogador " + i + ":");
            timePlayersB[i] = entrada.nextLine();
        }

        System.out.println("O nome do time A: " + timeA + "\n");
        System.out.println("\n" + "Os jogadores do time A: " + timePlayersA[1] + "," + timePlayersA[2] + "," + timePlayersA[3] + "," + timePlayersA[4] + "," + timePlayersA[5] + " e " + timePlayersA[6] + ".");
        System.out.println("O nome do time B: " + timeB + "\n");
        System.out.println("\n" + "Os jogadores do time B: " + timePlayersB[1] + "," + timePlayersB[2] + "," + timePlayersB[3] + "," + timePlayersB[4] + "," + timePlayersB[5] + " e " + timePlayersB[6] + ".");
    }
}

import java.util.Scanner;

public class Atividade_7_7_While_Desafio {
    public static void main(String[] args) {
        // Esse usei GPT, não tinha ideia de qual sintaxe usar para verificar o tamanho de uma string,
        // da sintaxe para colocar carecteres como sendo null e de deixá-los minúsculos,
        // e também da estrutura para verificar os caracteres do início até o meio e do fim até o meio.
        // Intankável.
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String string = sc.nextLine();

        // Remove espaços, pontuação e coloca tudo em letras minúsculas
        String stringLimpa = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean palindromo = true;
        int inicio = 0;
        int fim = stringLimpa.length() - 1;

        // Estrutura de repetição while para verificar se é palíndromo
        while (inicio < fim) {
            if (stringLimpa.charAt(inicio) != stringLimpa.charAt(fim)) {
                palindromo = false;
                break;
            }
            inicio++;
            fim--;
        }

        // Resultado
        if (palindromo) {
            System.out.println('"' + string + "\" é um palíndromo.");
        } else {
            System.out.println('"' + string + "\" não é um palíndromo.");
        }
    }
}
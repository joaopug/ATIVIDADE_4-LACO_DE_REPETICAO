import java.util.Scanner;

public class Exemplo_Cleiton3 {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("""
                    ** Escolha **
                    1 - Inserir
                    2 - Excluir
                    3 - Alterar
                    0 - Sair""");
            opcao = sc.nextInt();
        }while(opcao != 0);
    }
}

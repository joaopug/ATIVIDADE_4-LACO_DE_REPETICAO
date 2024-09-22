import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_7_8_While_Desafio {
    public static void main(String[] args) {
        // Esse também utilizei a ajuda do GPT, sabia que seria necerrário o ArrayList, só não tinha
        // noção de qual sintaxe usar para pegar algo em uma linha específica da lista.
        // Paia.

        Scanner escutador = new Scanner(System.in);

        ArrayList<String> prods = new ArrayList<>();
        ArrayList<Integer> quants = new ArrayList<>();
        ArrayList<Double> vals = new ArrayList<>();

        String prod;
        int quant;
        double val;
        int v = 0;

        System.out.println("Caixa de Mercado 3.000");

        while (v != 1) {
            System.out.println("Digite o nome do produto");
            prod = escutador.nextLine();
            prods.add(prod);

            System.out.println("Digite o quantidade do produto");
            quant = escutador.nextInt();
            quants.add(quant);

            System.out.println("Digite o valor do produto");
            val = escutador.nextDouble();
            vals.add(val);
            escutador.nextLine();

            System.out.println("Deseja adicionar mais algum produto?\n" +
                               "0 - Sim || 1 - Não");
            v = escutador.nextInt();
            escutador.nextLine();
        }
        System.out.println("Produtos cadastrados: ");
        for (int i = 0; i < prods.size(); i++) {
            System.out.println("Produto: " + prods.get(i) + " || Quantidade: " + quants.get(i) + " || Valor unitário: R$" + vals.get(i) + " || Valor total: R$" + (vals.get(i) * quants.get(i)));
        }
    }
}
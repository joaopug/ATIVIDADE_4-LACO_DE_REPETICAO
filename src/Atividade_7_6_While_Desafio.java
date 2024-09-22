public class Atividade_7_6_While_Desafio {
    public static void main(String[] args) {
        int n = 1;
        int m = 1;
        while (n <= 10) {
            System.out.println(n + "x" + m + "=" + n * m);
            m++;
            if (m == 11) {
                n++;
                m = 1;
                System.out.println(" ");
            }
        }
    }
}

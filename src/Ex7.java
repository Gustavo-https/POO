import java.util.Scanner;

class Ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Me diga quantos voce tem na conta agora: ");
        float leitor1 = leitor.nextInt();;

        System.out.print(String.format("\nO valor da sua conta em dólar (valor do dólar no dia 26/02/2025): %.2f",leitor1/5.81));

    }
}

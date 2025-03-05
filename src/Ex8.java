import java.util.Scanner;

class Ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Fala um número: ");
        float leitor1 = leitor.nextInt();;

        double quadrado = Math.pow(leitor1, 2);
        double cubo = Math.pow(leitor1, 3);

        System.out.print(String.format("\nO valor deste número ao quadrado é: %.2f", quadrado));
        System.out.print(String.format("\nO valor deste número ao cubo é: %.2f\n", cubo));

leitor.close();
    }
}
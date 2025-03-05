import java.util.Scanner;

class Ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Me diga um número: ");
        int leitor1 = leitor.nextInt();;

        System.out.print("\nSeu dobro: " + (leitor1 * 2));
        System.out.print("\nSeu triplo: " + (leitor1 * 3 ));
        System.out.print("\nSua raiz quadrada: " + Math.sqrt(leitor1));
    }
}
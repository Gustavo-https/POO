import java.util.Scanner;

class Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Me diga um número: ");
        int leitor1 = leitor.nextInt();;

        System.out.print("\nSeu antecessor: " + (leitor1 - 1));
        System.out.print("\nSeu número: " + (leitor1));
        System.out.print("\nSeu sucessor: " + (leitor1 + 1));
    }
}

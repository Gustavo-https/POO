import java.util.Scanner;

class Ex4{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Me diga um número: ");
        int leitor1 = leitor .nextInt();;

        System.out.print("\n\nMe diga outro número: ");
        int leitor2 = leitor.nextInt();;

        System.out.print("\n\nMe diga outro número: ");
        int leitor3 = leitor.nextInt();;

        System.out.println((leitor1 + leitor2 + leitor3)/3);
    }
}

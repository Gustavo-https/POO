import java.util.Scanner;

class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Fala um número: ");
        int leitor1 = leitor.nextInt();

        if (leitor1 == 0) {
            System.out.println("É zero");
        } else if ((leitor1 % 2) == 0) {
            System.out.println("Par");
            ;
        } else if ((leitor1 % 2) != 0) {
            System.out.println("Impar");


            leitor.close();
        }
    }

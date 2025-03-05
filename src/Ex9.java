import java.util.Scanner;

class Ex9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Fala um número: ");
        int leitor1 = leitor.nextInt();

        System.out.print("Fala outro número: ");
        int leitor2 = leitor.nextInt();

        // Comparando os números
        if (leitor1 > leitor2) {
            System.out.println("Dentre eles o maior número será: " + leitor1);
            System.out.println("Dentre eles o menor número será: " + leitor2);
        } else if (leitor2 > leitor1) {
            System.out.println("Dentre eles o maior número será: " + leitor2);
            System.out.println("Dentre eles o menor número será: " + leitor1);
        } else {
            System.out.println("Os números são iguais: " + leitor1);
        }

        leitor.close();
    }
}
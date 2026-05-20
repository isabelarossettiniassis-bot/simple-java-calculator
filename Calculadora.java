import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero1, numero2;
        int opcao;

        System.out.println("=== CALCULADORA JAVA ===");

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.println("\nEscolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;

            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;

            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;

            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}

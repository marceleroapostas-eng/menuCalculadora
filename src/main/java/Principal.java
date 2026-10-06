
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int operacao;

        do {
            System.out.println("\nMenu de opções:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("9 - Sair");
            System.out.println("Escolha uma opção: ");

            operacao = leitor.nextInt();

            if (operacao != 9) {
                System.out.println("Digite o numero1: ");
                double numero1 = leitor.nextDouble();

                System.out.println("Digite o numero 2: ");
                double numero2 = leitor.nextDouble();

                double resultado = 0;

                switch (operacao) {

                    case 1:
                        resultado = numero1 + numero2;
                        break;

                    case 2:
                        resultado = numero1 - numero2;
                        break;

                    case 3:
                        resultado = numero1 * numero2;
                        break;

                    case 4:
                        resultado = numero1 / numero2;
                        break;

                    default:

                        System.out.println("Opção invalida!");
                        continue;
                }
                System.out.println("O resultado da operação é: " + resultado);
            }

        } while (operacao != 9);
        System.out.println("Saindo do programa...");

        leitor.close();
    }

}

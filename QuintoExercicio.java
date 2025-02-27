import java.util.Scanner;

public class Exercicio05 {

    public static double hipotenusa(double base, double altura) {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.println("Digite o valor da altura do triângulo: ");
        double altura = scanner.nextDouble();

        double resultado = hipotenusa(base, altura);

        System.out.println("O valor da hipotenusa é: " + resultado);

        scanner.close();
    }
}

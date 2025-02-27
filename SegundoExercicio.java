import java.util.Scanner;

public class Exercicio02 {

    public static void diferenca(double a, double b) {
        double maior, menor;
        
        if (a > b) {
            maior = a;
            menor = b;
        } else {
            maior = b;
            menor = a;
        }
        
        double resultado = maior - menor;
        System.out.println("A diferença entre o maior e o menor é: " + resultado);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor real: ");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo valor real: ");
        double valor2 = scanner.nextDouble();

        diferenca(valor1, valor2);
        
        scanner.close();
    }
}
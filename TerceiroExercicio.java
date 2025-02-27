import java.util.Scanner;

public class Exercicio03 {

    public static double calcularPesoIdeal(char sexo, double altura) {
        double pesoIdeal = 0;
        
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        }else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        
        return pesoIdeal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();
        
        System.out.println("Digite seu sexo (M para masculino ou F para feminino): ");
        char sexo = scanner.next().charAt(0);

        double pesoIdeal = calcularPesoIdeal(sexo, altura);

        System.out.printf("O peso ideal é: %.2f kg\n", pesoIdeal);

        scanner.close();
    }
}
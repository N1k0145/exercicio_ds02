import java.util.Scanner;

public class Exercicio04 {

    public static void realizarCalculo(int opcao, double num1, double num2) {
        double resultado;

        switch (opcao) {
            case 1:  
                resultado = num1 + num2;
                System.out.println("Resultado da Soma: " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado da Subtração: " + resultado);
                break;

            case 3:  
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado da Divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                }
                break;

            case 4: 
                resultado = num1 * num2;
                System.out.println("Resultado da Multiplicação: " + resultado);
                break;

            case 5:
                if (num2 != 0) {
                    resultado = num1 % num2;
                    System.out.println("Resultado do Resto da Divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                }
                break;

            case 6:  
                resultado = num1 * 2;
                System.out.println("Resultado do Dobro de " + num1 + ": " + resultado);
                break;

            case 7: 
                resultado = Math.pow(num1, 2);
                System.out.println("Resultado do Quadrado de " + num1 + ": " + resultado);
                break;

            case 8:  
                resultado = Math.pow(num1, 3);
                System.out.println("Resultado do Cubo de " + num1 + ": " + resultado);
                break;

            case 9: 
                if (num1 >= 0) {
                    resultado = Math.sqrt(num1);
                    System.out.println("Resultado da Raiz Quadrada de " + num1 + ": " + resultado);
                } else {
                    System.out.println("Erro: Não é possível calcular a raiz quadrada de um número negativo.");
                }
                break;

            case 0:  
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        double num1, num2;

        do {
            
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("5 - Resto da Divisão");
            System.out.println("6 - Dobro");
            System.out.println("7 - Quadrado");
            System.out.println("8 - Cubo");
            System.out.println("9 - Raiz Quadrada");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            if (opcao != 0) {
                System.out.println("Digite o primeiro número: ");
                num1 = scanner.nextDouble();

                if (opcao != 6 && opcao != 7 && opcao != 8 && opcao != 9) {
                    System.out.println("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                } else {
                    num2 = 0; 
                }
            } else {
                num1 = num2 = 0; 
            }

            realizarCalculo(opcao, num1, num2);

        } while (opcao != 0);

        scanner.close();
    }
}

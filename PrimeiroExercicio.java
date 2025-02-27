import java.util.Scanner;

public class Exercicio01 {
    
    // Método para ler uma nota
    public static double lerNota() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota: ");
        return scanner.nextDouble();
    }
    
    // Método para calcular a média
    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do nome do aluno
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // Leitura das notas usando o método lerNota
        double nota1 = lerNota();
        double nota2 = lerNota();

        // Cálculo da média
        double media = calcularMedia(nota1, nota2);

        // Exibindo a média e o status de aprovação
        System.out.println("Média do aluno " + nome + ": " + media);
        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        scanner.close();
    }
}
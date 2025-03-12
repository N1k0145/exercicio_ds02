import javax.swing.JOptionPane;

public class Exercicio1 {
    public static double lerNota(String mensagem) {
        String input = JOptionPane.showInputDialog(mensagem);
        return Double.parseDouble(input);
    }

    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");

        double nota1 = lerNota("Digite a primeira nota de " + nome + ":");
        double nota2 = lerNota("Digite a segunda nota de " + nome + ":");

        double media = calcularMedia(nota1, nota2);

        String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";
        String mensagem = String.format("Aluno: %s\nMédia: %.2f\nSituação: %s", nome, media, resultado);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}

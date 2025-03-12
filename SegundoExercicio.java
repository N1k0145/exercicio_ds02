import javax.swing.JOptionPane;

public class Exercicio2 {

    public static double lerValor(String mensagem) {
        String input = JOptionPane.showInputDialog(mensagem);
        return Double.parseDouble(input);
    }

    public static double diferenca(double valor1, double valor2) {
        return Math.abs(valor1 - valor2);
    }

    public static void main(String[] args) {
        double valor1 = lerValor("Digite o primeiro valor real:");
        double valor2 = lerValor("Digite o segundo valor real:");

        double resultado = diferenca(valor1, valor2);

        String mensagem = String.format("A diferença entre o maior e o menor valor é: %.2f", resultado);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

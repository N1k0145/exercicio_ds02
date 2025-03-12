import javax.swing.JOptionPane;

public class Exercicio5 {

    public static double hipotenusa(double base, double altura) {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triângulo:"));

        double resultado = hipotenusa(base, altura);

        String mensagem = String.format("Base: %.2f\nAltura: %.2f\nHipotenusa: %.2f", base, altura, resultado);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

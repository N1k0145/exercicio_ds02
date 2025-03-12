import javax.swing.JOptionPane;

public class Exercicio3 {

    public static double calcularPesoIdeal(String sexo, double altura) {
        if (sexo.equalsIgnoreCase("Masculino")) {
            return (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("Feminino")) {
            return (62.1 * altura) - 44.7;
        } else {
            return -1;  // Retorna -1 para indicar um erro
        }
    }

    public static double lerAltura(String mensagem) {
        String input = JOptionPane.showInputDialog(mensagem);
        return Double.parseDouble(input);
    }

    public static String lerSexo(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    public static void main(String[] args) {
        String sexo = lerSexo("Digite o sexo (Masculino/Feminino):");
        double altura = lerAltura("Digite a altura (em metros):");

        double pesoIdeal = calcularPesoIdeal(sexo, altura);

        if (pesoIdeal == -1) {
            JOptionPane.showMessageDialog(null, "Sexo inválido! Por favor, insira 'Masculino' ou 'Feminino'.");
        } else {
            String mensagem = String.format("Sexo: %s\nAltura: %.2f\nPeso Ideal: %.2f kg", sexo, altura, pesoIdeal);
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}

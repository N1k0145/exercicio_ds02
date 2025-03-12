import javax.swing.JOptionPane;

public class Exercicio4 {

    public static double calcularOperacao(int opcao, double num1, double num2) {
        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = num1 + num2; 
                break;
            case 2:
                resultado = num1 - num2; 
                break;
            case 3:
                if (num2 != 0) {
                    resultado = num1 / num2; 
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!");
                    resultado = Double.NaN;
                }
                break;
            case 4:
                resultado = num1 * num2; 
                break;
            case 5:
                resultado = num1 % num2; 
                break;
            case 6:
                resultado = num1 * 2; 
                break;
            case 7:
                resultado = num1 * num1; 
                break;
            case 8:
                resultado = num1 * num1 * num1; 
                break;
            case 9:
                if (num1 >= 0) {
                    resultado = Math.sqrt(num1); 
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: Raiz quadrada de número negativo não é permitida!");
                    resultado = Double.NaN;
                }
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
        }

        return resultado;
    }

    public static void main(String[] args) {
        int opcao;
        double num1 = 0, num2 = 0, resultado;
        
        while (true) {
            String menu = "Escolha uma opção:\n"
                    + "1– Soma\n"
                    + "2– Subtração\n"
                    + "3– Divisão\n"
                    + "4– Multiplicação\n"
                    + "5– Resto da Divisão\n"
                    + "6– Dobro\n"
                    + "7– Quadrado\n"
                    + "8– Cubo\n"
                    + "9– Raiz Quadrada\n"
                    + "0– Sair";
            
            String input = JOptionPane.showInputDialog(menu);
            opcao = Integer.parseInt(input);

            if (opcao == 0) {
                break; // Sai do loop se a opção for 0
            }

            if (opcao >= 1 && opcao <= 5) {
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
            } else if (opcao >= 6 && opcao <= 9) {
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número:"));
            }

            resultado = calcularOperacao(opcao, num1, num2);

            if (!Double.isNaN(resultado)) {
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            }
        }
    }
}

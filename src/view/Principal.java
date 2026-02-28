package view;
import controller.ContagemDigitosController;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ContagemDigitosController ctrl = new ContagemDigitosController();
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		// Guardamos o número original para mostrar na mensagem final
		int numeroOriginal = numero;
		
		// Convertendo para positivo para não bugar a nossa regra matemática do Controller
		numero = Math.abs(numero);

		// Chamando o método recursivo
		int qtdDigitos = ctrl.contarDigitos(numero);
		
		JOptionPane.showMessageDialog(null, "O número " + numeroOriginal + " tem " + qtdDigitos + " dígito(s).");
	}
}
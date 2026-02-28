package controller;

public class ContagemDigitosController {

	public ContagemDigitosController() {
		super();
	}

	public int contarDigitos(int n) {
		// Condição de parada: se o número for menor que 10, ele tem apenas 1 dígito.
		if (n < 10) {
			return 1;
		} 
		// Passo recursivo: Conta 1 (representando o último dígito que vamos "cortar") 
		// e soma com o resultado da recursão passando o número sem esse último dígito.
		else {
			return 1 + contarDigitos(n / 10);
		}
	}
}

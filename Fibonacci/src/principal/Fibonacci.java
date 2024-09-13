package principal;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
		
		if(conta(0,1,valor) || valor == 0) {
			System.out.println(valor+" faz parte da sequencia");
		}else {
			System.out.println(valor+" não faz parte da sequencia");
		}
		
	}
	
	// Recursividade para a sequencia de Fibonacci
	private static boolean conta(int valor1, int valor2,int parada) {
		int resultado = valor1 + valor2;
		if (resultado < parada) {
			return conta(valor2, resultado, parada);
		}
		if (resultado > parada) {
			return false;
		}
		return true;
	}

}

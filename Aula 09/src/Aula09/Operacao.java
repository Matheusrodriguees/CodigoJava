package Aula09;

public class Operacao {
    // Sobrecarga - � um tipo polimorfismo
	public static int soma(int a) {
		return 2*a;
	}
	public static int soma(int a, int b) {
		return a + b;
	}
	public static double soma(double a, double b) {
		return a + b;
	}
	public static String soma(String a, String b) {
		return a + b;
	}
	public static float soma(float a, int b) {
		return a + b;
	}	
	public static float soma(int a, float b) {
		return a + b;
	}
	
	// Sobrescrita
	@Override
	public String toString() {
		return "Classe Opera��es";
	}
}
package jogodavelha;

public class EquacaoDoSegundoGrau {

	private double a;
	
	private double b;
	
	private double c;
	
	public EquacaoDoSegundoGrau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calcularY(double x) {
		double y = a * x * x + b*x + c;
		return y;
	}
	
	public double calcularRaiz1() {
		double delta = calcularDelta();
		return (-b + Math.sqrt(delta))/(2*a);
	}
	
	public double calcularRaiz2() {
		double delta = calcularDelta();
		return (-b - Math.sqrt(delta))/(2*a);
	}
	
	public double calcularDelta() {
		double delta = b*b - 4 * a * c;
		if(delta < 0) {
			throw new RuntimeException("Delta não pode ser negativo!!!");
		}
		return delta;
	}
	
	
	public static void main(String[] args) {
		EquacaoDoSegundoGrau equacao = new EquacaoDoSegundoGrau(1, 9, 4);
		
		double y = equacao.calcularY(0);
		System.out.println("Valor de y = " + y);
		
		double raiz1 = equacao.calcularRaiz1();
		double raiz2 = equacao.calcularRaiz2();
		System.out.println("Raiz 1 = " + raiz1);
		System.out.println("Raiz 2 = " + raiz2);
		
		for(int x = -10; x <= 0; x++) {
			y = equacao.calcularY(x);
			System.out.println("para x=" + x + "	y=" + y);
		}
		
	}
	
}

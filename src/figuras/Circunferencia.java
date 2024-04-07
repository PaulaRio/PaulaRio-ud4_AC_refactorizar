package figuras;

public class Circunferencia {

	private double radio;
	private String color;
<<<<<<< HEAD
	

	public Circunferencia(double radio) {
		this.radio = radio;
		
=======

	public Circunferencia(double radio) {
		this.radio = radio;
>>>>>>> refactorizando
	}

	public void imprimir() {
		color = "rojo";
<<<<<<< HEAD
		System.out.println("Di�metro: " + (2 * radio));
=======
		System.out.println("Di�metro: " + 2 * radio);
>>>>>>> refactorizando
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * radio * radio;
		System.out.println(area);
	}

	public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}

	public double getRad() {
		return radio;
	}

	public void setRad(double rad) {
		this.radio = rad;
	}

}

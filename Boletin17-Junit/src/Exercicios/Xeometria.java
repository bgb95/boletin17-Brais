package Exercicios;

public class Xeometria {

	public int perímetroCadrado(int lado) {
		if (lado < 0)
			return 0;
		else
			return lado * 4;
	}

	public int areaCadrado(int lado) {
		if (lado < 0)
			return 0;
		else
			return lado * lado;
	}

	public double teoremaPitagoras(int catetoA, int catetoB) {
		double hipotenusa;

		if (catetoA < 0 || catetoB < 0)
			return 0;
		else {
			hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
			return hipotenusa;
		}
	}
}
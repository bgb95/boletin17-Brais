package Exercicios;
/**
 * Principal.java 
 * @author: Brais Garrido Blanco
 */
public class Xeometria {
	//Campos da clase
	/**
	 * Constructor para o perímetro dun cadrado
	 * @param lado Define a lonxitude dos lados dun cadrado
	 * @return Os lados do cadrado multiplicados por catro
	 */
	public int perímetroCadrado(int lado) {
		if (lado < 0)
			return 0;
		else
			return lado * 4;
	}//Cerre do constructor

	/**
	 * Constructor para a area dun cadrado
	 * @param lado Define a lonxitude dos lados dun cadrado
	 * @return Os lados do cadrado multiplicados por dous
	 */
	public int areaCadrado(int lado) {
		if (lado < 0)
			return 0;
		else
			return lado * lado;
	}//Cerre do constructor

	/**
	 * Constructor que define o teorema de pitágoras
	 * @param catetoA Define o valor do primeiro cateto
	 * @param catetoB Define o valor do segundo cateto
	 * @return O valor da hipotenusa basándose no teorema de pitágoras
	 */
	public double teoremaPitagoras(int catetoA, int catetoB) {
		double hipotenusa;

		if (catetoA < 0 || catetoB < 0)
			return 0;
		else {
			hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
			return hipotenusa;
		}
	}

	/**
	 * Constructor que define o teorema de pitágoras despexado
	 * @param hipotenusa Define o valor da hipotenusa
	 * @param catetoA Define o valor do primeiro cateto
	 * @return O valor do segundo cateto despexando a fórmula do teorema de pitágoras
	 */
	public double teoremaPitagoras2(double hipotenusa, double catetoA) {
		double catetoB;

		if (hipotenusa < 0 || catetoA < 0 || hipotenusa < catetoA)
			return 0;
		else {
			catetoB = Math.sqrt(catetoA * catetoA + hipotenusa * hipotenusa);
			return catetoB;
		}
	}//Cierre de los métodos
}//Cierre de la clase
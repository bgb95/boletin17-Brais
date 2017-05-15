package Exercicios;

public class DNI {

	public boolean eValido() {
		String numeroLetra="";
		String soloNumeros="";
		
		if (DNI.length() != 9 || Character.isLetter(this.DNI.chartAt(8))==false) {
			return false;
		}
		
		numeroLetra=(this.DNI.substring(8)).toUpperCase();
		soloNumeros=(this.DNI.substring(8)).toUpperCase();
		
		if(soloNumeros()==true && letraDNI.equals(numeroLetra)) {
			return true;
		}
		else
			return false;
	}
	
	private String letraDNI() {
		
		int miDNI=Integer.parseInt(this.DNI.substring(0,8));
		int resto=0;
		String miLetra="";
		String[] asignacionLetra={"T", "R", "W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		
		resto=miDNI%23;
		
		miLetra=asignacionLetra[resto];
		
		return miLetra;
	}
	
	private boolean soloNumeros() {
		
		int i,j=0;
		String numero="";
		String miDNI="";
		String[] unoNueve={"0","1","2","3","4","5","6","7","8","9"};
		
		for(i=0; i<this.letraDNI().length() - 1; i++) {
			numero =this.letraDNI().substring(i, i+1);
			
			for(j=0; j<unoNueve.length; j++) {
				if(numero.equals(unoNueve[j])) {
					miDNI=unoNueve[j];
				}
			}
		}
		
		if(miDNI.length()!=8)
			return false;
		else
			return true;
	}
}
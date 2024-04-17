package exa.clases;

public class FiltroAñoIgual extends Filtro {

	private int año;
	
	public FiltroAñoIgual(int año){
		this.año = año;
	}
	
	public boolean cumple(EPL elemento) {
		if ( ((PistaAudio) elemento).getAño() == año){
			return true;
		}else 
			return false;
	}
}

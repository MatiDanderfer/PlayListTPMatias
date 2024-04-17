package exa.clases;

public class FiltroAñoMenor extends Filtro{
	
	private int año;
	
	public FiltroAñoMenor(int año){
		this.año = año;
	}
	
	public boolean cumple(EPL elemento) {
		if ( ((PistaAudio) elemento).getAño() < año){
			return true;
		}else 
			return false;
	}
}

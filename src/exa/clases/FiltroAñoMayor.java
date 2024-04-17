package exa.clases;

public class FiltroAñoMayor extends Filtro{
	private int año;
	
	public FiltroAñoMayor(int año){
		this.año = año;
	}
	public boolean cumple(EPL elemento) {
		if ( ((PistaAudio) elemento).getAño() > año){
			return true;
		}else 
			return false;
	}
}

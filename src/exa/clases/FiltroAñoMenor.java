package exa.clases;

public class FiltroA�oMenor extends Filtro{
	
	private int a�o;
	
	public FiltroA�oMenor(int a�o){
		this.a�o = a�o;
	}
	
	public boolean cumple(EPL elemento) {
		if ( ((PistaAudio) elemento).getA�o() < a�o){
			return true;
		}else 
			return false;
	}
}

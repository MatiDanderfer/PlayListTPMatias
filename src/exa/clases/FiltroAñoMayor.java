package exa.clases;

public class FiltroA�oMayor extends Filtro{
	private int a�o;
	
	public FiltroA�oMayor(int a�o){
		this.a�o = a�o;
	}
	public boolean cumple(EPL elemento) {
		if ( ((PistaAudio) elemento).getA�o() > a�o){
			return true;
		}else 
			return false;
	}
}

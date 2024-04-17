package exa.clases;

public class FiltroID extends Filtro {
	public int id;
	
	public FiltroID(int id){
		this.id = id;
	}
	
	public boolean cumple(EPL elemento) {
		if ( ((PistaAudio) elemento).getId() == id){
			return true;
		}else 
			return false;
	}
}

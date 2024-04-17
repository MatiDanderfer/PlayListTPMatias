package exa.clases;

public class FiltroDuracionMayor extends Filtro {

	private int duracion;
	
	public FiltroDuracionMayor(int duracion){
		this.duracion = duracion;
	}
	
	public boolean cumple(EPL elemento) {
		if ( elemento.getDuracion() > duracion){
			return true;
		}else 
			return false;
	}

	
}

package exa.clases;

public class FiltroDuracionIgual extends Filtro {

	private int duracion;
	
	public FiltroDuracionIgual(int duracion){
		this.duracion = duracion;
	}

	
	public boolean cumple(EPL elemento) {
		if ( elemento.getDuracion() == duracion){
			return true;
		}else 
			return false;
	}

	
}

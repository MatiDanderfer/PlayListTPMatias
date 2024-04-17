package exa.clases;

public class FiltroDuracionMenor  extends Filtro {

	private int duracion;
	
	public FiltroDuracionMenor(int duracion){
		this.duracion = duracion;
	}
	
	public boolean cumple(EPL elemento) {
		if ( elemento.getDuracion() <  duracion){
			return true;
		}else 
			return false;
	}

}

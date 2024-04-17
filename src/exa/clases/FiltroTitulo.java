package exa.clases;

public class FiltroTitulo extends Filtro{
	public String titulo;
	
	public FiltroTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public boolean cumple(EPL elemento) {
		return (elemento.getTitulo().toLowerCase().contains(titulo.toLowerCase()));
	}
}

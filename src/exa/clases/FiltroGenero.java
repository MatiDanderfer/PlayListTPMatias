package exa.clases;

public class FiltroGenero extends Filtro{
	private String generoTest;
	
	public FiltroGenero (String genero){
		generoTest = genero;
	}
	
	public boolean cumple(EPL elemento) {
		return ((PistaAudio) elemento).getGenero().toLowerCase().contains(generoTest.toLowerCase());
	}
	
}

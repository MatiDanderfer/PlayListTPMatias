package exa.clases;

public class FiltroArtista extends Filtro{
	private String artista;
	
	public FiltroArtista(String artista){
		this.artista = artista;
	}
	
	public boolean cumple(EPL elemento) {
		return (((PistaAudio) elemento).getArtista().toLowerCase().equals(artista.toLowerCase()));
	}
}

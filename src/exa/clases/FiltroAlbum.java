package exa.clases;

public class FiltroAlbum extends Filtro{
	private String album;
	
	public FiltroAlbum(String album){
		this.album = album;
	}
	public boolean cumple(EPL elemento) {
		return (((PistaAudio) elemento).getAlbum().toLowerCase().equals(album.toLowerCase()));
	}
}

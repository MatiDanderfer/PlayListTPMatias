package exa.clases;

import java.util.ArrayList;
import java.util.List;

public class PistaAudio extends EPL {
	private int idCancion;
	private int duracion;
	private String artista;
	private String album;
	private int año;
	private String genero ;
	private String comentarios;
	
	public PistaAudio(String titulo, int duracion, String artista, String album, int año,String genero, String comentario){
		super();
		super.setTitulo(titulo);
		this.duracion  =duracion;
		this.album = album;
		this.artista = artista;
		this.año = año;
		this.comentarios = comentario;
		this.genero = genero;
	}
	public void setId (int id){
		this.idCancion = id;
	}
	public void setDuracion (int duracion){
		this.duracion = duracion;
	}
	public void setArtista (String artista){
		this.artista = artista;
	}
	public void setAlbum (String album){
		this.album = album;
	}
	public void setAño (int año){
		this.año = año;
	}
	public void setGenero (String genero){
		this.genero = genero;
	}
	public void setComentario (String comentario){
		this.comentarios = comentario;
	}
	public String getArtista (){
		return artista;
	}
	public int getDuracion (){
		return duracion;
	}
	public String getAlbum (){
		return album;
	}
	public int getAño (){
		return año;
	}
	public String getComentario (){
		return comentarios;
	}
	public String getGenero (){
		return genero;
	}
	public int getId(){
		return idCancion;
	}
	public String toString(){
		String separar = " || ";
		String salida = "";
		salida += "Titulo: " + getTitulo() + separar ;
		salida += "Artista: " + getArtista() + separar;
		salida += "Album: " + getAlbum() + separar ;
		salida += "Generos: " + getGenero() + separar;
		salida += "Año: " + getAño() + separar;
		salida += "Duracion: " + getDuracion() + separar + "\n" ;								
		return salida;
		
	}
	public List<EPL> busqueda(Filtro ff) {
		List<EPL> salida = new ArrayList<>();
		if(ff.cumple(this)){
			salida.add(this);
			return salida;
		}
		return salida;
	}
	
}

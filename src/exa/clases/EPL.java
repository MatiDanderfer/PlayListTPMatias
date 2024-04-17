package exa.clases;

import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;



public abstract class EPL {
	private String titulo;
	
	public String getTitulo (){
		return titulo;
	}
	public void setTitulo (String titulo){
		this.titulo = titulo;
	}
	public abstract int getDuracion();
	public abstract List<EPL> busqueda (Filtro ff);
}	

package exa.clases;

import java.util.ArrayList;
import java.util.List;

public class PlaylistAutomatica extends EPL{

	private Playlist nueva;
	private String name;
	private Filtro criterio;
	
	
	public PlaylistAutomatica(Playlist raiz,String name, Filtro entrada){
		nueva = raiz;
		criterio = entrada;
		this.name = name;
	}
	public String toString(){
		String salida = "Playlist: " + getTitulo() + "\n";
		ArrayList<EPL> aux = (ArrayList<EPL>) nueva.busqueda(this.criterio);
		for (int i=0;i < aux.size() ; i++){
			salida += aux.get(i).toString();
		}
		return salida;
	}
	public int getDuracion() {
		ArrayList<EPL> aux = (ArrayList<EPL>) nueva.busqueda(this.criterio);
		int duraaux= 0;
		for(int i=0;i < aux.size();i++){
			duraaux += aux.get(i).getDuracion();
		}
		return duraaux;
	}
	public List<EPL> busqueda(Filtro ff) {
		ArrayList<EPL> aux = (ArrayList<EPL>) nueva.busqueda(this.criterio);
		List<EPL> salida = new ArrayList<>();
		for (int i=0; i < aux.size(); i++){
			EPL elem = (EPL) aux.get(i);
			List<EPL> aux2 = elem.busqueda(ff);
			salida.addAll(aux2);
		}
		return salida;
	}
	public String getTitulo(){
		return name;
	}
}

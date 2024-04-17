package exa.clases;

import java.util.List;

import java.util.ArrayList;

public class Playlist extends EPL {
	
	private List<EPL> contPlaylist = new ArrayList<EPL>();
	
	public Playlist(String nombre){
		super();
		super.setTitulo(nombre);
		
	}
	public Playlist getCopia (){
		Playlist salida = new Playlist("Copia de " + this.getTitulo());
		for (int i=0;i < contPlaylist.size();i++){
			salida.addElemento(contPlaylist.get(i));
		}
		return salida;
		
	}
	public void addElemento (EPL nuevo){
		contPlaylist.add(nuevo);
	}
	public int getDuracion (){
		int duracionOut = 0;
		for (int i =0; i < contPlaylist.size();i++){
			duracionOut += contPlaylist.get(i).getDuracion();
		}
		return duracionOut;
	}
	public boolean esVacia (){
		if (contPlaylist.size() == 0){
			return true;
		}else
			return false;
	}
	public void removeElemento (String titulo){
		boolean esta = false;
		for(int i=0;i < contPlaylist.size() && !esta;i++){
			if (contPlaylist.get(i).getTitulo() == titulo){
				contPlaylist.remove(i);
				esta = true;
			}
		}
	}
	public int getCantidadElementos (){
		return contPlaylist.size();
	}	
	public List<EPL> busqueda (Filtro concatena){
		List<EPL> salida = new ArrayList<>();
		for (int i=0; i < contPlaylist.size(); i++){
			EPL elem = (EPL) contPlaylist.get(i);
			List<EPL> aux = elem.busqueda(concatena);
			salida.addAll(aux);
		}
		return salida;
	}	
	public String toString(){
		String retorna = " ";
		retorna += "Playlist: " + getTitulo() + "\n";
		for (int i =0;i < contPlaylist.size(); i++){
			retorna += contPlaylist.get(i).toString();
		}
		return retorna;
		
	}
	public void cambiaSong (int pos1, int pos2){
		EPL aux1 = contPlaylist.get(pos1-1);
		EPL aux2 = contPlaylist.get(pos2-1);
		contPlaylist.set(pos1-1, aux2);
		contPlaylist.set(pos2-1, aux1);
	}
}

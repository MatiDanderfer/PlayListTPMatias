package exa.clases;

import java.util.List;

public class EjemplosGuia {

		public static void main (String args[]){
			//Declaro las pistas
			PistaAudio ej1 = new PistaAudio("El Tiempo No Para", 311, "Bersuit Vergarabat", "De la cabeza", 2002, "Rock nacional", "Nada");
			PistaAudio ej2 = new PistaAudio("Mi caramelo", 290, "Bersuit Vergarabat", "De la cabeza", 2002, "Rock nacional", "Nada");
			PistaAudio ej3 = new PistaAudio("Party Rock Anthem", 408, "LMFAO", "Sorry for Party Rocking", 2011, "Electro pop","Nada");
			PistaAudio ej4 = new PistaAudio("Sorry for Party Rocking", 421, "LMFAO", "Sorry for Party Rocking", 2011, "Electro pop", "Nada");
			PistaAudio ej5 = new PistaAudio("Fix you",255,"Coldplay","X&Y",2005,"Rock alternativo","Nada");
			PistaAudio ej6 = new PistaAudio("Speed of Sound",455,"Coldplay","X&Y",2005,"Rock alternativo","Nada");
			PistaAudio ej7 = new PistaAudio("Viva la vida",320, "Coldplay","Viva la vida",2008, "Rock alternativo","Nada");
			PistaAudio ej8 = new PistaAudio("Whit or whitout you",360,"U2","The Joshua Tree",1987,"Rock", "Nada");
			PistaAudio ej9 = new PistaAudio("Vertigo",355,"U2","How to Dismantle an Atomic Bomb",2004,"Rock", "Nada");
			PistaAudio ej10 = new PistaAudio("City of Blinding Lights",284,"U2","How to Dismantle an Atomic Bomb",2004,"Rock", "Nada");
			PistaAudio ej11 = new PistaAudio("A luz de la luna",438,"El Indio Solari","Pajaritos, bravos muchacitos",2013,"rock nacional","Nada");
			PistaAudio ej12 = new PistaAudio("Yo Canibal",258,"Patricio rey y sus redonditos de ricota", "Lobo Suelto, Cordero atado",1993,"Rock Nacional","Nada");
			
			//Declaro las playlist
			
			Playlist ClasicRock = new Playlist("Clasicos del Rock");
			Playlist lamejor = new Playlist("La mejor");
			Playlist coldplay = new Playlist("Coldplay");
			Playlist elindio = new Playlist("El Indio");
			Playlist general = new Playlist("Raiz");
			
			//Agrego las pistas
			
			ClasicRock.addElemento(ej1);
			ClasicRock.addElemento(ej2);
			ClasicRock.addElemento(ej8);
			ClasicRock.addElemento(ej9);
			ClasicRock.addElemento(ej10);
			ClasicRock.addElemento(ej12);
			lamejor.addElemento(ej3);
			lamejor.addElemento(ej4);
			lamejor.addElemento(ej7);
			lamejor.addElemento(ej12);
			coldplay.addElemento(ej5);
			coldplay.addElemento(ej6);
			coldplay.addElemento(ej7);
			elindio.addElemento(ej12);
			elindio.addElemento(ej11);
			general.addElemento(ej1);
			general.addElemento(ej2);
			general.addElemento(ej3);
			general.addElemento(ej4);
			general.addElemento(ej5);
			general.addElemento(ej6);
			general.addElemento(ej7);
			general.addElemento(ej8);
			general.addElemento(ej9);
			general.addElemento(ej10);
			general.addElemento(ej11);
			general.addElemento(ej12);
			
			//Punto 3) de la guia
			
			System.out.println(ClasicRock);
			System.out.println(lamejor);
			System.out.println(coldplay);
			System.out.println(elindio);
			
			
			//Punto 4 de la guia
			//inciso a)
			
			Filtro mayor400 = new FiltroDuracionMayor(400);
			System.out.println("Mayores a 400 seg :" +  " \n");
			System.out.println("\n" +"Busqueda en "+ general.getTitulo() + "\n " + general.busqueda(mayor400));
			
			//inciso b)
			
			Filtro generoRock = new FiltroGenero("rock");
			System.out.println("Filtro genero Rock: \n");
			System.out.println("\n" +"Busqueda en "+ general.getTitulo() + "\n" + general.busqueda(generoRock));
			
			
			//inciso c)
			
			Filtro noLMFAO = new FiltroNOT(new FiltroArtista("LMFAO"));
			Filtro incisoc = new FiltroAND(generoRock,noLMFAO);
			System.out.println("Filtro de rock y no LMFAO: \n");
			System.out.println("\n" +"Busqueda en "+ general.getTitulo() + "\n" + general.busqueda(incisoc));
			
			
			//inciso d)
			Filtro mayor2006 = new FiltroAñoMayor(2006);
			Filtro artColdplay = new FiltroArtista("coldplay");
			Filtro cond1 = new FiltroAND(generoRock,mayor2006);
			Filtro cond2 = new FiltroAND(generoRock, artColdplay);
			Filtro condFinal = new FiltroOR(cond1,cond2);
			System.out.println("Filtro compuesto de inciso d: ");
			System.out.println("\n" +"Busqueda en "+ general.getTitulo() + "\n" + general.busqueda(condFinal));
			
			//inciso 5
			
			System.out.println("\n Inciso 5 de la guia \n");
			System.out.println("Duracion de " + ClasicRock.getTitulo() + ": " + ClasicRock.getDuracion());
			System.out.println("Duracion de " + elindio.getTitulo() + ": " + elindio.getDuracion());
			System.out.println("Duracion de " + lamejor.getTitulo() + ": " + lamejor.getDuracion());
			System.out.println("Duracion de " + coldplay.getTitulo() + ": " + coldplay.getDuracion());
			List<EPL> testguia = general.busqueda(mayor400);
			int auxdur = 0;
			for (EPL epl : testguia) {
				auxdur += epl.getDuracion();
			}
			System.out.println("Duracion de las pistas mayores a 400: " + auxdur);
			
			//Inciso 6
			
			
			Playlist copiaMejor = lamejor.getCopia();
			System.out.println(" \n Creo copia de playlist lamejor \n");
			copiaMejor.setTitulo("La mejor++");
			copiaMejor.cambiaSong(1,3);
			System.out.println("Cambio nombre y intercambio 2 canciones \n");
			System.out.println(copiaMejor);
			System.out.println(lamejor);
			
			
			//Inciso 7 
			System.out.println("\n Creo la PlaylistAutomatica con filtro de coldplay: \n");
			Filtro nuenue = new FiltroArtista("Coldplay");
			PlaylistAutomatica autoCold = new PlaylistAutomatica( general, "Todo lo de Coldplay",nuenue);
			System.out.println(autoCold);
			System.out.println("Duracion: " + autoCold.getDuracion()+ "\n");
			
			// inciso 8
			System.out.println("Agrego la pista de audio Paradise e imprimo la playlist automatica: \n");
			PistaAudio paradise = new PistaAudio("Paradise", 365, "Coldplay", "Mylo Xyloto", 2011, "Rock alternativo", "Nada");
			general.addElemento(paradise);
			System.out.println(autoCold);
			System.out.println("Duracion: " + autoCold.getDuracion());
		}
}

package exa.clases;

public class FiltroNOT extends Filtro{
	private Filtro f1;
	
	public FiltroNOT(Filtro f1){
		this.f1 = f1;	
	}
	
	public boolean cumple(EPL elem){
		return !(f1.cumple(elem));
	}
}

package exa.clases;

public class FiltroOR extends FiltroCompuesto{
	
	public FiltroOR(Filtro f1, Filtro f2){
		super(f1, f2);
	}
	
	public boolean cumple(EPL elem){
		return (super.getFiltro1().cumple(elem) || super.getFiltro2().cumple(elem));
	}

}

package exa.clases;

public abstract class FiltroCompuesto extends Filtro{
	private Filtro f1;
	private Filtro f2;
	
	public FiltroCompuesto(Filtro f1 , Filtro f2){
		this.f1 = f1;
		this.f2 = f2;
	}
	public Filtro getFiltro1 (){
		return this.f1;
	}
	public Filtro getFiltro2 (){
		return f2;
	}
	public void setFiltro1 ( Filtro f1){
		this.f1 = f1;
	}
	public void setFiltro2 (Filtro f2){
		this.f2 = f2;
	}
}

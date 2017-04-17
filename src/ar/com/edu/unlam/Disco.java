package ar.com.edu.unlam;

public class Disco {
	
	//atributos
	
	private Double radioInterior;
	private Double radioExterior;
	
	
	//constructor
	
	public Disco(Double radioInterior,Double radioExterior) 
	{
		this.radioInterior=radioInterior;
		this.radioExterior=radioExterior;
		
	}
	
	//metodos
	
	public Double perimetroInterior()
	{
		Double perimetroRadioInterior=0.0;
		
		perimetroRadioInterior=2*Math.PI*radioInterior;
		
		return perimetroRadioInterior;
	}
	
	/////////////////////////////////////////////////
	
	public Double perimetroExterior()
	{
		Double perimetroRadioExterior=0.0;
		
		perimetroRadioExterior=2*Math.PI*radioExterior;
		
		return perimetroRadioExterior;
	}
	
	/////////////////////////////////////////////////

	public Double calcularSuperficie(){
		
		Double superficieDelDisco = 0.0;
		Double superficieRadioExterior = 0.0;
		Double superficieRadioInterior = 0.0;
		
		superficieRadioExterior=Math.PI*radioExterior*radioExterior;
		
		superficieRadioInterior=Math.PI*radioInterior*radioInterior;
		
		superficieDelDisco=superficieRadioExterior-superficieRadioInterior;
		
		return superficieDelDisco;
	}

	
	//getters and setter
	
	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
	
	
	
	
}

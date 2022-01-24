package objetos;

public class vehiculo {

	protected String matricula;
	protected String marca;
	protected String color;
	protected String marcaR;
	protected double diametroDelant;
	protected double diametroTrase;
	
	public vehiculo(String matricula, String marca, String color, String marcaR, double diametroDelant, double diametroTrase) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
		this.marcaR = marcaR;
		this.diametroDelant = diametroDelant;
		this.diametroTrase = diametroTrase;
	}
	
}

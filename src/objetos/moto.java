package objetos;

public class moto extends vehiculo {

	public moto(String matricula, String marca, String color, String marcaR, double diametroDelant,
			double diametroTrase) {
		super(matricula, marca, color, marcaR, diametroDelant, diametroTrase);

	}

	@Override
	public String toString() {
		return "moto [matricula=" + matricula + ", marca=" + marca + ", color=" + color + ", marcaR=" + marcaR
				+ ", diametroDelant=" + diametroDelant + ", diametroTrase=" + diametroTrase + "]";
	}

}

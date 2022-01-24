package objetos;

public class coche extends vehiculo {

	public coche(String matricula, String marca, String color, String marcaR, double diametroDelant,
			double diametroTrase) {
		super(matricula, marca, color, marcaR, diametroDelant, diametroTrase);

	}

	@Override
	public String toString() {
		return "coche [matricula=" + matricula + ", marca=" + marca + ", color=" + color + ", marcaR=" + marcaR
				+ ", diametroDelant=" + diametroDelant + ", diametroTrase=" + diametroTrase + "]";
	}

}

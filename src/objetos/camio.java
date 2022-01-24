package objetos;

public class camio extends vehiculo {

	public camio(String matricula, String marca, String color, String marcaR, double diametroDelant,
			double diametroTrase) {
		super(matricula, marca, color, marcaR, diametroDelant, diametroTrase);
	}

	@Override
	public String toString() {
		return "camio [matricula=" + matricula + ", marca=" + marca + ", color=" + color + ", marcaR=" + marcaR
				+ ", diametroDelant=" + diametroDelant + ", diametroTrase=" + diametroTrase + "]";
	}

}

package main;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import objetos.*;

public class vehiclesApp {

	public static coche c1 = null;
	public static moto m1 = null;
	
	public static void main(String[] args) {
		String cocheOMoto;

		cocheOMoto = JOptionPane.showInputDialog("Que quieres introducir, Coche o Moto?");
		datos(cocheOMoto);

	}

	public static void datos(String cocheOMoto) {
		String matricula, marca, color, marcaR;
		double diametreDevant, diametreDarrere;
		
		// Comprovamos que la matricula
		do {
			matricula = JOptionPane.showInputDialog("Intoduce la matricula del vehiculo.");
			if (!Pattern.matches("[0-9]{4}[a-zA-Z]{2,3}", matricula)) {
				JOptionPane.showMessageDialog(null, "La matricula deba contener 4 numeros y 2/3 letras");
			}
		} while (!Pattern.matches("[0-9]{4}[a-zA-Z]{2,3}", matricula));

		marca = JOptionPane.showInputDialog("Intoduce la marca del vehiculo");
		color = JOptionPane.showInputDialog("Intoduce el color del vehiculo");
		marcaR = JOptionPane.showInputDialog("Intoduce la marca de la rueda");
		
		// Introducimos el diametro de las ruedas delanteras
		do {
			diametreDevant = Double.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de las ruedas delanteras"));
		} while (diametreDevant > 0.4 && diametreDevant < 4);

		// Introducimos el diametro de las ruedas traseras
		do {
			diametreDarrere = Double.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de las ruedas traseras"));
		} while (diametreDarrere > 0.4 && diametreDarrere < 4);
				
		if (cocheOMoto.equals("coche")) {
			c1 = new coche(matricula, marca, color, marcaR, diametreDevant, diametreDarrere);
		} else if (cocheOMoto.equals("moto")) {
			m1 = new moto(matricula, marca, color, marcaR, diametreDevant, diametreDarrere);
		}
	}

}

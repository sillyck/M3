package main;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import objetos.*;

public class vehiclesApp {

	public static void main(String[] args) {
		String matricula;
		double diametreDevant, diametreDarrere;

		// Comprovamos que la matricula este bien
		do {
			matricula = JOptionPane.showInputDialog("Intoduce la matricula del vehiculo.");
			if (!Pattern.matches("[0-9]{4}[a-zA-Z]{2,3}", matricula)) {
				JOptionPane.showMessageDialog(null, "La matricula deba contener 4 numeros y 2/3 letras");
			}
		} while (!Pattern.matches("[0-9]{4}[a-zA-Z]{2,3}", matricula));

		//Introducimos el diametro de las ruedas delanteras
		do {
			diametreDevant = Double.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de las ruedas delanteras"));
		} while (diametreDevant > 0.4 && diametreDevant < 4);
		
		//Introducimos el diametro de las ruedas traseras
		do {
			diametreDarrere = Double.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de las ruedas traseras"));
		} while (diametreDarrere > 0.4 && diametreDarrere < 4);

		veiculo c1 = new veiculo(matricula, "nissan", "negro", "michelin", 19, 19);

	}

}

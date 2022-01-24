package main;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import objetos.*;

public class vehiclesApp {

	public static coche c1 = null;
	public static moto m1 = null;
	public static camio ca1 = null;
	public static titularVehicle t1 = null;
	public static titularVehicle t2 = null;
	public static int cont=0;

	public static void main(String[] args) {
		String cocheOMotoOCamio, titularONo;

		titularVehicle();

		do {
			cocheOMotoOCamio = JOptionPane
					.showInputDialog("Que quieres introducir, Coche o Moto o Camio? (0 para salir)");
			if (cocheOMotoOCamio.equals("0")) {
				break;
			} else {
				datos(cocheOMotoOCamio);
			}
		} while (!cocheOMotoOCamio.equals("0"));
		
		titularONo = JOptionPane.showInputDialog("El titular sera el conductor?");
		if(titularONo.equals("no")) {
			titularVehicle();
		}

		System.out.println(c1);
		System.out.println(m1);
		System.out.println(ca1);
		
		
	}

	public static void datos(String cocheOMotoOCamio) {
		String matricula, marca, color, marcaR;
		double diametreDevant, diametreDarrere;

		System.out.println(cocheOMotoOCamio);
		
		// Comprovamos que la matricula
		do {
			matricula = JOptionPane.showInputDialog("Intoduce la matricula del vehiculo.");
			if (!Pattern.matches("[0-9]{4}[a-zA-Z]{2,3}", matricula)) {
				JOptionPane.showMessageDialog(null, "La matricula debe contener 4 numeros y 2/3 letras");
			}
		} while (!Pattern.matches("[0-9]{4}[a-zA-Z]{2,3}", matricula));

		marca = JOptionPane.showInputDialog("Intoduce la marca del vehiculo");
		color = JOptionPane.showInputDialog("Intoduce el color del vehiculo");
		marcaR = JOptionPane.showInputDialog("Intoduce la marca de la rueda");

		// Introducimos el diametro de las ruedas delanteras
		do {
			diametreDevant = Double
					.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de las ruedas delanteras"));
		} while (diametreDevant < 0.4 && diametreDevant > 4);

		// Introducimos el diametro de las ruedas traseras
		do {
			diametreDarrere = Double
					.parseDouble(JOptionPane.showInputDialog("Intoduce el diametro de las ruedas traseras"));
		} while (diametreDarrere < 0.4 && diametreDarrere > 4);

		if (cocheOMotoOCamio.equals("coche")) {
			c1 = new coche(matricula, marca, color, marcaR, diametreDevant, diametreDarrere);
		} else if (cocheOMotoOCamio.equals("moto")) {
			m1 = new moto(matricula, marca, color, marcaR, diametreDevant, diametreDarrere);
		} else if (cocheOMotoOCamio.equals("camio")) {
			ca1 = new camio(matricula, marca, color, marcaR, diametreDevant, diametreDarrere);
		}
	}

	public static void titularVehicle() {
		String nom, cognom, data, llicencia, assegurança, garatge;
		boolean assegurançaBoo, garatgeBoo;
		
		cont++;
		
		nom = JOptionPane.showInputDialog("Intoduce el nombre del titular");
		cognom = JOptionPane.showInputDialog("Intoduce el apellido del titular");
		data = JOptionPane.showInputDialog("Intoduce la fecha de caducidad del carnet");
	
			do {
				llicencia = JOptionPane.showInputDialog("Que licencia tiene");
				
			} while (!llicencia.equals("A") && !llicencia.equals("B") && !llicencia.equals("C"));
			

		assegurança = JOptionPane.showInputDialog("Intoduce si tiene asseguradora o no");
		if (assegurança.equals("si")) {
			assegurançaBoo = true;
		} else {
			assegurançaBoo = false;
		}

		garatge = JOptionPane.showInputDialog("Intoduce si tiene garaje o no");
		if (garatge.equals("si")) {
			garatgeBoo = true;
		} else {
			garatgeBoo = false;
		}
		
		if(cont==1) {
			t1 = new titularVehicle(nom, cognom, data, llicencia, assegurançaBoo, garatgeBoo);
		}else if(cont==2) {
			t2 = new titularVehicle(nom, cognom, data, llicencia, assegurançaBoo, garatgeBoo);
		}
		
	}

}

package objetos;

public class titularVehicle extends persona{

	protected boolean asseguran�a;
	protected boolean garatge;
	
	public titularVehicle(String nom, String cognom, String dataNeixament, String llicenciaConduir, boolean asseguran�a,
			boolean garatge) {
		super(nom, cognom, dataNeixament, llicenciaConduir);
		this.asseguran�a = asseguran�a;
		this.garatge = garatge;
	}
	
	
}

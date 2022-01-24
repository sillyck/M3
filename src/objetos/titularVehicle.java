package objetos;

public class titularVehicle extends persona{

	protected boolean assegurança;
	protected boolean garatge;
	
	public titularVehicle(String nom, String cognom, String dataNeixament, String llicenciaConduir, boolean assegurança,
			boolean garatge) {
		super(nom, cognom, dataNeixament, llicenciaConduir);
		this.assegurança = assegurança;
		this.garatge = garatge;
	}
	
	
}

package objetos;

public class titularVehicle extends persona{

	protected boolean asseguranša;
	protected boolean garatge;
	
	public titularVehicle(String nom, String cognom, String dataNeixament, String llicenciaConduir, boolean asseguranša,
			boolean garatge) {
		super(nom, cognom, dataNeixament, llicenciaConduir);
		this.asseguranša = asseguranša;
		this.garatge = garatge;
	}
	
	
}

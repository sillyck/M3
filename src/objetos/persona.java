package objetos;

public class persona {

	protected String nom;
	protected String cognom;
	protected String dataNeixament;
	protected String llicenciaConduir;
	
	public persona(String nom, String cognom, String dataNeixament, String llicenciaConduir) {
		this.nom = nom;
		this.cognom = cognom;
		this.dataNeixament = dataNeixament;
		this.llicenciaConduir = llicenciaConduir;
	}

	public String getLlicenciaConduir() {
		return llicenciaConduir;
	}
	
}

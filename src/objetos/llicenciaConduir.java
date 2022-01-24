package objetos;

public class llicenciaConduir {

	protected int ID;
	protected String tipusLlicencia;
	protected String nom;
	protected String dataCaducitat;
	
	public llicenciaConduir(int iD, String tipusLlicencia, String nom, String dataCaducitat) {
		ID = iD;
		this.tipusLlicencia = tipusLlicencia;
		this.nom = nom;
		this.dataCaducitat = dataCaducitat;
	}
	
	
}

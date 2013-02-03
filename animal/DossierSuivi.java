package animal;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DossierSuivi implements Serializable
{
	public String dossier;
	
	public DossierSuivi(String p_dossier){
		dossier=p_dossier;
	}
	
	public String getDossier(){
		return this.dossier;
	}
	
	public void setDossier(String dos){
		this.dossier=dos;
	}
}

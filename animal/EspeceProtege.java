package animal;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EspeceProtege extends Espece implements Serializable{
	public String espece_prot;
	
	public EspeceProtege(String p_espece, int p_duree, String p_esp) {
		super(p_espece, p_duree);
		espece_prot+=p_esp+" ceci est une espèce protégée";
	}

}

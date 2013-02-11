package animal;

import java.rmi.RemoteException;

@SuppressWarnings("serial")
public class EspeceProtege extends Espece{

	String nom;
	
	public EspeceProtege(String p_espece, int p_age_max,String p_nom) throws RemoteException {
		super(p_espece, p_age_max);
		nom=p_nom;
	}
	
	public String syntheseEspece() throws RemoteException{
		return super.syntheseEspece()+" avec un nom: "+
		nom+" et cette espèce est protégée";
	}
	
}

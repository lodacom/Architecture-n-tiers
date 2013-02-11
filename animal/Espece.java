package animal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class Espece extends UnicastRemoteObject implements EspeceInterface{
	String espece;
	int age_max;
	
	public Espece(String p_espece,int p_age_max) throws RemoteException{
		espece=p_espece;
		age_max=p_age_max;
	}
	
	public String getEspece() throws RemoteException{
		return espece;
	}
	
	public int getDureeVie() throws RemoteException{
		return age_max;
	}
	
	/**
	 * @author Lolo
	 * @return Une chaîne de caractère faisant la synthèse
	 * de l'espèce
	 */
	public String syntheseEspece() throws RemoteException{
		return "L'espèce de nom: "+espece+
				" sa limite d'age: "+age_max;
	}
}

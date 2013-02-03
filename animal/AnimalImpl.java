package animal;

import java.io.Serializable;

/*import java.rmi.RemoteException; en commentaire la version 1
import java.rmi.server.UnicastRemoteObject;
*/
@SuppressWarnings("serial")
/**
 * @author Lolo
 * S'il l'on veut que le serveur puisse obtenir des objets
 * en réponse, on doit rendre la classe sérialisable. Sinon
 * le serveur nous indiquera l'erreur "unmarshalling"
 */
public class AnimalImpl implements Serializable//extends UnicastRemoteObject implements Animal 
{
	public String nom;
	public String nomMaitre;
	public String race;
	public DossierSuivi dos;
	
	public AnimalImpl(String p_nom,String p_nomMaitre,String p_race,DossierSuivi p_dos) //throws RemoteException 
	{
		// TODO Auto-generated constructor stub
		nom=p_nom;
		nomMaitre=p_nomMaitre;
		race=p_race;
		dos=p_dos;
	}
	
	//@Override
	public String getNom() /*throws RemoteException*/ {
		// TODO Auto-generated method stub
		return this.nom;
	}

	//@Override
	public String getNomMaitre() /*throws RemoteException*/ {
		// TODO Auto-generated method stub
		return this.nomMaitre;
	}

	//@Override
	public String getRace() /*throws RemoteException*/ {
		// TODO Auto-generated method stub
		return this.race;
	}

	//@Override
	public void setDossier(String doss) /*throws RemoteException*/ {
		// TODO Auto-generated method stub
		
		this.dos.setDossier(doss);
	}

	//@Override
	public String getDossier() /*throws RemoteException*/ {
		// TODO Auto-generated method stub
		return this.dos.getDossier();
	}
	
	/**
	 * @author Lolo
	 * @return toutes les informations concernant l'animal
	 */
	public String toString(){
		return 	"Le nom: "+this.getNom()+
				" Le nom du maître: "+this.getNomMaitre()+
				" La race: "+this.getRace()+
				" Son dossier: "+this.dos.getDossier();
	}
}

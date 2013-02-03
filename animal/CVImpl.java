package animal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

@SuppressWarnings("serial")
/**
 * @author Lolo
 * @class classe stub pour le serveur
 * Attention il ne faut pas oublier le "UnicastRemoteObject" sinon
 * le Client ne pourra jamais connaître le stub
 */
public class CVImpl extends UnicastRemoteObject implements CabinetVeterinaire {
	public ArrayList<AnimalImpl> cabinet;
	
	public CVImpl() throws RemoteException{
		// TODO Auto-generated constructor stub
		this.cabinet=new ArrayList<AnimalImpl>();
		DossierSuivi dos1=new DossierSuivi("blabla");
		AnimalImpl anim1=new AnimalImpl("kiki", "Doudou", "kiki", dos1);
		
		DossierSuivi dos2=new DossierSuivi("blaxblax");
		AnimalImpl anim2=new AnimalImpl("Tina", "Pierre", "la pute", dos2);
		cabinet.add(anim1);
		cabinet.add(anim2);
	} 
	
	@Override
	/**
	 * @author Lolo
	 * @return un animal avec la classe AnimalImpl (issu de la version 1)
	 * @param un nom d'animal que l'on cherche
	 */
	public AnimalImpl rechercherAnimal(String p_nom) throws RemoteException {
		// TODO Auto-generated method stub
		int i=0;
		while(i<this.cabinet.size() && !this.cabinet.get(i).getNom().equals(p_nom)){
			i++;
		}
		if (i<this.cabinet.size()){
			return this.cabinet.get(i);
		}else{
			return null;
		}
	}
	
	public String syntheseEspece(Espece p_esp) throws RemoteException{
		return p_esp.toString();
	}

}

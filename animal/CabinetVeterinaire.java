package animal;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * @author Lolo
 * Interface héritant de Remote qui permet de mettre
 * en place le mécanisme de RMI
 */
public interface CabinetVeterinaire extends Remote {
	String rechercherAnimal(String p_nom)throws RemoteException;
	String syntheseEspece(Espece p_esp)throws RemoteException;
	void addPatient(String p_nom,String p_nomMaitre,String p_race,String p_dos)throws RemoteException;
	void deletePatient(String p_nom)throws RemoteException;
}

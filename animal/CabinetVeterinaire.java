package animal;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * @author Lolo
 * Interface héritant de Remote qui permet de mettre
 * en place le mécanisme de RMI
 */
public interface CabinetVeterinaire extends Remote {
	AnimalImpl rechercherAnimal(String p_nom)throws RemoteException;
	String syntheseEspece(Espece p_esp)throws RemoteException;
	void addPatient(AnimalImpl p_ani)throws RemoteException;
	void deletePatient(String p_nom)throws RemoteException;
}

package animal;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Animal extends Remote 
{
	String getNom()throws RemoteException;
	String getNomMaitre()throws RemoteException;
	String getRace()throws RemoteException;
	void setDossier(String dos)throws RemoteException;
	String getDossier()throws RemoteException;
}

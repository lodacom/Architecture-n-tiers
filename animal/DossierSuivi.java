package animal;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DossierSuivi extends Remote
{	
	public String getDossier()throws RemoteException;
	public void setDossier(String dos)throws RemoteException;
}

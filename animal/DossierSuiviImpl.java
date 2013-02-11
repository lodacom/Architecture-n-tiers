package animal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class DossierSuiviImpl extends UnicastRemoteObject implements DossierSuivi
{
	public String dossier;
	
	public DossierSuiviImpl(String p_dossier)throws RemoteException{
		dossier=p_dossier;
	}
	
	public String getDossier()throws RemoteException{
		return this.dossier;
	}
	
	public void setDossier(String dos)throws RemoteException{
		this.dossier=dos;
	}
}

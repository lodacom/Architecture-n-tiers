package animal;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EspeceInterface extends Remote{
	public String getEspece()throws RemoteException;
	public int getDureeVie()throws RemoteException;
	public String syntheseEspece()throws RemoteException;
}

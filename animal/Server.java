package animal;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RMIClassLoader;
import java.util.Properties;

public class Server 
{
	public Server() {}


	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {

		try {
			CVImpl obj = new CVImpl();
			
			if(System.getSecurityManager()==null){
	            System.setProperty("java.security.policy","/Users/Lolo/Documents/TP M1 S2/Archi-ntiers/src/animal/server.policy");
	            //changer le path si vous êtes sur un autre PC
	            System.setSecurityManager(new RMISecurityManager());
	        }
			
			//utilisation de la notion du codebase
			Properties p= System.getProperties();
			String url=p.getProperty("java.rmi.server.codebase");
			//Class ClasseServeur = RMIClassLoader.loadClass(url,"Espece");
			
			Registry registry = LocateRegistry.createRegistry(1100);
			if (registry==null){
				System.err.println("RmiRegistry not found");
			}else{
				registry.bind("CabinetVeterinaire", obj);
				//Naming.bind("Espece",(Remote)ClasseServeur.newInstance());
				System.err.println("Server ready");
			}
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}

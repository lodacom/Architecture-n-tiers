package animal;

//import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server 
{
	public Server() {}


	public static void main(String args[]) {

		try {
			CVImpl obj = new CVImpl();
			
			/*if(System.getSecurityManager()==null){
	            System.setProperty("java.security.policy","./server.policy");
	            System.setSecurityManager(new RMISecurityManager());
	        }ne fonctionne pas */
			
			Registry registry = LocateRegistry.createRegistry(1100);
			if (registry==null){
				System.err.println("RmiRegistry not found");
			}else{
				registry.bind("CabinetVeterinaire", obj);
				System.err.println("Server ready");
			}
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}

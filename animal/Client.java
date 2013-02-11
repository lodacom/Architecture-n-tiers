package animal;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client 
{
	private Client() {}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(1100);
			CabinetVeterinaire stub = (CabinetVeterinaire) registry.lookup("CabinetVeterinaire");
			//Animal stub= (Animal) registry.lookup("Animal");
			//System.out.println("Le nom: "+stub.getNom());
			//............................................................
			//version 2
			System.out.println("Saisissez un nom d'animal");
			String p_nom=sc.nextLine();
			AnimalImpl response_ani = stub.rechercherAnimal(p_nom);
			if (response_ani==null){
				System.out.println("Il n'y a pas l'animal que vous demandez");
			}else{
			System.out.println(response_ani.toString());
			}
			//............................................................
			//version 3
			EspeceProtege esp_prot=new EspeceProtege("singe",80,"Oranoutan");
			String response_esp = stub.syntheseEspece(esp_prot);
			System.out.println(response_esp);
			//............................................................
			//ajout de fonctionnalité
			DossierSuivi dos3=new DossierSuivi("Il va mourir");
			AnimalImpl ani3=new AnimalImpl("bibi","Zozo","race bibi",dos3);
			stub.addPatient(ani3);
			
			stub.deletePatient("bibi");
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}

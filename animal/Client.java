package animal;

import java.rmi.Naming;
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
			String response_ani = stub.rechercherAnimal(p_nom);
			if (response_ani==null){
				System.out.println("Il n'y a pas l'animal que vous demandez");
			}else{
			System.out.println(response_ani);
			}
			
			//String response_ani2 = stub.rechercherAnimal(p_nom);
			//System.out.println(response_ani2);
			//............................................................
			//version 3
			/*
			 * Si on ne met pas le codebase on obtient une exception Marshal
			 * c'est à dire que le serveur n'arrive pas à sérialiser la classe
			 * EspeceProtege pour pouvoir afficher
			 */
			/*EspeceInterface rev = (EspeceInterface) Naming.lookup("EspeceInterface");
			EspeceProtege esp_prot=new EspeceProtege("singe",80,"Oranoutan");
			String response_esp = stub.syntheseEspece(esp_prot);
			System.out.println(response_esp);*/
			//............................................................
			//ajout de fonctionnalité
			stub.addPatient("bibi","Zozo","race bibi","Il va mourir");
			
			stub.deletePatient("bibi");
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}

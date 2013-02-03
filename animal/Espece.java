package animal;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Espece implements Serializable{
	public String espece;
	public int duree;
	
	public Espece(String p_espece,int p_duree){
		espece=p_espece;
		duree=p_duree;
	}
	
	String getEspece(){
		return this.espece;
	}
	
	int getDureeVie(){
		return this.duree;
	}
	
	public String toString(){
		return "L'espèce: "+this.getEspece()+
				"La durée de vie:"+this.getDureeVie();
	}
}

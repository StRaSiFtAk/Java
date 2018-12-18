//import java.util.ArrayList;

public class Auto {

	String znacka;
	String druh;
	String spz;
	String poloha;
	String vodic;
	//ArrayList volneAuta;
	int pocetKm,ID;
	//ArrayList<String> volneAuta=new ArrayList<String>();
	
	
	public Auto(String znacka, String druh, String spz, String poloha, String vodic, int pocetKm,int ID){
		this.znacka = znacka;
		this.druh = druh;
		this.spz = spz;
		this.vodic = vodic;
		this.pocetKm = pocetKm;
		this.ID=ID;
		//volneAuta.add(this.ID+" "+this.znacka+" "+this.spz);
		System.out.println("Firma kupila auto znacky: "+znacka+" druh: "+druh+" SPZ: "+spz+" pocet km: "+pocetKm );
	}
	
	

	}
	

	
	
	
	
	


	
	


import java.util.ArrayList;

public class main {
	public int ucet=0;
	public static void main(String[] args) {
	
		Auto a1,a2;
		Vodic vodic;
		FrontOffice frontoffice;
		zakaznik Zakaznik;
		//NajdiAuto najdiauto;
		Zisk zisk;

		
		
		
		ArrayList<String> volneAuta=new ArrayList<String>();
		a1 = new Auto ("Skoda", "osobne", "BL678CI", "HQ","nikto", 12789,1);
		volneAuta.add(a1.ID+" "+a1.znacka+" "+a1.spz);
		a2 = new Auto ("Mercedes", "osobne", "BL000DD", "HQ","nikto", 0,2);
		volneAuta.add(a2.ID+" "+a2.znacka+" "+a2.spz);
		vodic=new Vodic("Martin", "Duty","ziadne",0);
		Zakaznik= new zakaznik("Denis","Bilik","BL678CI",3);
		System.out.println("Vyber auto:");
		System.out.println(volneAuta);
		frontoffice=new FrontOffice("Denis Bilik","osobne", 3);
		//najdiauto=new NajdiAuto("BL678CI","Denis Bilik");
		volneAuta.remove(0);
		zisk=new Zisk(50,0);
		
		System.out.println(volneAuta);
		
	}
}

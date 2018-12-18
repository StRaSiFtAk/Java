
public class zakaznik {
	String meno, priezvisko, spz;
	int pocetDni;
	
	zakaznik(String meno, String priezvisko, String spz, int pocetDni){
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.spz = spz;
		this.pocetDni = pocetDni;
		System.out.println("Novy zakaznik: "+meno+" "+priezvisko+" si chce prenajat auto: "+spz+" na dobu: "+pocetDni+" dni");
		
	}
}

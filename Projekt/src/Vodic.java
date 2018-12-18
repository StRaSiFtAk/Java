
public class Vodic {
	String meno, priezvisko, auto;
	int km;
	
	Vodic(String meno, String priezvisko, String auto, int km){
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.auto = auto;
		this.km = km;
		System.out.println("Firma zamestnala noveho vodica: "+meno+" "+priezvisko);
	}
}

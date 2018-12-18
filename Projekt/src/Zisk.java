
public class Zisk {
	int vklad,vyber;
	public int ucet;
	Zisk(int vklad, int vyber){
		main Main;
		this.vklad=vklad;
		this.vyber=vyber;
		//this.ucet=ucet;
		
		
		if(vyber==0) {
			ucet+=vklad;
			System.out.println("Vklad na ucet: "+vklad+"$ zostatok na ucte: "+ucet+"$");
		}
		if(vklad==0) {
			ucet=-vyber;
			System.out.println("Vyber z uctu: "+vyber+"$ zostatok na ucte: "+ucet+"$");
		}
	}

}

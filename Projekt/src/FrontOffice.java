
public class FrontOffice {
	String druh,meno;
	int pocetDni;
	FleetCoordinator fleetCoordinator;
	
	FrontOffice(String meno, String druh, int pocetDni){
		System.out.println("prijem zakaznika: "+meno);
		fleetCoordinator=new FleetCoordinator("spz");
	}

}

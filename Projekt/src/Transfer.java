
public class Transfer {
	String SPZ, vodic, Apoloha, Bpoloha;
	
	Transfer(String SPZ,String vodic, String Apoloha, String Bpoloha){
		this.SPZ=SPZ;
		this.vodic=vodic;
		this.Apoloha=Apoloha;
		this.Bpoloha=Bpoloha;
		System.out.println("Posielam vodica "+vodic+" , pre auto "+ SPZ+ " , dovezie ho z: "+Apoloha+" , do "+Bpoloha);
	}
	

}

package interfaceExample;

public class Samsung implements AndroidNew,AndroidOld {
	
	@Override
	public String util() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int logo() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void settings() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playstore() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void theme() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Samsung mo = new Samsung();
		mo.logo();
		mo.playstore();
		mo.settings();
		mo.theme();
	}

}

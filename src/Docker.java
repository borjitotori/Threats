public class Docker {

	private Interface dock1;
	 
	public Docker(Interface dock1){
	 
	this.dock1 = dock1;
	 
	}	 
	public void mensaje(){
	 
		dock1.mensaje();	 
	}
}
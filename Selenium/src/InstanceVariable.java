
public class InstanceVariable {
	
	String colorname,modelno;
	int speed,enginecapacity;
	
	void displayHyundaicardetails()
	{
		colorname="RED";
		modelno="HYUNDAIELANTRA";
		speed=100;
		enginecapacity=1400;
		
	}
	
	void displayLexuscardetails()
	{
		colorname="BLUE";
		modelno="LEXUSNS250";
		speed=120;
		enginecapacity=1600;
		
	}
	
	void displayBMWcardetails()
	{
		colorname="BLACK";
		modelno="BMW330";
		speed=140;
		enginecapacity=1800;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariable lexus=new InstanceVariable();
		lexus.displayLexuscardetails();
		System.out.println(lexus.modelno);
		
		
	}

}

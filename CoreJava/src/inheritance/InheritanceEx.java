package inheritance;

class AC {
	String company;
	String model;
	Float capacity;
	//AC(){}
	
	AC(String company, String model, Float capacity) {
		this.company = company;
		this.model = model;
		this.capacity = capacity;
	}
	
	String getDisplay() {
		return "AC [company=" + company + ", model=" + model + ", "
				+ "capacity=" + capacity + "]";
	}
	
	
}

class SmartAC extends AC{
	boolean wifi;
	boolean iotEnabled;
	public SmartAC(String company, String model, Float capacity,
			  boolean wifi, boolean iotEnabled) {
		super(company,model,capacity);
//		super.company = company;//		super.model = model;//		super.capacity = capacity;
		this.wifi = wifi;
		this.iotEnabled = iotEnabled;
	}	
	public String getACInfo() {
		return "SmartAC [company=" + company + ", model=" + model
				+ ", capacity=" + capacity + ",wifi=" + wifi + ", iotEnabled=" + iotEnabled + "]";
	}
	
}
public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AC a1=new AC("LG","2023",1.5f);
        System.out.println(a1.getDisplay());
        SmartAC sa1=new SmartAC("LG","2023",1.5f,true,false);
        System.out.println(sa1.getACInfo());
	}

}

package exceptionp;
class Age {
	boolean checkAge(int age) throws Exception
	{
		if (age>=18) {
			return true;
		} else {
			
			throw new Exception("Age is less than 18");
			
		}
	}
	public void finalize(){
		
	}
}
public class ThrowsAndThrow {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Age a =new Age();
		try {
			boolean check=a.checkAge(14);
			if (check) {
				System.out.println("You can vote");
			} 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}



public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String value= "Sunday";
         String result="";
         result=switch(value) {
         case "Sunday","Saturday"->"Holiday";
         case "Monday","Tuesday","Wednesday"->"Working";
             default-> "Not a day";
         };
//         result=switch(value) {
//         case "Sunday","Saturday": yield "Holiday";
//         case "Monday","Tuesday","Wednesday": yield "Working";
//             default:
//            	 yield "Not a day";
//         };
         System.out.println(result);
	}

}

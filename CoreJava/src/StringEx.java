//String vs StringBuffer vs StringBuilder
public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String name="KIET";       
//          System.out.println(name.hashCode());
//          name="KIET MCA";
//          System.out.println(name.hashCode());
//          String name1=new String("KIET1");
//          String name2="KIET1";
//          System.out.println(name.hashCode());
//          System.out.println(name1.hashCode());
//          System.out.println(name2.hashCode());
          StringBuffer bufname=new StringBuffer("MCA");
          System.out.println(bufname.hashCode());
          bufname=bufname.replace(0, bufname.length(), "MCA KIET");
          System.out.println(bufname.hashCode());
          StringBuffer bufname1=new StringBuffer("MCA");
          System.out.println(bufname1.hashCode());
          StringBuilder bulname=new StringBuilder("Java KIET");
          System.out.println(bulname.hashCode());
          bulname=bulname.replace(0, bulname.length(), "Java in KIET");
          System.out.println(bulname.hashCode());
         
          
	}

}

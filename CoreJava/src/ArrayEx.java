
public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[][]=new int[2][4];
		for(int i=0;i<2;i++)
		{
			for (int j=0;j<4;j++)
			{
				data[i][j]=i*j;
			}
		}
		for(int n[]:data) {
			for (int x:n) {
				System.out.print(x+",");
			}
		}
		
         int num[];  //array declaration
         num=new int[5];
         int num4[]= {10,23,45,67,10};
//         int num1[]=new int[10];
//         int []num2=new int[10];
//         int[] num3=new int[10];
//         for(int i=0;i<5;i++) {
//        	 num[i]=i+1+10;            
//         }
//         for(int n:num) {
//        	 System.out.println(n);
//         }
//         
//        for (int j=0;j<num.length;j++)
//        {
//        	System.out.println("num["+j+"]="+num[j]);
//        	//System.out.printf("num[%d]=%d\n",j,num[j]);
//        }
        
	}

}

import java.util.Random;

public class  RandomNumber{
	public static void main(String arg[]){
		Random rm=new Random();
		int  min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=1;i<=5;i++){
			int n=rm.nextInt(900)+100;
			min=Math.min(min,n);
			max=Math.max(max,n);
		}
		System.out.println("Minimum number is "+min);
		System.out.println("Maximum number is "+max);
		
	}
}

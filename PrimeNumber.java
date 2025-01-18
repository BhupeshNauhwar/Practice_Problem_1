
public class PrimeNumber{
	public static void main(String arg[]){
        	for(int num=1;num<=50;num++){

			if(isPrime(num)){
				System.out.print(num + " ");
			}
		}
	}
	public static boolean isPrime(int n){
		if(n<=1) return false;

		for(int i=2;i<=n/2;i++){
			if(n%i==0) return false;
		}
	return true;
	}
}


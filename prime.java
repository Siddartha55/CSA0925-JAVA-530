import java.util.*;
class prime{
	public static void main(String[] args){
  		int n,i,prime=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		n=s.nextInt();
		for(i=2;i<n;i++){
			if(n%i==0){
				System.out.println("it is a not prime num");
				prime=1;
				break;
			}
			}

			if(prime==0){
				System.out.println("it is a prime num");
			}
}
}
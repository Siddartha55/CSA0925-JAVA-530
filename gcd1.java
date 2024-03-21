import java.util.*;
class gcd1{
	public static void main(String[] args){
		int gcd=1,n1,n2,lcm;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		for(int i=1;i<=n1&&i<=n2;i++){
			if(n1%i==0 && n2%i==0){
				gcd=i;
			}
		}
		System.out.println("gcd"+gcd);
		lcm=(n1*n2)/gcd;
		System.out.println("lcm"+lcm);
	}
}
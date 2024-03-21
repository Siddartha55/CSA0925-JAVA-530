import java.util.*;
class gcd{
	public static void main(String args[]){
		int num,den,rem,lcm=0,gcd=0,n1,n2;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		num=(n1>n2)?n1:n2;
		den=(n1<n2)?n1:n2;
		rem=num%den;
		while(rem!=0){
			num=den;
			den=rem;
			rem=num%den;
		}
		gcd=den;
		System.out.println("gcd"+gcd);
		lcm=(n1*n2)/gcd;
		System.out.println("lcm"+lcm);
	}
}
import java.util.*;
class intrest{
	public static void main(String[] args){
		int p,n,r,si;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values of P,N and R : ");
		p=s.nextInt();
		n=s.nextInt();
		r=s.nextInt();
		si=(p*n*r)/100;
		System.out.println("Simple Interst is : "+si);
	}
}
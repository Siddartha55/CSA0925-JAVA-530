import java.util.*;
class fib{
	public static void main(String[] args){
		int n1=0,n2=1,n3=0,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value");
		n=s.nextInt();
		System.out.print(n1);
		System.out.print(n2);
		for(int i=2;i<n;i++)
		{
		n3=n1+n2;
		System.out.print(n3);
		n1=n2;
		n2=n3;
		}
	}
}
		
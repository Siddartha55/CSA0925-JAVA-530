import java.util.*;
class palindrome{
	public static void main(String[] args){
		int rem,rev=0,n,x;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n : ");
		n=s.nextInt();
		x=n;
		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(x==rev){
			System.out.println("it is palindrome");
		}
		else{
			System.out.println("it is not a palindrome");
		}
	}
}
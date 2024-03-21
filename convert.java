import java.util.*;
class convert{
	public static void main(String[] args){
		int n,rem,bin=0,i=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your num : ");
		n=s.nextInt();
		while(n!=0){
		rem=n%2;
		bin=bin+i*rem;
		n=n/2;
		i=i*10;
		}
		System.out.println("Binary num is "+bin);
		int x,reminder,j=1,oct=0;
		x=n;
		while(x!=0){
			reminder=x%8;
			oct=oct+reminder*j;
			j=j*10;
			x=x/8;
		}
		System.out.println("octal num is "+oct);
	}
}
import java.util.*;
class armstrong{
	public static void main(String[] args){
		int x,n,rem,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number : ");
		n=s.nextInt();
		x=n;
    		while(n!=0){
        		rem=n%10;
        		rev=rev+rem*rem*rem;
        		n=n/10;
    		}
    		if(x==rev){
        		System.out.println("it is a armstrong number");
    		}
    		else{
       	 		System.out.println("it is not a armstrong number");
    		}
	}
}
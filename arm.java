import java.util.*;
class arm{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int rem,rev=0,num,x;
		System.out.println("Enter the number : ");
		num=s.nextInt();
		x=num;
		while(num!=0){
			rem=num%10;
			rev=rev+rem*rem*rem;
			num=num/10;
		}
		if(rev==x){
			System.out.println("it is a armstrong num");
		}
		else{
			System.out.println("it is not armstrong num");
		}
	}
}
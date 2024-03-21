import java.util.*;
class lcm1{
	public static void main(String[] args){
		int lcm,n1,n2;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		lcm=(n1>n2)?n1:n2;
		while(true){
			if(lcm%n1==0 && lcm%n2==0){
				System.out.println("lcm"+lcm);
				break;
			}
			lcm++;
		}
	}
}
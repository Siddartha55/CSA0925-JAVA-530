import java.util.*;
class table{
	public static void main(String[] args){
		int n,m,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number : ");
		n=s.nextInt();
		System.out.println("Enter number : ");
		m=s.nextInt();
		for(i=1;i<=10;i++){
			System.out.println(n+" X "+i+" = "+n*i);
		}
		System.out.println();
		for(i=1;i<=10;i++){
			System.out.println(m+" X "+i+" = "+m*i);
		}
	}
}


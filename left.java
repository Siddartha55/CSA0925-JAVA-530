import java.util.*;
class left{
	public static void main(String[] args){
		int n,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of rows : ");
		n=s.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<2*(n-i)-1;j++){
				System.out.print(" ");
				}
			for(int k=0;k<=i;k++){
				System.out.print("* ");
				}
			System.out.println();
			}
		}
	}
import java.util.*;
class pyramid{
	public static void main(String[] args){
		int i,j,k,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		n=s.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<2*(n-i)-1;j++){
				System.out.print(" ");
				}
			for(k=0;k<2*i+1;k++){
				System.out.print("* ");
				}
			System.out.println();
			}
		}
	}
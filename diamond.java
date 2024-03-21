import java.util.*;
class diamond{
	public static void main(String[] args){
		int n,i,j,k,comp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of rows : ");
		n=s.nextInt();
		for(i=0;i<2*n-1;i++){
			if(i<n){
				comp=2*(n-i)-1;
			}
			else{
				comp=2*(i-n+1)+1;
			}
			for(j=0;j<comp;j++){
				System.out.print(" ");
				}
			for(k=0;k<2*n-comp;k++){
				System.out.print("* ");
				}
			System.out.println();
			}
	}
}
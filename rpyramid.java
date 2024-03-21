import java.util.*;
class rpyramid{
	public static void main(String[] args){
		int n,i,j,k;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of rows : ");
		n=s.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<2*i;j++){
				System.out.print(" ");
			}
			for(k=0;k<2*(n-i)-1;k++){
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}
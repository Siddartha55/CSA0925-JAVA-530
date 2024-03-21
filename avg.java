import java.util.*;
class avg{
	public static void main(String[] args){
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("enter array values : ");
		for(int i=0;i<5;i++){
			a[i]=s.nextInt();
		}
		double average=0;
		for(int i=0;i<5;i++){
			average=average+a[i];
		}
		average=average/5;
		System.out.println("the average is "+average);
	}
}
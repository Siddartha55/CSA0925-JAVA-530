import java.util.*;
class average{
	public static void main(string[] args){
		int a[i]={1,2,3,4,5};
		Scanner s=new Scanner(System.in);
		double average=0;
		for(int i=0;i<5;i++){
			average=average+a[i];
		}
		average=average/5;
		System.out.println("the average is "+average);
	}
}
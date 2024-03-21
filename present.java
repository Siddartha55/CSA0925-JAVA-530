import java.util.*;
class present{
	public static void main(String args[]){
		String str1,str2;
		Scanner s=new Scanner(System.in);
		str1=s.nextLine();
		str2=s.nextLine();
		boolean result=str1.contains(str2);
		if(result){
			System.out.println("present");
		}
		else{
			System.out.println("not present");
		}
	}
}
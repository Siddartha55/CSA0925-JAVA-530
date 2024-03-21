import java.util.*;
class vowels{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string : ");
		String str=s.nextLine();
		int vowels=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				vowels++;
				System.out.println(""+ch);
			}
		}
		System.out.println("vowels are "+vowels);
	}
}
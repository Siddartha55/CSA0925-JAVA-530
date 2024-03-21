import java.util.*;
class student{
	char name;
	int regno;
	double s1,s2,s3,s4,s5,avg,total=0;
	void gets(){
		regno=530;
		s1=82;
		s2=80;
		s3=88;
		s4=90;
		s5=77;
		
		}
	void cal(){
		total=s1+s2+s3+s4+s5;
		avg=total/2;
		}
	void display(){
		System.out.println("Name of the student : Siddartha");
		System.out.println("Register no : "+regno);
		System.out.println("Total marks : "+total);
		System.out.println("Average: "+avg);
		}
	public static void main(String[] args){
		student obj=new student();
		obj.gets();
		obj.cal();
		obj.display();
	}
}
import java.util.Scanner;
class abc
{

public static void main(String[] args)
{

Scanner sc= new Scanner(System.in);

String name,address;
double mobile_no; 
int age;

System.out.println("enter the name:");
name=sc.nextLine();


System.out.println("enter the address:");
address=sc.nextLine();

System.out.println("enter the age:");
age=sc.nextInt();

System.out.println("enter the mpbile no:");
mobile_no=sc.nextDouble();



System.out.println("name is ="+name);
System.out.println("address is ="+address);
System.out.println("mobile no ="+mobile_no);
System.out.println("age="+age);
}
}

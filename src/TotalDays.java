import java.util.Scanner;
public class TotalDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
Scanner one=new Scanner(System.in);
System.out.print("enter number of month:");
month=one.nextInt();
switch(month){
case 1: System.out.println("number of days in january is 31");  
         break;
case 2: System.out.println("in february if it is leap year 29 days otherwise 28");
        break;
case 3:System.out.println("31 days in march" );
        break;
case 4:System.out.println("30 days in april" );
        break;
case 5:System.out.println("31 days in may" );
		break;
case 6:System.out.println("30 days in june" );
		break;
case 7:System.out.println("31 days in july" );
		break;
case 8:System.out.println("31 days in august" );
		break;
case 9:System.out.println("30 days in september" );
		break;
case 10:System.out.println("31 days in october" );
		break;
case 11:System.out.println("30 days in november" );
		break;
case 12:System.out.println("31 days in december" );
		break;
default:System.out.println("you enterd wrong input" );
		break;
     
}
	}

}

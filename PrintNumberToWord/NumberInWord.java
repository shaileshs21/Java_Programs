import java.util.Scanner;

public class NumberInWord {

	public static void main(String[] args) {
		System.out.println("Enter Number:" );
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		obj.close();
		String no = Integer.toString(num);
		int len = no.length();
		if(len==0 || len > 4) {
			System.out.println("Invalid Input");
			return;
		}
		String tens_power[] = {"hundred", "thousand"};
		Number_check check = new Number_check();		
		
		if(len == 1) {
			String temp= check.one_digit(num);
			System.out.println(temp);
			return;
		}
		if(len==2) {
			String temp = check.two_digit(num);
			System.out.println(temp);
			return;
		}
		if(len==3) {
			String temp=check.one_digit(num/100);
			String temp1=check.two_digit(num%100);
			System.out.println(temp+" "+tens_power[0]+" "+temp1);
		}
		if(len==4) {
			String temp=check.one_digit(num/1000);
			num = num%1000;
			String temp1=check.one_digit(num/100);
			String temp2=check.two_digit(num%100);
		    System.out.println(temp+" "+tens_power[1]+" "+temp1+" "+tens_power[0]+" "+temp2);
		}

	   
	}
}

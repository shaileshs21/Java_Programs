
public class Number_check {
	String single_digits[] = { "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"};

	String two_digits[] = {"", "ten", "eleven", "twelve", "thirteen", "fourteen",
   "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

	String tens_multiple[] = {"", "", "twenty", "thirty", "forty", "fifty",
           "sixty", "seventy", "eighty", "ninety"};

	
	String one_digit(int num) {
		return single_digits[num];
	}
	
	String two_digit(int num) {
		if(num % 10 == 0) {
			if(num == 10) {
			return two_digits[1];
				}
			else {
				  return tens_multiple[num/10];
				}
			}
		else if(num/10 == 1) {
			return two_digits[num%10+1];
		}
		else {
			return tens_multiple[num/10]+" "+single_digits[num%10];
		}
	}
}

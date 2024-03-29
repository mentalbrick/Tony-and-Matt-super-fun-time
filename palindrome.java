/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
Find the largest palindrome made from the product of two 3-digit numbers. */

public class palindrome {
	public static void main (String[] args){
		String palindrome;
		Boolean isitthelargest;
		String largestpalindrome = "x";
		
		for(int x = 999; x==0; x--){
			for(int y=999; y==0; y--){
				palindrome = "" + x*y;
				for(int i=0; i<palindrome.length(); i++){
					if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-i))
						isitthelargest = false;
					else
						largestpalindrome = palindrome;
				}
			}
		}
		System.out.println(largestpalindrome);
	}

}

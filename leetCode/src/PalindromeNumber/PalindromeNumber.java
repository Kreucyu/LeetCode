package PalindromeNumber;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 11) return false;
        String number = String.valueOf(x);
        Character[] numbers = new Character[number.length()];
        for (int i = 0; i < number.length(); i++) {
            numbers[i] = number.charAt(i);
        }
        StringBuilder inversedNumber = new StringBuilder();
        for(int i = number.length() - 1; i >= 0; i--) {
            inversedNumber.append(numbers[i]);
        }
        return number.contentEquals(inversedNumber);
    }
}

package Easy.RomanToInteger;

public class MainRomanToInteger {
    public static void main(String[] args) {
        RomanToInteger exercise = new RomanToInteger();
        System.out.println("\nTests scenarios");
        System.out.println("\nInt: " + exercise.romanToInt("III"));
        System.out.println("\nInt: " + exercise.romanToInt("LVIII"));
        System.out.println("\nInt: " + exercise.romanToInt("MCMXCIV"));
    }
}

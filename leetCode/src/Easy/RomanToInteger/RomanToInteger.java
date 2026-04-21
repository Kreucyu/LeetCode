package Easy.RomanToInteger;

import java.util.ArrayList;
import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        int finalValue = 0;
        if(s.isEmpty() || s.length() > 15) return finalValue;

        ArrayList<String> romanNumbers = new ArrayList<>();
        HashMap<String, Integer> numbersMap = new HashMap<>();
        numbersMap.put("I", 1);
        numbersMap.put("V", 5);
        numbersMap.put("X", 10);
        numbersMap.put("L", 50);
        numbersMap.put("C", 100);
        numbersMap.put("D", 500);
        numbersMap.put("M", 1000);

        HashMap<String, Integer> differentNumbers = new HashMap<>();
        differentNumbers.put("IV", 4);
        differentNumbers.put("IX", 9);
        differentNumbers.put("XL", 40);
        differentNumbers.put("XC", 90);
        differentNumbers.put("CD", 400);
        differentNumbers.put("CM", 900);

        for(int i  = 0; i < s.length(); i++) {
            romanNumbers.add(String.valueOf(s.charAt(i)));
        }

        for(int i  = 0; i < romanNumbers.size(); i++) {
            if(i + 1 != romanNumbers.size()) {
                if (differentNumbers.containsKey(String.valueOf(romanNumbers.get(i) + romanNumbers.get(i + 1)))) {
                    finalValue += differentNumbers.get(String.valueOf(romanNumbers.get(i) + romanNumbers.get(i + 1)));
                    i++;
                    continue;
                }
            }
           finalValue += numbersMap.get(romanNumbers.get(i));
        }
        return finalValue;
    }
}

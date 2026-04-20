package RomanToInteger;

import java.util.ArrayList;
import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        int finalValue = 0;

        if(s.length() < 1 || s.length() > 15) return finalValue;

        ArrayList<Character> romanNumbers = new ArrayList<>();
        HashMap<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);

        for(int i  = 0; i < s.length(); i++) {
            romanNumbers.add(s.charAt(i));
        }

        for(int i  = 0; i < romanNumbers.size(); i++) {

           if(romanNumbers.get(i).equals('I')) {
               if(i + 1 != romanNumbers.size()) {
                   if(romanNumbers.get(i + 1).equals('V')) {
                       finalValue += 4;
                       i++;
                       continue;
                   }
                   if(romanNumbers.get(i + 1).equals('X')) {
                       finalValue += 9;
                       i++;
                       continue;
                   }
               }

               finalValue += 1;
               continue;
           }

           if(romanNumbers.get(i).equals('V')) {
               finalValue += 5;
               continue;
           }

            if(romanNumbers.get(i).equals('X')) {
                if(i + 1 != romanNumbers.size()) {
                    if (romanNumbers.get(i + 1).equals('L')) {
                        finalValue += 40;
                        i++;
                        continue;
                    }
                    if (romanNumbers.get(i + 1).equals('C')) {
                        finalValue += 90;
                        i++;
                        continue;
                    }
                }
                finalValue += 10;
                continue;
            }

            if(romanNumbers.get(i).equals('L')) {
                finalValue += 50;
                continue;
            }

            if(romanNumbers.get(i).equals('C')) {
                if(i + 1 != romanNumbers.size()) {
                    if (romanNumbers.get(i + 1).equals('D')) {
                        finalValue += 400;
                        i++;
                        continue;
                    }
                    if (romanNumbers.get(i + 1).equals('M')) {
                        finalValue += 900;
                        i++;
                        continue;
                    }
                }
                finalValue += 100;
                continue;
            }

            if(romanNumbers.get(i).equals('D')) {
                finalValue += 500;
                continue;
            }

            finalValue += 1000;


        }
        return finalValue;
    }
}

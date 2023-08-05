/*
 * Given a string s, find the length of the longest 
substring
 without repeating characters.


 */

import java.util.*;
import java.util.stream.Collectors;

public class longestSubstringLC {

    public static int max(List<Integer> arr) {
        if (arr.isEmpty()) {
            return 0;
        }
        int maximum = (int) arr.toArray()[0];

        for (int i = 1; i < arr.size(); i++) {
            if (maximum < (int) arr.toArray()[i]) {
                maximum = (int) arr.toArray()[i];
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        int maxStringLengthFound = 0;

        List<Integer> list = new ArrayList<Integer>();

        String s = "bbbbb";

        if (s.isEmpty()) {
            return;
        }

        // char[] chars = s.toCharArray();

        List<Character> asList= s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        // List<Character> list = Arrays.asList(chars); // this does not compile,
        // List<Character> asList = Arrays.asList(chars); // because this DOES compile.

        String temp = "";

       while(!asList.isEmpty()){
        for(int i=0; i<asList.size(); i++){
    

            if(temp.contains((CharSequence) asList.toArray()[i].toString())){
                list.add(maxStringLengthFound);
                temp = "";
                maxStringLengthFound = 0;
                asList.remove(0);
            
                break;

            }
            else{
                temp += asList.toArray()[i];
                maxStringLengthFound+=1;
            }
        }


       }

       System.out.println(max(list));

        /*
         * String temp = "";
         * int stringSize = s.length();
         * for (int i = 0; i < stringSize ; i++) {
         * if (temp.contains(String.valueOf(s.charAt(i)))) {
         * list.add(maxStringLengthFound);
         * 
         * if(i ==1 ){
         * i=10;
         * }
         * temp = String.valueOf(s.charAt(i));
         * 
         * maxStringLengthFound = 1;
         * if(i == stringSize -1){
         * list.add(maxStringLengthFound);
         * }
         * 
         * } else {
         * temp += s.charAt(i);
         * maxStringLengthFound += 1;
         * }
         * 
         * }
         * 
         * System.out.println(String.valueOf(max(list)));
         * 
         */

    }

}

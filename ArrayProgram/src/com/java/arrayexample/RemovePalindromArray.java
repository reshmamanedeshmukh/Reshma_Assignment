package com.java.arrayexample;

public class RemovePalindromArray {
	private static boolean isStringPalindrom(String string) {
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }
        if (string.equals(reverse)) {
            System.out.println(reverse);
            return true;
        } else {
            return false;
        }
  }






public static void main(String[] args){
    
    String []str= {"aba","pqr","mam", "madam", "xyz"};
     for (String string : str) {
            if (RemovePalindromArray.isStringPalindrom(string)) {
                continue;
            }
        }
}
}

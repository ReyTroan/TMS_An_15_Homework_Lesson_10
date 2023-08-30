package com.teachmeskills.lesson10.part2;

public class FormatStrings {

    //The method outputs the shortest and longest word in the string
    public static void shortestWord(String text){
        String[] strSplit = text.split(" ");
        int min = 100;
        int max = 0;
        String[] strArr = new String[2];
        for (String el : strSplit){
            if (el.length() < min || el.length() == min){
                min = el.length();
                strArr[0] = el;
            }
            if (el.length() > max || el.length() == max){
                max = el.length();
                strArr[1] = el;
            }
        }
        System.out.println("Minimum element: " + strArr[0] + "\n" + "Maximum element: " + strArr[1]);
    }


    //The method duplicates each visible element in the string
     public static void duplicatingLine(String text){
        StringBuilder strDuplicate = new StringBuilder();
        for (char el : text.toCharArray()){
            if (Character.isLetter(el)){
                strDuplicate.append(el).append(el);
            }else {
                strDuplicate.append(el);
            }
        }

         System.out.println(strDuplicate);
     }
}

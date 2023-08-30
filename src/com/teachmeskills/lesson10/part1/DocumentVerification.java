package com.teachmeskills.lesson10.part1;

/**
 * The methods of the "DocumentVerification" class take a string as input
 *      - the document number with the format xxxx-yyy-xxxx-yyy-xyxy, where "x" is any digit,
 *      and "y" is a letter of the Latin alphabet. And carry out a different string format
 */
public class DocumentVerification {

    //Displays the first two blocks of 4 digits on the screen in one line.
    public static void numericBlock(String documentData){
        String[] strNum = documentData.split("-");
        System.out.println(strNum[0] + strNum[2]);
    }

    //Displays the document number, where it replaces blocks of three letters with "***"
    public static void replacingLetters(String documentData){
        System.out.println(documentData.replaceAll("[a-zA-Z]{3}", "***"));
    }


    //Displays only one letter from the document number in the format yyy/yyy/y/y in lowercase.
    public static void OnlyLettersToLower(String documentData){
        String[] strArr = documentData.split("-");
        String result = "";
        for (String row : strArr){
            for (char col : row.toCharArray()){
                if (Character.isLetter(col)){
                    result += Character.toLowerCase(col);
                }
            }
            result += "/";
        }
        String strReplace = result.replaceAll("/+", "/");
        String strSubstring1 = strReplace.substring(1, 10);
        String strSubstring2 = strReplace.substring(10, 11);
        System.out.println(strSubstring1 + "/" + strSubstring2);

    }

    /*
    Displays the letters from the document number in the format Letters:yyy/yyy/y/ in uppercase
    (implemented using the StringBuilder class).
    */
    public static void OnlyLettersToUpper(String documentData){
        StringBuilder strBuild = new StringBuilder("Letters: ");
        for (char strChar : documentData.toCharArray()){
            if(Character.isLetter(strChar)){
                strBuild.append(strChar);
            } else if (Character.isDigit(strChar)) {
                strBuild.append('/');
            }
        }
        String str = strBuild.toString();
        String replacedStr = str.toUpperCase().replaceAll("/+", "/");
        System.out.println(replacedStr.replaceFirst("/", ""));
    }


    //Checks whether the document number contains the sequence "abc"
    public static void numberSequenceLetter(String documentData){
        System.out.println(documentData.toLowerCase().contains("abc")?"contains" : "does not contain");
    }

    //Checks whether the document number starts with the sequence "555"
    public static void startNumSequence(String documentData){
        System.out.println(documentData.startsWith("555")?"begins" : "it doesn't start");
    }

    //Check whether the document number ends with the sequence "1a2b"
    public static void EndNumSequence(String documentData){
        System.out.println(documentData.toLowerCase().endsWith("1a2b")? "ends" : "does not end");
    }

}




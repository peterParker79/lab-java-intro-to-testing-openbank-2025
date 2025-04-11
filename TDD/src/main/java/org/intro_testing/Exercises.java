package org.intro_testing;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Exercises {

   /*
   1. method that takes in an integer n and returns
    an array of all odd integers from 1 to n
    */

    public static int[] oddUntilN (int n){
       int capacity = (n+1)/2;
       int[] oddList =new int[capacity];
       int indexOddList=0;
       for (int i=1; i<n; i+=2){
          oddList[indexOddList]= i;
          indexOddList++;
       }
       return oddList;
    }

    /*
    2. method that takes in a String and returns
    true if the String contains any Java Keywords.
     */
    public static boolean containsKeyWord( String phrase){
        boolean match=false;
        String[] keyWords=
        {
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
                    "continue", "default", "do", "double", "else", "enum", "exports", "extends", "final", "finally",
                    "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long",
                    "module", "native", "new", "null", "open", "opens", "package", "private", "protected", "provides",
                    "public", "record", "requires", "return", "short", "static", "strictfp", "super", "switch",
                    "synchronized", "this", "throw", "throws", "to", "transient", "transitive", "try", "uses", "var",
                    "void", "volatile", "while", "with", "yield"
        };
        String[] wordsInPhrase= phrase.split(" ");
        //System.out.println(keyWords.length);

        for (String word: wordsInPhrase) {
            if (Arrays.asList(keyWords).contains(word)) {
                match = true;
            }
        }
        return match;
    }
}

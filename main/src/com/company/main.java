package com.company;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyCode {
    public static void main (String[] args) {
//        assertEquals(justify("tekst", '=', 13),("====tekst===="));
//        assertEquals(justify("tekst", '=', 12),("====tekst==="));
//        assertTrue(justify("tekst", '=', 12).equals("====tekst==="));

        betterJustify("tekst", '=', 11);
        betterJustify("something", '-', 17);
        betterJustify("1dupa1", '+', 22);
    }


    public static String justify(String word, char justifyChar, int lengthAfterJustification) {
        System.out.println("Trying to justify= " + word);

        int lengthWithoutWord = lengthAfterJustification-word.length();
        int temp =0;
        String finalWord = "";
        String tempString = "";

        if (lengthWithoutWord%2==0){
            temp = lengthWithoutWord/2;
            for (int i=0; i < temp; i++)
                finalWord += justifyChar;

            finalWord = finalWord+word+finalWord;
        }
        else{
            for (int i=0; i < (lengthWithoutWord+1)/2; i++){
                finalWord += justifyChar;
            }

            for (int i=0; i < lengthWithoutWord/2;i++)
            {
                tempString += justifyChar;
            }
            finalWord = finalWord + word + tempString;
        }


        System.out.println(finalWord);
        return finalWord;
    }

    public static String betterJustify(String word, char justifyChar, int lengthAfterJustification){
        int lengthWithoutWord = lengthAfterJustification - word.length();
        String temp = "";
        String temp2 = "";
        String finalWord = "";

        if (lengthWithoutWord % 2 == 0) {
            for (int i = 0; i < lengthWithoutWord / 2; i++) {
                temp += justifyChar;
            }
            finalWord = temp + word + temp;
        }
        else {
            for (int i = 0; i < lengthWithoutWord-1/ 2; i++) {
                temp2 += justifyChar;
            }
            finalWord = temp + word + temp2;
        }
        System.out.println(finalWord);
        return finalWord;
    }
}
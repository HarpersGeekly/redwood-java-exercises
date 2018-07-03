package interview_questions;

import validator.Validator;

import java.util.Arrays;

public class CodingChallengeApril2018 {

    public static String sortAlphabetically(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        String alphabetical = new String(chars);
        System.out.println(input + " sorted is: " + alphabetical);
        return input;
    }

    public static String getVowels(String input) {
        char[] chars = input.toLowerCase().toCharArray();
        int numberOfVowels = 0;
        for(int i = 0; i < input.length(); i++) {
            if(chars[i] == 'a'
                    || chars[i] == 'e'
                    || chars[i] == 'i'
                    || chars[i] == 'o'
                    || chars[i] == 'u') {
                numberOfVowels++;
            }
        }
        int result = numberOfVowels;
        System.out.println("Number of vowels in " + input + " is: " + result);
        return input;
//Assuming no special characters in your word.
    }

    public static String extractUniqueInOrder(String input) {
        String word = "";
        for(int i = 0; i < input.length(); i++) {
            char index = input.charAt(i);
            if(word.indexOf(index) < 0 ) {
                word = word + index;
            } else {
                word = word.replace(String.valueOf(index + 1), "");
            }
        }
        System.out.println("unique output is:" + word);
        return input;
    }

//    public static float toFarenheit(float temp) {
//        float far = 9 * (temp / 5) + 32;
//        return far;
//    }

    public static float toCelsius(float temp) {
        float celsius = (temp - 32) * 5 / 9;
        return celsius;
    }

    public static void main(String[] args) {
        Validator validator = new Validator();

        System.out.println("====== QUESTION 1 =====");
        String wordToSort = validator.getString("Enter a word to sort alphabetically");
        sortAlphabetically(wordToSort);

        System.out.println("====== QUESTION 2 =====");
        String wordForVowels = validator.getString("Enter a word to count vowels");
        getVowels(wordForVowels);

        System.out.println("====== QUESTION 3 =====");
        String uniqueWord = validator.getString("Enter a word to extract unique characters:");
        extractUniqueInOrder(uniqueWord);

        System.out.println("====== QUESTION 4 =====");
        float temp1 = (float) validator.getDouble("enter a temperature in Fahrenheit:");
        float celsius = toCelsius(temp1);
        System.out.println(temp1 +"℉ to celsius is: " + celsius + "℃");
        float kelvin = celsius + 273.15F;
        System.out.println(celsius + "℃ to kelvin: " + kelvin + " kelvin");


    }

}

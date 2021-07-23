package practice.linkedin.functional.problemSolving;

public class NumberString {

    public static void main(String args[]){
        //System.out.println(makeIntegerNumber("11598"));
        reverseVowels("taquimecanografia");
    }

    /**
    *Manually parce an integer value
    *PARAMS: number, String number to be parced
    *RETURN: finalNumber, int
    */
    public static int makeIntegerNumber(String number){
        char arrayNumber[] = number.toCharArray();
        //0 - 9 = 48 - 57
        int finalNumber = 0;
        int ciroVal = 48;
        int decimal = 10;
        for (int i = 0; i < arrayNumber.length; i ++ ){
            int realVal = arrayNumber[i] - ciroVal;
            finalNumber = finalNumber * decimal;
            finalNumber += realVal;
        }
        return finalNumber;
    }

    /**
    *Given a string word, will return a reversed vowel word, consonants
    *will remain at their place
    *PARAMS: originalWord, String to reverse vowels
    *RETURN: word with reversed vowels
    */
    public static String reverseVowels(String originalWord){
        char charWord[] = originalWord.toCharArray();
        StringBuilder finalWord = new StringBuilder();
        String vowels = "aeiou";
        StringBuilder vowelsInWord = new StringBuilder();
        for (int i = 0; i < charWord.length; i ++){
            if (vowels.contains(""+charWord[i])){
                vowelsInWord.append(charWord[i]);
            }
        }
        int vowelCounter = vowelsInWord.length();
        for (int i = 0; i < charWord.length; i++){
            if (vowels.contains(""+charWord[i])){
                if (vowelCounter > 0){
                    finalWord.append(vowelsInWord.substring(vowelCounter -1, vowelCounter));
                    vowelCounter -= 1;
                }else{
                    finalWord.append(vowelsInWord.substring(vowelsInWord.length()-1, vowelsInWord.length()));
                }
            }else{
                finalWord.append(charWord[i]);
            }
        }
        System.out.println(finalWord.toString());
        return "";
    }
}

package practice.linkedin.functional.problemSolving;

public class VerifyAnagram {

    public static final String NOT_ANAGRAM = "Not an anagram";
    public static final String ANAGRAM ="Anagram!";

    public static void main(String args[]){
        String word1 = "abdcea";
        String word2 = "abcde";
        System.out.println(isAnagram(word1, word2));
    }

    public static String isAnagram(String word1, String word2){
        char[] charWord1 = manuallySortArray(word1.toCharArray());
        char[] charWord2 = manuallySortArray(word2.toCharArray());

        if (charWord1.length != charWord2.length){
            return NOT_ANAGRAM;
        }
        boolean anagram = true;
        for (int i = 0; i < charWord1.length; i++){
            if (charWord1[i] != charWord2[i]){
                anagram = false;
            }
        }
        return anagram? ANAGRAM: NOT_ANAGRAM;
    }

    public static char[] manuallySortArray(char[] arrayToSort){
        for (int i = 0; i < arrayToSort.length - 1; i ++){
            for (int j = i; j < arrayToSort.length - 1; j ++){
               if (arrayToSort[i] > arrayToSort[j + 1]){
                   char charAux = arrayToSort[i];
                   arrayToSort[i] = arrayToSort[j+1];
                   arrayToSort[j+1] = charAux;
               }
            }
        }
        return arrayToSort;
    }
}

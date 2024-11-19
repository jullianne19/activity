  public class StringConcatenation {

    public static String concatenateStrings(String str1,  String str2,  String str3) {
        // Calculate lengths of strings
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        // Create a character array to hold the concatenated result
        char[] result = new char[len1 + len2 + len3];

        // Copy characters from the first string
        int i = 0;
        for (; i < len1; i++) {
            result[i] = str1.charAt(i);
        }

        // Copy characters from the second string
        for (int j = 0; j < len2; j++,  i++) {
            result[i] = str2.charAt(j);
        }

        // Copy characters from the third string
        for (int k = 0; k < len3; k++,  i++) {
            result[i] = str3.charAt(k);
        }

        // Return the concatenated string
        return new String(result);
    }

    public static void main(String[] args) {
        String str1 = " Alberca ";
        String str2 = " Jullianne ";
        String str3 = " Salor ";

        // Call the concatenateStrings method
        String concatenatedString = concatenateStrings(str1,  str2,  str3);
        System.out.println("Concatenated string:  " + concatenatedString);
    }
}
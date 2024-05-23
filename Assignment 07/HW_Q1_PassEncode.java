public class HW_Q1_PassEncode {
    public static void main(String[] args) {
        // Define the mappings based on the provided codes
        char[] letters = {'H', 'O', 'U', 'S', 'E', 'L', 'M', 'N'};
        int[] codes = {3, 5, 8, 4, 2, 1, 6, 9};

        // The word to encode
        String word = "HELEN";
        
        // Initialize an empty string to hold the encoded result
        String encodedWord = "";

        // Loop through each character in the word using a traditional for loop
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i); // Get each character by its index
            // Find the index of the letter in the letters array
            for (int j = 0; j < letters.length; j++) {
                if (letters[j] == letter) {
                    // Concatenate the corresponding code to the encodedWord
                    encodedWord += codes[j];
                    break;
                }
            }
        }

        // Print the encoded word
        System.out.println("Encoded word for HELEN: " + encodedWord);
        
    }
}
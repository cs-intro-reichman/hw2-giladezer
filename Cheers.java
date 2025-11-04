//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int n = Integer.parseInt(args[1]);
            word = word.toUpperCase();

            for (int i = 0; i < word.length(); i++) {
                char[] letters = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'};
                boolean isVowel = false;
                for (char letter : letters) {
                    if (word.charAt(i) == letter) {
                        isVowel = true;
                        break;
                    }
                }
                if (isVowel) {
                    System.out.println("Give me an " + word.charAt(i) + ": " + word.charAt(i) + "!");
                } else {
                    System.out.println("Give me a " + word.charAt(i) + ": " + word.charAt(i) + "!");
                }
            }
            System.out.println("What does that spell?");
            for (int j = 0; j < n; j++) {
                System.out.println(word + "!!!");
            }
        }
}

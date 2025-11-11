//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String name = args[0];
            int num = Integer.parseInt(args[1]);
            String anLetters = "AEHFHILMNORSK";

            for (int i = 0 ; i < name.length() ; i++) {
                 char letter = name.charAt(i);
                if (anLetters.indexOf(letter) >= 0) {
                System.out.println("Give me an: " + letter + ":" + letter + "!");
                } else {
                System.out.println("Give me a: " + letter + ":" + letter + "!");
            }

            }
               
            String spell = name + "!!!";
            System.out.println("What does that spell?"); 
            for (int i = 0; i < num; i++) {
                System.out.println(spell);
            } 
        }
}

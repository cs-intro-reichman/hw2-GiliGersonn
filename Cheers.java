public class Cheers {
    public static void main(String[] args) {
        String name = args[0].toUpperCase();
        int num = Integer.parseInt(args[1]);
        String anLetters = "AEFHILMNORSX";

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (anLetters.indexOf(letter) >= 0) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a  " + letter + ": " + letter + "!");
            }
        }

        System.out.println("What does that spell?");
        String spell = name + "!!!";
        for (int i = 0; i < num; i++) {
            System.out.println(spell);
        }
    }
}

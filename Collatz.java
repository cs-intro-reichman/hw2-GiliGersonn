// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		// מגדירים משתנה נקרא לו סיד מקבל רצף מספרים
		// עלינו להגדיר תנאי IF אם המספר זוגי ואם המספר אי זוגי 
		// אם המספר שמתקבל הוא זוגי צריך לחלק בשתיים 
		// אם אי זוגי \ELSE להכפיל ב3 וולהוסיף 1:2
		// יש שני מצבים חדשים שצריך להגדיר V AND C 
		// SEED צריך לעשות איטרציה שבעצם עוברת על האינדקסים עד שמוצאת אינדקס שהוא שווה ל1 
		// ואז בעצם עלינו להדפיס את כל המספרים ואת המספר שלקח עד אליו 
		// כתיבת לולאה שמדפיסה היילסטון אחד בשביל N שמכניסים 
		// אחכ לקונן את הלולאה הזו בלולאה אחרת שסופרת את 1 עד N 
		// לבסוף להתמודד עם VERBOSE / CONCISE

	
        int N = Integer.parseInt(args[0]);
        String mode = args[1].toLowerCase();

        for (int seed = 1; seed <= N; seed++) {

            int current = seed;
            int steps = 1;
            String sequence = "" + current;

            do {
                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = current * 3 + 1;
                }
                sequence = sequence + " " + current;
                steps++;
            } while (current != 1);

            if (mode.equals("v")) {
                System.out.println(sequence + " (" + steps + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}

public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
         String time = args[0]; //והופך אותו לאינט מקבל סטרינג מהמשתמש
		 int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		 int min = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		 int min2add  = Integer.parseInt(args[1]);
		 int total_min = ((hours * 60 ) + min + min2add);
		 int total_hours = (total_min / 60);
		 int new_hours = (total_hours % 24);
		 int new_min = total_min - (total_hours * 60);
         String hour_update_format = "";
         String min_update_format = "";
         if (new_hours < 10) {
            hour_update_format = "0" + new_hours;
        } else {
            hour_update_format = "" + new_hours;
        }

        if (new_min < 10) {
            min_update_format = "0" + new_min;
        } else {
            min_update_format = "" + new_min;
        }
          String new_time = (hour_update_format + ":" + min_update_format);
		 System.out.println(new_time);

    }
}

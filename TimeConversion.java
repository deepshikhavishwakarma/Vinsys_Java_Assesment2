//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;

public class TimeConversion{
	  public static void main(String[] args) {
	        String inputTime = "03:45:30 PM"; // Replace this with your input time
	        
	        // Convert to military time
	        String militaryTime = convertToMilitaryTime(inputTime);

	        System.out.println("Military Time: " + militaryTime);
	    }

	    public static String convertToMilitaryTime(String time) {
	        String[] parts = time.split(":");
	        int hour = Integer.parseInt(parts[0]);
	        int minute = Integer.parseInt(parts[1]);
	        String period = parts[2].trim(); // AM or PM

	        if (period.equals("PM") && hour < 12) {
	            hour += 12;
	        } else if (period.equals("AM") && hour == 12) {
	            hour = 0;
	        }

	        return String.format("%02d:%02d:%s", hour, minute, parts[2].substring(0, 2));
	    }
	    }

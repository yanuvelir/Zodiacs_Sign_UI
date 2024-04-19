import java.time.LocalDate;
import java.time.Month;

public class Find_the_Sign {

    public static String localDate(){
        LocalDate currentDate = LocalDate.now();

        Month month = currentDate.getMonth();
        String currentMonth = month.toString();
        int currentDay = currentDate.getDayOfMonth();
        int monthValue = currentDate.getMonthValue();

        System.out.printf("Current month is %s %nCurrent date is %d%n", currentMonth, currentDay);

        if ((monthValue == 12 && currentDay >= 22) || (monthValue == 1 && currentDay <= 20)){
            System.out.println("Current Zodiac sign is * Capricorn *");
            return "Capricorn";
        } else if ((monthValue == 1 && currentDay >= 21) || (monthValue == 2 && currentDay <= 19)){
            System.out.println("Current Zodiac sign is * Aquarius *");
            return "Aquarius";
        } else if ((monthValue == 2 && currentDay >= 20) || (monthValue == 3 && currentDay <= 20)){
            System.out.println("Current Zodiac sign is * Pisces *");
            return "Pisces";
        } else if ((monthValue == 3 && currentDay >= 21) || (monthValue == 4 && currentDay <= 19)){
            System.out.println("Current Zodiac sign is * Aries *");
            return "Aries";
        } else if ((monthValue == 4 && currentDay >= 20) || (monthValue == 5 && currentDay <= 20)){
            System.out.println("Current Zodiac sign is * Taurus *");
            return "Taurus";
        } else if ((monthValue == 5 && currentDay >= 21) || (monthValue == 6 && currentDay <= 21)){
            System.out.println("Current Zodiac sign is * Gemini *");
        } else if ((monthValue == 6 && currentDay >= 22) || (monthValue == 7 && currentDay <= 23)){
            System.out.println("Current Zodiac sign is * Cancer *");
        } else if ((monthValue == 7 && currentDay >= 24) || (monthValue == 8 && currentDay <= 23)){
            System.out.println("Current Zodiac sign is * Leo *");
        } else if ((monthValue == 8 && currentDay >= 24) || (monthValue == 9 && currentDay <= 22)){
            System.out.println("Current Zodiac sign is * Virgo *");
        } else if ((monthValue == 9 && currentDay >= 23) || (monthValue == 10 && currentDay <= 22)){
            System.out.println("Current Zodiac sign is * Libra *");
        } else if ((monthValue == 10 && currentDay >= 23) || (monthValue == 11 && currentDay <= 22)){
            System.out.println("Current Zodiac sign is * Scorpio *");
        } else if ((monthValue == 11 && currentDay >=23) || (monthValue == 12 && currentDay <= 20)){
            System.out.println("Current Zodiac sign is * Sagittarius *");
        }
        else {
            System.out.println("Unable to determine Zodiac sign");
        }
        return null;
    }
}

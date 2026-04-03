import java.util.Scanner;

public class MonthAndDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = -1;
        String monthInput;
        int monthNum = -1;

        while (true) 
       {
            System.out.print("Enter month (Name, Abbreviation, or Number): ");
            monthInput = sc.nextLine().trim();
            monthNum = getMonthNumber(monthInput);

            System.out.print("Enter year (e.g., 1999): ");
            if (sc.hasNextInt()) 
            {
                year = sc.nextInt();
                sc.nextLine(); // consume newline
                if (year >= 0 && monthNum != -1) break; 
            } else 
            {
                sc.nextLine(); // clear invalid input
            }
            System.out.println("Invalid input. Please try again.");
        }

        int days = getDaysInMonth(monthNum, year);
        System.out.println("Number of days: " + days);
    }

    private static int getMonthNumber(String input) 
    {
        String[] months = {
            "january", "february", "march", "april", "may", "june", 
            "july", "august", "september", "october", "november", "december"
        };
        String[] abbrev = {"jan.", "feb.", "mar.", "apr.", "may", "june", "july", "aug.", "sept.", "oct.", "nov.", "dec."};
        String[] short3 = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};

        input = input.toLowerCase();
        
        try 
	{
            int n = Integer.parseInt(input);
            if (n >= 1 && n <= 12) return n;
        } 
	catch (NumberFormatException e) {}

        for (int i = 0; i < 12; i++) 
	{
            if (input.equals(months[i]) || input.equals(abbrev[i]) || input.equals(short3[i])) 
	    {
                return i + 1;
            }
        }
        return -1;
    }

    private static int getDaysInMonth(int month, int year) 
    {
        switch (month)
        {
            case 4: case 6: case 9: case 11: return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) return 29;
                else return 28;
            default: return 31;
        }
    }
}
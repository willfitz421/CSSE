import java.util.ArrayList;

/*
Your ClockMaster 3000™ alarm clock has a peculiar feature. It allows you to set an
increment value n, where n is a positive integer. Once the increment value is set, the
clock will only update its display every n minutes, until its display shows the same hour
and minute values as when it entered increment mode. For example, if the clock enters
increment mode at 1:57, it will remain in increment mode until the next time it displays
1:57. (Note that this could be either 1:57 AM or 1:57 PM.)
Due to the ClockMaster 3000™’s poorly-implemented voice recognition feature, it is
very easy to enable increment mode by accident (for example, by sneezing). The good
news is that while in increment mode, the ClockMaster 3000™ displays the current increment value, so at least you know what it’s doing.
Since you are determined to make the best of the situation, you decide to write a
program to determine how many minutes you will have to wait until the clock goes back
to normal after you accidentally enable increment mode.
Program input: The program reads lines of text from standard input. Each normal line
of input has one integer value, n, which is a positive value indicating the increment. (Note
that it doesn’t matter what time is displayed when the clock enters increment mode.) As
a special case, a line with a value of −1 indicates that there are no more input lines and
the program should terminate immediately (without any further output).
Example input:
7
26
61
27
-1
Program output: For each positive increment value, the program should print a line
with a single integer, representing the total number of minutes until the clock resumes
normal mode.
Example output (corresponding to the example input shown above)
5040
9360
43920
2160
*/
class clockWise
{
    public static void main(String[] args)
    {
        ArrayList<Integer> incrementValue = new ArrayList<Integer>();

        incrementValue.add(7);
        incrementValue.add(26);
        incrementValue.add(61);
        incrementValue.add(27);
        incrementValue.add(-1);
        
        for(int i = 0; i < incrementValue.size(); i++)
        {
            if(!(incrementValue.get(i).equals(-1)))
            {
                
                System.out.println(timeGenerator(incrementValue.get(i)));
            }
            else
                System.exit(0);
        }
        
    }

    public static int timeGenerator(int incrementer)
    {
        int hour = 1;
        int minutes = 57;
        int clockHour = 1;
        int clockMinutes = 57;
        int timeAlluded = 0;
        boolean isCorrect = false;
 
       while (isCorrect != true)
       {
           if(clockMinutes + incrementer >= 60)
           {
                clockMinutes = (clockMinutes + incrementer) - 60;
                clockHour++;
                timeAlluded += incrementer;

                if(clockMinutes >= 60)
                { 
                    clockMinutes -= 60;
                    clockHour++;
                }
           }
           else
           { 
                clockMinutes += incrementer;
                timeAlluded += incrementer;
           }

           if(clockHour > 12)
                clockHour %= 12;

           if(clockHour == hour && clockMinutes == minutes)
                isCorrect = true;
       }
       
        return timeAlluded;
    }
}

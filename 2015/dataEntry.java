import java.util.ArrayList;

/*
Your company has been fortunate to have one employee devoted only to data entry:
Doris. She loves her job and is the fastest around. Fortunately for the company, business
is booming. Unfortunately, the company hired another person for data entry: Boris. He’s
almost as fast as Doris. Unfortunately, they are stubborn and completely disagree about the
proper way to enter data.
Doris insists on knowing exactly how many pieces of data she needs to type in. “How
can you enter data at peak speed if you don’t pace yourself? And how can you pace yourself
if you don’t know how much data there is?”
Boris insists on jumping right into the data and then entering a sentinel value when he’s
finished. “Start faster. Finish faster.”
Your job is to write a data entry program that will accommodate both Doris and Boris.
Program input: The first line indicates the number of data sets. Each data set will
consist of a set of names, with each name on a separate line. Each data set will contain at
least one name. Also, if it is one of Doris’s data sets, then before the set of names there will
be a number indicating how many names are in the data set. If it one of Boris’s data sets,
then at the end of the set of names there will be a line containing the number 0 (the sentinel
value). Example input:
4
3
Alice
Bob
Charlie
Dierdre
Edie
Frank
Georgina
Harry
0
Ingrid
Jerome
Kyle
Lyle
Myles
Nial
0
2
Opal
Phyllis
Program output: The program should output the number of names entered by Doris
followed by the number of names entered by Boris. Label the numbers and put them on
separate lines. Example output (corresponding to the example input shown above):
Doris: 5
Boris: 11
*/
class dataEntry
{
    public static void main(String[] args)
    {
        ArrayList<String> entries = new ArrayList<String>();

        entries.add("4");
        entries.add("3");
        entries.add("Alice");
        entries.add("Bob");
        entries.add("Charlie");
        entries.add("Dierdre");
        entries.add("Edie");
        entries.add("Frank");
        entries.add("Georgina");
        entries.add("Harry");
        entries.add("0");
        entries.add("Ingrid");
        entries.add("Jerome");
        entries.add("Kyle");
        entries.add("Lyle");
        entries.add("Myles");
        entries.add("Nial");
        entries.add("0");
        entries.add("2");
        entries.add("Opal");
        entries.add("Phyllis");

        int dorisEntries = 0;
        int borisEntries = 0;


        for(int i = 1; i < entries.size(); i++)
        {
            if(entries.get(i).charAt(0) >= '0' && entries.get(i).charAt(0) <= '9')
            {
                dorisEntries += Integer.parseInt(entries.get(i));
                System.out.println(entries.get(i));
                i += (Integer.parseInt(entries.get(i)));
    
            }
            else
            {
                while(!(entries.get(i).charAt(0) >= '0') || !(entries.get(i).charAt(0) <= '9'))
                {
                    System.out.println(entries.get(i));
                     borisEntries += 1;
                     i++;
                }
            }
        }
        System.out.println("Doris: " + dorisEntries);
        System.out.println("Boris: " + borisEntries);
    }
}

/*
For a Splotvian twist on any dish, just add chips! Yes, Splotvians love their chips, and
will eat them with just about anything.
In order to help restaurants update their menus to cater to fans of Splotvian cuisine,
you decide to write a program that will take the name of (almost) any dish and add “and
chips” to it. An exception occurs for dishes whose names start with “q”: Splotvians will
never eat chips with these.
Program input: Each line of input is the name of a menu item. As a special case, if a
line consists of just the text “done”, that signals the end of input, and the program should
exit immediately without any further output.
Example input:
pie
biryani
steak tartare
chicken cordon bleu
quinoa with wild mushrooms
jellied eels
baked alaska
cherries jubilee
done
Program output: For each input line (other than “done”), the program should print
the same line, but with “and chips” added (with a space before “and”), unless the name
of the dish starts with “q”, in which case the name of the dish should be printed verbatim.
Example output (corresponding to the example input shown above):
pie and chips
biryani and chips
steak tartare and chips
chicken cordon bleu and chips
quinoa with wild mushrooms
jellied eels and chips
baked alaska and chips
cherries jubilee and chips
*/
import java.util.ArrayList;

class AndChips
{
    public static void main(String[] args)
    {
        ArrayList<String> menu = new ArrayList<String>();

        menu.add("pie");
        menu.add("biryani");
        menu.add("steak tartare");
        menu.add("chicken cordon bleu");
        menu.add("quinoa with wild mushrooms");
        menu.add("jellied eels");
        menu.add("baked alaska");
        menu.add("cherries jubilee");
        menu.add("done");

        for(int i = 0; i < menu.size(); i++)
        { 
            if(!menu.get(i).equalsIgnoreCase("done"))
                System.out.println(addDemChips(menu.get(i)));
            else
                System.exit(0);;
        }
    }

    public static String addDemChips(String meal)
    {
        if(!(meal.charAt(0) == 'q'))
            return meal + " and chips";
        else
            return meal;
    }
}

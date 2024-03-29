// Timothy Wilks
// demonstrates the use of a listiterator
import java.util.ArrayList;
import java.util.ListIterator;
public class Recipe
{
    // stores and then prints a list of ingredients for a recipe
    public static void main(String[] args)
    {
        ArrayList<String> ingredients = new ArrayList<String>();
        ingredients.add("flour");
        ingredients.add("sugar");
        ingredients.add("cocoa");
        ingredients.add("oil");
        ingredients.add("butter");
        ingredients.add("eggs");
        ingredients.add("baking soda");
        System.out.println("To make a chocolate cake, use the following " +
                            ingredients.size() + " ingredients");
        ListIterator iterator = ingredients.listIterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }// end of main method
}// end of recipe class

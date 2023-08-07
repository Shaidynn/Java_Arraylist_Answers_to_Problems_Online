import java.util.ArrayList;
import java.util.Comparator;

class array {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<String>();

        colours.add("red"); //0
        colours.add("blue"); //1
        colours.add("yellow"); //2
        colours.add("green"); //3
        
        String newColour = "Purple";

        colours.add(0, newColour);

        String replacementColour = "Orange";
        colours.set(0, replacementColour);
        System.out.println(colours.toString());

        colours.sort(Comparator.reverseOrder());
        System.out.println(colours.toString());
    
        System.out.println("This is the list before the sort: " + colours);
        
        colours.sort(Comparator.naturalOrder());
        System.out.println("This is the list after the sort: " + colours);

        String search = "red";
        System.out.println(colours.contains(search));

        if (colours.contains(search)) {
            System.out.println("Yes this element exists in the list");
        } else {
            System.out.println("No this element does not exist in the list.");
        }
        
        colours.remove(2);
        System.out.println(colours.toString());
        
        int index = 1;
        
        String element = colours.get(index);
        System.out.println("Element at index " + index + ": " + element);
        

        for (String element2 : colours)
        System.out.println(element2);
        System.out.println(colours.toString()); 
    }
}


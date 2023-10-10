import java.util.ArrayList;

public class Recipe {
    private String recipeName;
    private ArrayList<String> ingreedients;
    private ArrayList<String> directions;

    public Recipe(String recipeName){
        this.recipeName = recipeName;
    }
}
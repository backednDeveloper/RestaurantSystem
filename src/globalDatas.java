import java.util.HashMap;
import java.util.LinkedList;

public class globalDatas {
    public static LinkedList<meals> mealsData = new LinkedList<>();
    public static LinkedList<drinks> drinksData = new LinkedList<>();
    public static HashMap<String, meals > mapMealsString = new HashMap<>();
    public static HashMap<Integer, meals > mapMealsInt = new HashMap<>();
    public static HashMap<String, drinks > mapDrinksString = new HashMap<>();
    public static HashMap<Integer, drinks > mapDrinksInt = new HashMap<>();
    public static LinkedList<orderInformationDatas> orderInformations = new LinkedList<>();
}

public class meals {
    private int placeInMenu;
    private String meal;
    private int mealprice;

    public meals(String meal, int mealprice, int placeInMenu) {
        this.meal = meal;
        this.mealprice = mealprice;
        this.placeInMenu=placeInMenu;
    }

    public int getPlaceInMenu() {
        return placeInMenu;
    }

    public void setPlaceInMenu(int placeInMenu) {
        this.placeInMenu = placeInMenu;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getMealprice() {
        return mealprice;
    }

    public void setMealprice(int mealprice) {
        this.mealprice = mealprice;
    }
    public String getInfoMeals(){
        System.out.println("Meal name : " + getMeal() + "\n" + "Meal price : " + getMealprice());
        return meal;
    }
}

public class meals {
    private String meal;
    private int mealprice;

    public meals(String meal, int mealprice) {
        this.meal = meal;
        this.mealprice = mealprice;
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
        System.out.println("Meal name : " + meal + "\n" + "Meal price : " + mealprice);
        return getInfoMeals();
    }
}

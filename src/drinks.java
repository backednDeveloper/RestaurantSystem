public class drinks {
    private String drinkname;
    private int drinkprice;
    private int placeInMenuDrink;

    public drinks(String drinkname, int drinkprice, int placeInMenuDrink) {
        this.drinkname = drinkname;
        this.drinkprice = drinkprice;
        this.placeInMenuDrink=placeInMenuDrink;
    }

    public int getPlaceInMenuDrink() {
        return placeInMenuDrink;
    }

    public void setPlaceInMenuDrink(int placeInMenuDrink) {
        this.placeInMenuDrink = placeInMenuDrink;
    }

    public String getDrinkname() {
        return drinkname;
    }

    public void setDrinkname(String drinkname) {
        this.drinkname = drinkname;
    }

    public int getDrinkprice() {
        return drinkprice;
    }

    public void setDrinkprice(int drinkprice) {
        this.drinkprice = drinkprice;
    }

    public String getInfo() {
        System.out.println("Drink name : " + getDrinkname() + "\n" +
                "Drink price : " + getDrinkprice()
        );
        return getInfo();
    }
}

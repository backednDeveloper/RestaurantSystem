public class drinks {
    private String drinkname;
    private int drinkprice;

    public drinks(String drinkname, int drinkprice) {
        this.drinkname = drinkname;
        this.drinkprice = drinkprice;
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
    public String getInfo(){
        System.out.println("Drink name : " + drinkname + "\n" +
                "Drink price : " + drinkprice
                );
        return getInfo();
    }
}

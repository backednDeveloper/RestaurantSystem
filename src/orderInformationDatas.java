public class orderInformationDatas {
    private String order;
    private int orderNumbers;
    private int price;
    private int orderAdress;
    private String getOrderInformations;

    public orderInformationDatas(String order, int orderNumbers , int price , int orderAdress) {
        this.order = order;
        this.orderNumbers = orderNumbers;
        this.price=price;
        this.orderAdress=orderAdress;
    }

    public String getOrder() {
        return order;
    }

    public int getOrderNumbers() {
        return orderNumbers;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setOrderNumbers(int orderNumbers) {
        this.orderNumbers = orderNumbers;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTable() {
        return orderAdress;
    }

    public void setTable(int orderAdress) {
        this.orderAdress = orderAdress;
    }
    public String getOrderInformations (){
        System.out.println("Product : " + order + "\n" +
                "Oreder product numbers : " + orderNumbers + "\n" +
                "Oreder table numbers : " + orderAdress + "\n" +
                "Oreder total price : " + price + "\n"
        );
        return null;
    }
}

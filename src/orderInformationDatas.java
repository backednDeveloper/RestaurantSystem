public class orderInformationDatas {
    String order;
    int orderNumbers;

    public orderInformationDatas(String order, int orderNumbers) {
        this.order = order;
        this.orderNumbers = orderNumbers;
    }

    public String getOrder() {
        return order;
    }

    public int getOrderNumbers() {
        return orderNumbers;
    }
    public String getOrderInformations (){
        System.out.println("---------------- Order ---------------- "  + "\n" + "Product : " + order + "\n" +
                "Order number : " + orderNumbers + "\n"
                );
        return  getOrder();
    }
}

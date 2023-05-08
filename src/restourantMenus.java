public class restourantMenus {
    public static String restourantMenus() {
        while (true) {
            int typeOfProduct1 = printsMethods.inputRequiredInt("1 - For the food products " + "\n" +
                    "2 - For the  drinks products " + "\n" +
                    "Select one of the options above : "
            );
            switch (typeOfProduct1) {
                case 1:
                    System.out.println("Menu : ");
                    int index = 1;
                    for (meals information : globalDatas.mealsData) {
                        System.out.println(index + information.getInfoMeals());
                        index++;
                    }
                    int choose = printsMethods.inputRequiredInt("Choose product (0 is exit): ");
                    if (choose == 0) {
                        break;
                    } else if (choose < 1 || choose > globalDatas.mealsData.size()) {
                        System.out.println("Geçersiz seçim!");
                    } else {
                        meals choosProduct = globalDatas.mealsData.get(choose - 1);
                        int choosNumber = printsMethods.inputRequiredInt("Choose product order numbers : ");
                        orderInformationDatas informationDatas = new orderInformationDatas(choosProduct.getMeal(), choosNumber);
                        globalDatas.orderInformations.add(informationDatas);
                        System.out.println(informationDatas.getOrderInformations());
                    }
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Wrong added. ");
            }
            return restourantMenus.restourantMenus();
        }
    }
}

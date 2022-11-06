package TaskOne.ProductTaskOneTwo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        Product potate = new Product("Картошка", 12.0f, 2);
        Product qivi = new Product("Киви", 1.0f, 3);
        productList.addProduct(potate);
        productList.addProduct(qivi);
        productList.buyProduct("Картошка");
        System.out.println(productList);
        productList.removeProduct("Картошка");
        System.out.println(productList);
        Map<Product,Integer> productsList = new HashMap<>();
        productsList.put(potate,null);
        productsList.put(qivi,6);

        Recepts recepts = new Recepts("Салат",productsList);
        ReceptsList receptsList = new ReceptsList();
        receptsList.addRecepts(recepts);
        System.out.println(receptsList);

    }
}
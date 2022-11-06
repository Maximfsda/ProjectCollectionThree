package TaskOne.ProductTaskOneTwo;

import java.util.Map;
import java.util.Objects;

public class Recepts {

    private final String name;
    private final Map<Product,Integer> products;


    public Recepts(String name, Map<Product,Integer> products) {
        if (name == null || name.isBlank() || products.size() == 0 ) {
            throw new IllegalArgumentException("Поля не заполнены!");
        }
        for(Map.Entry<Product,Integer> item : products.entrySet()){
           if(item.getValue() == null) {
               item.setValue(1);
           }
        }
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Map<Product,Integer> products() {
        return products;
    }

    public float getPeceptsPrise(){
        float sum = 0;
        for(Map.Entry<Product, Integer> item : products.entrySet()){
            sum+=item.getValue() *item.getKey().getPrise();
        }
        return sum ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recepts recepts = (Recepts) o;
        return Objects.equals(name, recepts.name) && Objects.equals(products, recepts.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }

    @Override
    public String toString() {
        return "Рецепт:" +
                "Название " + name + '\'' +
                ",Продукты " + products +
                '}';
    }
}

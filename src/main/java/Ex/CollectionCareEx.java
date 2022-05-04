package Ex;

import java.util.ArrayList;
import java.util.List;

class Hero{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class CollectionCareEx {

    public static void main(String[] args){
        Hero h = new Hero();

        h.setName("IronMan");
        List<Hero> list = new ArrayList<Hero>();
        list.add(h);

        h.setName("Hulk");
        System.out.println(list.get(0).getName());
    }
}

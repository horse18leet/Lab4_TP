import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit>{
    public Box() {}

    public Box(T...x) {
        for (T y : x) {
            list.add(y);
            Weight += y.getWeight();
        }
    }

    public float Weight;
    List<Fruit> list = new ArrayList<Fruit>();
    public float getWeight(){
        return Weight;
    }
    public int getCount(){
        return list.size();
    }

    public void put(Fruit fruit){
        list.add(fruit);
        Weight += fruit.getWeight();

    }
    public boolean Compare(Box box){
        return Weight == box.getWeight();
    }
    public void moving(Box box){
        if(list.get(0).getClass().getName() == box.list.get(0).getClass().getName()){
            box.Weight += Weight;
            box.list.addAll(list);
            list.clear();
            Weight = 0;
        }
    }
    public void printBox(){
        System.out.println(list.toString());
    }
}

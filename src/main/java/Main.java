import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{
                "drkjnvnj",
                "fehsfefe",
                "39248732890",
                "3"
        };
        Replace(array, 0, 3);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        List<String> list = ConvertToList(array);
        System.out.println(list);

        Box<Apple> boxApple = new Box<>(
                new Apple(),
                new Apple());
        Box<Orange> boxOrange = new Box<>();
        Box<Apple> boxApple2 = new Box<>();


        for(int i = 0; i < 10; i++){
            boxApple.put(new Apple());
            boxApple2.put(new Apple());
        }

        for(int i = 0; i < 10; i++){
            boxOrange.put(new Orange());
        }


        System.out.println("Коробка с яблоками, вес: " + boxApple.getWeight() + "кг.");
        System.out.println("Коробка с апельсинами, вес: " + boxOrange.getWeight() + "кг.");
        System.out.println("Коробка с яблоками 2, вес: " + boxApple.getWeight() + "кг.");

        if(boxApple.Compare(boxOrange)){
            System.out.println("Коробки имеют одинаковую массу");
        }
        else{
            System.out.println("Коробки имеют разную массу");
        }
        boxApple.moving(boxApple2);
        System.out.println("Коробка с яблоками, откуда пересыпают яблоки, вес: " + boxApple.getWeight() + "кг.");
        System.out.println("Коробка в которую пересыпали яблоки, вес: " + boxApple2.getWeight() + "кг.");

        boxApple.printBox();
        boxApple2.printBox();
    }

    public static void Replace(String[] array, int firstIndex, int lastIndex) {
        String temp = array[firstIndex];

        array[firstIndex] = array[lastIndex];
        array[lastIndex] = temp;
    }
    public static List<String> ConvertToList(String[] array){
        List<String> list = new ArrayList<String>();
        for (int i = 0; i< array.length; i++){
            list.add(array[i]);
        }
        return list;
    }
}

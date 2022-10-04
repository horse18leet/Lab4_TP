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


        System.out.println("������� � ��������, ���: " + boxApple.getWeight() + "��.");
        System.out.println("������� � �����������, ���: " + boxOrange.getWeight() + "��.");
        System.out.println("������� � �������� 2, ���: " + boxApple.getWeight() + "��.");

        if(boxApple.Compare(boxOrange)){
            System.out.println("������� ����� ���������� �����");
        }
        else{
            System.out.println("������� ����� ������ �����");
        }
        boxApple.moving(boxApple2);
        System.out.println("������� � ��������, ������ ���������� ������, ���: " + boxApple.getWeight() + "��.");
        System.out.println("������� � ������� ���������� ������, ���: " + boxApple2.getWeight() + "��.");

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

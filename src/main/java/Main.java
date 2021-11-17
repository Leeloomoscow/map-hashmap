import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> persons = new HashMap<>();
        persons.put(465647478, "Ivanov Ivan1 Ivanovich");
        persons.put(465647479, "Ivanov Ivan2 Ivanovich");
        persons.put(465647490, "Ivanov Ivan3 Ivanovich");
        persons.put(465647495, "Ivanov Ivan4 Ivanovich");

        //перебор Коллекции
        for (Map.Entry<Integer, String> item : persons.entrySet()){
            System.out.println("Ключ: " + item.getKey() + " Значение: " + item.getValue());
        }
//        System.out.println(persons.get(465647490));
//        System.out.println(persons.keySet()); //Список всех ключей
//        System.out.println(persons.values()); //Список всех значений
//        System.out.println(persons.replace(465647490, "Замена")); //Замена key на новое значение
//        System.out.println(persons.get(465647490));
//        System.out.println(persons.remove(465647490)); //Удаление ненужного ключа
//        System.out.println(persons.values());
//        System.out.println(persons.size()); //Посмотреть количество элементов в коллекции
//        persons.clear(); //Удаление всех элементов в коллекции. У данного метода нет вывода на консоль

    }
}


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ObjectHashMap {
    // Про ассоциативные массивы
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        Map<String, String> data1 = new HashMap<>();
        // добавить данные
        data.put("name", "Katya");
        data.put("city", "Moscow");
        data.put("age", "45");


        // Получение объекта по ключу
        System.out.println(data.get("name"));
        System.out.println(data.get("city"));
        System.out.println(data.get("age"));

        // проверяем, входит ли такой ключ в наш объекта HashMap
        System.out.println(data.containsKey("name"));
        System.out.println(data.containsKey("namer"));

        // проверяем, входит ли такой value в наш объекта HashMap
        System.out.println(data.containsValue("Katya"));
        System.out.println(data.containsValue("Serezha"));

        System.out.println();
        // проверка на пустоту
        System.out.println(data.isEmpty());
        System.out.println(data1.isEmpty());

        // возрат количества элементов
        System.out.println(data.size());
        System.out.println(data1.size());

        // добавим ещё какой либо элемент
        data.put("моделист", "коструктор");
        data1.put("моделист", "деструктор");
        System.out.println();
        System.out.println(data.size());
        System.out.println(data1.size());

        // теперь переберём по элементам наши HashMap
        for (Map.Entry<String, String> d : data.entrySet()) {
            String key = d.getKey();
            String value = d.getValue();
            // Class<? extends Entry> clas = d.getClass(); об этом подумать
            System.out.println(key + " = " + value);
        }

        System.out.println();
        for (Map.Entry<String, String> d : data1.entrySet()) {
            String key = d.getKey();
            String value = d.getValue();
            // Class<? extends Entry> clas = d.getClass(); об этом подумать
            System.out.println(key + " = " + value);
        }

        // удаление элементов по ключу
        data.remove("моделист");

        for (Map.Entry<String, String> d : data.entrySet()) {
            String key = d.getKey();
            String value = d.getValue();
            // Class<? extends Entry> clas = d.getClass(); об этом подумать
            System.out.println(key + " = " + value);
        }

        // а теперь выведем через лямбда-выражения
        System.out.println("------------------------");
        data.forEach((t, u) -> System.out.println(t + " = " + u));

        // если нужно удалить не по ключу, а по значению
        data.values().remove("Moscow");
        System.out.println("------------------------");
        data.forEach((t, u) -> System.out.println(t + " = " + u));
        System.out.println("------------------------");
        data.clear();
        data.forEach((t, u) -> System.out.println(t + " = " + u));
        System.out.println("------------------------");
        data.put("Гелиотроп", "Таня");
        data.forEach((t, u) -> System.out.println(t + " = " + u));

    }

}


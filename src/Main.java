import guide.Guide;
import product.Product;
import product.Recipe;

import java.util.*;

public class Main {
    public static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("\nЗадание № 1/1");
        System.out.println("=======================");
        Guide guide = new Guide("Горлов Роман", "+792836415");
        Guide guide1 = new Guide("Петрова Варвара", "+792838719");
        Guide guide2 = new Guide("Иванова Олеся", "+792835569");
        Guide guide3 = new Guide("Корманов Петр", "+791635769");
        Guide guide4 = new Guide("Евсеев Илья", "+791885762");
        Guide guide5 = new Guide("Григорьев Леонид", "+791844762");
        Guide guide6 = new Guide("Дусева Мария", "+791966762");
        Guide guide7 = new Guide("Мамаев Зураб", "+791544882");
        Guide guide8 = new Guide("Петров Игорь", "+791877762");
        Guide guide9 = new Guide("Галкина Юлия", "+791588112");
        Guide guide10 = new Guide("Ушакова Валентина", "+791948812");

        HashMap<String, String> phone = new HashMap<>();
        phone.put(guide.getFullName(), guide.getNumberPhone());
        phone.put(guide1.getFullName(), guide1.getNumberPhone());
        phone.put(guide2.getFullName(), guide2.getNumberPhone());
        phone.put(guide3.getFullName(), guide3.getNumberPhone());
        phone.put(guide4.getFullName(), guide4.getNumberPhone());
        phone.put(guide5.getFullName(), guide5.getNumberPhone());
        phone.put(guide6.getFullName(), guide6.getNumberPhone());
        phone.put(guide7.getFullName(), guide7.getNumberPhone());
        phone.put(guide8.getFullName(), guide8.getNumberPhone());
        phone.put(guide9.getFullName(), guide9.getNumberPhone());
        phone.put(guide10.getFullName(), guide10.getNumberPhone());
        System.out.println(phone.keySet() + " " + phone.values());

        System.out.println(phone.get("Горлов Роман"));
        System.out.println(phone.get("Петрова Варвара"));
        System.out.println(guide);
        System.out.println(phone);

        System.out.println("\nЗадание 1/2 - книга рецептов");
        System.out.println("=======================");
        Product bananas = new Product("Бананы", 56.00, 1.0, 2.00);
        Product apples = new Product("Яблоки", 129.00, 1.0, 3.00);
        Product plums = new Product("Сливы", 160.00, 1.0, 1.00);
        Product oranges = new Product("Апельсины", 78.00, 1.0, 1.00);
        Product sugar = new Product("Сахар", 65.00, 1.0, 2.00);
        Product flour = new Product("Мука", 94.00, 1.0, 5.00);
        Product honey = new Product("Мёд", 185.00, 1.0, 2.00);

        System.out.println(bananas);
        System.out.println(apples);
        List<Product> products = List.of(
                bananas, apples, plums, oranges, sugar, flour, honey
        );
        bananas.addProduct(apples);
        System.out.println(products);

        Recipe pie = new Recipe("Шарлотка", apples, flour, sugar);
        Recipe cake = new Recipe("Медовик", sugar, flour, honey);
        Recipe cake1 = new Recipe("Наполеон", sugar, flour, oranges);


        HashMap<Product, Integer> products1 = new HashMap<>();
        products1.put(bananas, 2);
        products1.put(apples, 4);
        products1.put(plums, 1);
        products1.put(sugar, 1);
        products1.put(flour, 3);
        products1.put(honey, 7);
        System.out.println(products1);




        Set<Recipe> recipes = new HashSet<>();
        recipes.add(pie);
        recipes.add(cake);
        recipes.add(cake1);
        System.out.println(Arrays.toString(recipes.toArray()));


        System.out.println("\nЗадание № 1/3");
        System.out.println("=======================");

        KeyMap map1 = new KeyMap("Молоток", 12);
        KeyMap map2 = new KeyMap("Резак", 10);
        KeyMap map3 = new KeyMap("Кирпич", 150);
        KeyMap map4 = new KeyMap("Цемент", 50);
        KeyMap map5 = new KeyMap("Песок", 49);


        map.put(map1.getKey(), map1.getValue());
        map.put(map2.getKey(), map2.getValue());
        map.put(map3.getKey(), map3.getValue());
        map.put(map4.getKey(), map4.getValue());
        addMap("Песок",49);
        addMap("Резак", 50);
        System.out.println(map);
//        addMap("Кирпич", 150);

        System.out.println("\nЗадание № 2/1");
        System.out.println("=======================");

        Map<String, List<Integer>> collections = new HashMap<>();
        List<Integer> integerList = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList2 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList3 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList4 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList5 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));


        collections.put("Первая", integerList);
        collections.put("Вторая", integerList2);
        collections.put("Третья", integerList3);
        collections.put("Четвертая", integerList4);
        collections.put("Пятая", integerList5);
        System.out.println(collections);
        Map<String, Integer> listTask = new HashMap<>();
        for (Map.Entry<String, List<Integer>> task : collections.entrySet()) {
            listTask.put(task.getKey(), calcSumOfList(task.getValue()));
        }
        System.out.println(listTask);


        System.out.println("\nЗадание № 2/2");
        System.out.println("=======================");

        Map<Integer, String> list = new LinkedHashMap<>();
        list.put(0,"Степа");
        list.put(1, "Лариса");
        list.put(2, "Макар");
        list.put(3, "Савелий");
        list.put(4, "Лилия");
        list.put(5, "Маша");
        list.put(6, "Даша");
        list.put(7, "Миша");
        list.put(8, "Саша");
        list.put(9, "Петя");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
    }

    public static int calcSumOfList(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
    public static void addMap(String key, Integer value) {
        if (Objects.equals(map.put(key, value), value)) {
            throw new RuntimeException("Такой ключ и значение уже есть!");
        }
    }

}


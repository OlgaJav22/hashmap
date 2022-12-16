package guide;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Guide guide = new Guide("Горлов Роман", "+792836415");
        Guide guide1 = new Guide("Петрова Варвара", "+792838719");
        Guide guide2 = new Guide("Иванова Олеся", "+792835569");
        Guide guide3 = new Guide("Корманов Петр", "+791635769");
        Guide guide4 = new Guide("Евсеев Илья", "+791885762");

        HashMap<String, String> phone = new HashMap<>();
        phone.put(guide.getFullName(), guide.getNumberPhone());
        phone.put(guide1.getFullName(), guide1.getNumberPhone());
        phone.put(guide2.getFullName(), guide2.getNumberPhone());
        phone.put(guide3.getFullName(), guide3.getNumberPhone());
        phone.put(guide4.getFullName(), guide4.getNumberPhone());
        phone.keySet();

        System.out.println(phone.get("Петрова Варвара"));

    }

}

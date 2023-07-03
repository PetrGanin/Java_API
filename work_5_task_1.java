import java.util.HashMap;
import java.util.Map;

public class work_5_task_1 {
    public static void main(String[] args) {
        Map<Integer, String> password = new HashMap<>();
        password.put(12345566, "Иванов" );
        password.put(12345466, "петров" );
        password.put(123457766, "Сидоров" );
        password.put(12345596, "Васильев" );
        for(var item: password.entrySet()){
            if(item.getValue().equals("Иванов")){
                System.out.printf("%s: %s", item.getKey(), item.getValue());
            }
        }
    }
}

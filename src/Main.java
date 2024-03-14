import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Worker> workers = getWorkers();

        Map<String, List<Worker>> map1 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition));
        map1.entrySet().stream().forEach(e-> System.out.println(e));
    }

    private static List<Worker> getWorkers() {
        Worker w1 = new Worker("Ss", 39, 390, Position.SENIOR.getPosition());
        Worker w2 = new Worker("Rr", 45, 450, Position.MIDDLE.getPosition());
        Worker w3 = new Worker("Aa", 41, 410, Position.MIDDLE.getPosition());

        List<Worker> workers = Arrays.asList(w1, w2, w3);
        return workers;
    }
}

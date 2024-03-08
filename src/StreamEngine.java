import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEngine {

    public Map<String, List<Worker>> groupingByPosition(List<Worker> workers){
        return workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition));
    }
}

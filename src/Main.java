import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Ss", 39, 390, Position.SENIOR.getPosition());
        Worker w2 = new Worker("Rr", 45, 450, Position.MIDDLE.getPosition());
        Worker w3 = new Worker("Aa", 41, 410, Position.MIDDLE.getPosition());
        Worker w4 = new Worker("Mm", 33, 330, Position.JUNIOR.getPosition());
        Worker w5 = new Worker("Gg", 38, 380, Position.SENIOR.getPosition());
        Worker w6 = new Worker("Ee", 44, 440, Position.SENIOR.getPosition());
        Worker w7 = new Worker("Zz", 24, 240, Position.JUNIOR.getPosition());

        List<Worker> workers = Arrays.asList(w1, w2, w3, w4, w5, w6);
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class Routine {
    private Queue<Movement> _movements;

    public Routine() {
        _movements = new LinkedList<Movement>();
    }

    protected void addMovement(Movement movement) {
        _movements.add(movement);
    }

    public boolean done() {
        return _movements.isEmpty();
    }    

    public Movement nextMovement() {
        return _movements.remove();
    }
}

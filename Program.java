public class Program {
    public static void main(String[] args) {
        IRobot robot = new MyBot();
        Routine routine = new MyRoutine();

        double distance = 0.0;

        while (!routine.done()) {
            Movement movement = routine.nextMovement();

            distance += Math.sqrt(Math.pow(movement.x(), 2) + Math.pow(movement.y(), 2));

            robot.move(movement);
        }

        System.out.println("Robot position: " + robot.positionX() + ", " + robot.positionY());
        System.out.println("Distance travelled: " + distance);
    }
}
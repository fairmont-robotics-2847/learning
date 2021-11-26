public class Program {
    public static void main(String[] args) {
        IRobot robot = new MyBot();
        Routine routine = new MyRoutine();

        Course course = new Course();
        course.run(robot, routine);
        if (course.allVisited()) {
            System.out.println("All points visited!");
            System.out.println("Distance Travelled: " + course.distanceTravelled());
        } else {
            course.listMissedPoints();
        }
    }
}
public class Course {
    private Point[] _points;
    private double _distance;

    public Course() {
        _points = new Point[] {
            new Point(1, 1),
            new Point(102, -20),
            new Point(-10, 33),
            new Point(46, 23),
            new Point(-90, -90)
        };
        _distance = 0.0;
    }

    public void run(IRobot robot, Routine routine) {
        while (!routine.done()) {
            Movement movement = routine.nextMovement();

            for (Point point : _points) {
                point.testVisited(robot.xPosition(), robot.yPosition());
            }

            _distance += Math.sqrt(Math.pow(movement.x(), 2) + Math.pow(movement.y(), 2));

            robot.move(movement);
        }
    }

    public boolean allVisited() {
        boolean all = true;
        for (Point point : _points) {
            if (!point.visited()) {
                all = false;
                break;
            }
        }
        return all;
    }

    public void listMissedPoints() {
        for (Point point : _points) {
            if (!point.visited()) {
                System.out.println("Did not visit (" + point.x() + "," + point.y() + ")");
            }
        }
    }

    public double distanceTravelled() {
        return _distance;
    }

    private class Point {
        private int _x;
        private int _y;
        private boolean _visited;

        public Point(int x, int y) {
            _x = x;
            _y = y;
        }

        public void testVisited(int x, int y) {
            if (x == _x && y == _y) {
                _visited = true;
            }
        }

        public boolean visited() {
            return _visited;
        }

        public int x() {
            return _x;
        }

        public int y() {
            return _y;
        }
    }
}

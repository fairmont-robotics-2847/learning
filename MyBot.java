public class MyBot implements IRobot {
    private double _x;
    private double _y;

    public MyBot() {
        _x = 0;
        _y = 0;
    }

    @Override
    public void move(Movement movement) {
        _x += movement.x();
        _y += movement.y();
    }

    @Override
    public double positionX() {
        return _x;
    }

    @Override
    public double positionY() {
        return _y;
    }
}

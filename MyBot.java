public class MyBot implements IRobot {
    private int _x;
    private int _y;

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
    public int xPosition() {
        return _x;
    }

    @Override
    public int yPosition() {
        return _y;
    }
}

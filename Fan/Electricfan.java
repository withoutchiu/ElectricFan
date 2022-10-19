package Fan;

/**
 * Write a description of class Electricfan here.
 *
 * @author (Gilbert Chiu)
 * @version (a version number or a date)
 */
public class Electricfan
{
    enum Direction {
      FORWARD, BACKWARD
    }
    
    public static final int OFF = 0;

    private int speed = OFF;

    private Direction direction = Direction.FORWARD;

    public int getSpeed() {
	return speed;
    }

    public Direction getDirection() {
		return direction;
    }

    public void pullSpeedCord() {
        if (speed == 3) {
            speed = OFF;
        }else{
            speed++;
        }
    }

    public void pullDirectionCord() {
	direction = (direction == Direction.FORWARD) ? Direction.BACKWARD : Direction.FORWARD;
    }

    @Override
    public String toString() {
	return String.format("The " + this.getClass().getSimpleName() + " is working on %d speed in %s direction", speed, direction);
    }
}
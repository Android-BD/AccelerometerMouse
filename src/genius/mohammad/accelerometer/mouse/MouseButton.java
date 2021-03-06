package genius.mohammad.accelerometer.mouse;

public class MouseButton {

	public static final int FIRST_FINGER = 0;
	public static final int SECOND_FINGER = 1;
	private int PID = FIRST_FINGER;
	private boolean state = false;

	public MouseButton() {
	}

	public void associatePID(int PID) {
		this.PID = PID;
	}

	public int getPID() {
		return PID;
	}

	public void setPID(int PID) {
		this.PID = PID;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public boolean getState() {
		return state;
	}
}

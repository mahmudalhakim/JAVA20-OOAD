package facade_exercise.hometheater;

public class Amplifier {
	String description;

	public Amplifier(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " on");
	}

	public void off() {
		System.out.println(description + " off");
	}

	public void setSurroundSound() {
		System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
	}

	public void setVolume(int level) {
		System.out.println(description + " setting volume to " + level);
	}

	public String toString() {
		return description;
	}
}

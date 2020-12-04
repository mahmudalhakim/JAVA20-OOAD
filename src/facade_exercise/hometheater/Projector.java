package facade_exercise.hometheater;

public class Projector {
  String description;

  public Projector(String description) {
    this.description = description;
  }

  public void on() {
    System.out.println(description + " on");
  }

  public void off() {
    System.out.println(description + " off");
  }

  public void wideScreenMode() {
    System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
  }

  public String toString() {
    return description;
  }
}

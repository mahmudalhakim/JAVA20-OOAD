package facade_exercise.hometheater;

public class HomeTheaterTestDrive {
  public static void main(String[] args) {
    Amplifier amp = new Amplifier("Amplifier");
    Projector projector = new Projector("Projector");
    TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    Screen screen = new Screen("Theater Screen");

    HomeTheaterFacade homeTheater =
        new HomeTheaterFacade(amp, projector, screen, lights);

    homeTheater.watchMovie("\"The Design Patterns Movie\"");
    homeTheater.endMovie();
  }
}

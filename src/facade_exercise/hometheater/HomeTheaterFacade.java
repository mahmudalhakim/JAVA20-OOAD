package facade_exercise.hometheater;

public class HomeTheaterFacade {
  Amplifier amp;
  Projector projector;
  TheaterLights lights;
  Screen screen;

  public HomeTheaterFacade() {

    Amplifier amp = new Amplifier("Amplifier");
    Projector projector = new Projector("Projector");
    TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    Screen screen = new Screen("Theater Screen");

    this.amp = amp;
    this.projector = projector;
    this.screen = screen;
    this.lights = lights;
  }

  public void watchMovie(String movie) {
    System.out.println("Get ready to watch " + movie);
    lights.dim(10);
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setSurroundSound();
    amp.setVolume(5);
  }


  public void endMovie() {
    System.out.println("Shutting movie theater down...");
    lights.on();
    screen.up();
    projector.off();
    amp.off();
  }

}

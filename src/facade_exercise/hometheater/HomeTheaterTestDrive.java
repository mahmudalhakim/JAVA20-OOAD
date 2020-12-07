package facade_exercise.hometheater;

public class HomeTheaterTestDrive {
  public static void main(String[] args) {
    HomeTheaterFacade homeTheater = new HomeTheaterFacade();
    homeTheater.watchMovie("\"The Design Patterns Movie\"");
    homeTheater.endMovie();
  }
}

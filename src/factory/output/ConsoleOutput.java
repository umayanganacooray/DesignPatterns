package factory.output;

public class ConsoleOutput implements Output {

  public void showMessage(String message) {
    System.out.println(message);
  }

}

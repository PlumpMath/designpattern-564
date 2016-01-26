package factory.method;

/**
 * Created by hotjoyit on 16. 1. 27.
 */
public class Main {
  public static void main(String[] args) {
    Factory factory = new ConcreteFactoryA();
    factory.doUnboxingOperation();

    System.out.println();

    factory = new ConcreteFactoryB();
    factory.doUnboxingOperation();
  }
}

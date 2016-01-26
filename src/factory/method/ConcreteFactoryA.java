package factory.method;

/**
 * Created by hotjoyit on 16. 1. 27.
 */
public class ConcreteFactoryA extends Factory {
  @Override
  protected Product factoryMethod() {
    return new ConcreateProductA();
  }
}

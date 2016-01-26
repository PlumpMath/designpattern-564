package factory.method;

/**
 * Created by hotjoyit on 16. 1. 27.
 */
public class ConcreteFactoryB extends Factory {
  @Override
  protected Product factoryMethod() {
    return new ConcreteProductB();
  }
}

package factory.method;

/**
 * Created by hotjoyit on 16. 1. 27.
 */
public abstract class Factory {

  public void doUnboxingOperation() {
    System.out.println("Producing Product");
    Product concreteProduct = factoryMethod();

    System.out.println("Unboxing Product");
    System.out.println("Concrete Product is : " + concreteProduct.unboxing());
  }
  protected abstract Product factoryMethod();
}

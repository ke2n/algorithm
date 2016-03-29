package factory;

import factory.concrete.ConcreteFactory;
import factory.inter.BikeFactory;
import factory.inter.Body;
import factory.inter.Wheel;

public class Main {
  public void main(String[] str) {
    BikeFactory factory = new ConcreteFactory();
    Body body = factory.createBody();
    Wheel wheel = factory.createWheel();

    System.out.println(body.getClass());
    System.out.println(wheel.getClass());
  }
}

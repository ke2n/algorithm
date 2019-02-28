package designPattern.AbstractFactory;


import designPattern.AbstractFactory.concrete.ConcreteFactory;
import designPattern.AbstractFactory.inter.BikeFactory;
import designPattern.AbstractFactory.inter.Body;
import designPattern.AbstractFactory.inter.Wheel;

public class Main {
  public void main(String[] str) {
    BikeFactory factory = new ConcreteFactory();
    Body body = factory.createBody();
    Wheel wheel = factory.createWheel();

    System.out.println(body.getClass());
    System.out.println(wheel.getClass());
  }
}

package factory.concrete;

import factory.inter.BikeFactory;
import factory.inter.Body;
import factory.inter.Wheel;

/**
 * Created by Keens on 2016-03-29.
 */
public class ConcreteFactory implements BikeFactory {
  @Override
  public Body createBody() {
    return new ConcreteBody();
  }

  @Override
  public Wheel createWheel() {
    return new ConcreteWheel();
  }
}

package designPattern.AbstractFactory.inter;

/**
 * Created by Keens on 2016-03-29.
 */
public interface BikeFactory {
  public Body createBody();
  public Wheel createWheel();
}

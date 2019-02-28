package designPattern.AbstractFactory.concrete;


import designPattern.AbstractFactory.inter.BikeFactory;
import designPattern.AbstractFactory.inter.Body;
import designPattern.AbstractFactory.inter.Wheel;

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

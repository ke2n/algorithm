package designPattern.FactoryMethod.concrete;

import designPattern.FactoryMethod.framework.Item;

public class HpPotion implements Item {

    @Override
    public void use() {
        System.out.println("Use HpPotion");
    }
}

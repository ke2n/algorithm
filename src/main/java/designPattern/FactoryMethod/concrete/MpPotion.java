package designPattern.FactoryMethod.concrete;

import designPattern.FactoryMethod.framework.Item;

public class MpPotion implements Item {

    @Override
    public void use() {
        System.out.println("Use MpPotion");
    }
}

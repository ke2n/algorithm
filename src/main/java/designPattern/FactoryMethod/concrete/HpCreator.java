package designPattern.FactoryMethod.concrete;

import java.util.Date;

import designPattern.FactoryMethod.framework.Item;
import designPattern.FactoryMethod.framework.ItemCreator;

public class HpCreator extends ItemCreator {

    @Override
    protected void requestItemsInfo() {
        System.out.println("get HP ItemsInfo from database");
    }

    @Override
    protected void createItemLog() {
        System.out.println("HP createItemLog - " + new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}

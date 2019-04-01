package designPattern.FactoryMethod.concrete;

import java.util.Date;

import designPattern.FactoryMethod.framework.Item;
import designPattern.FactoryMethod.framework.ItemCreator;

public class MpCreator extends ItemCreator {

    @Override
    protected void requestItemsInfo() {
        System.out.println("get MP ItemsInfo from database");
    }

    @Override
    protected void createItemLog() {
        System.out.println("MP createItemLog - " + new Date());
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
}

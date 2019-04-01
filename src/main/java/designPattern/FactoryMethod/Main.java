package designPattern.FactoryMethod;

import designPattern.FactoryMethod.concrete.HpCreator;
import designPattern.FactoryMethod.concrete.MpCreator;
import designPattern.FactoryMethod.framework.Item;
import designPattern.FactoryMethod.framework.ItemCreator;

public class Main {

    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();
    }
}

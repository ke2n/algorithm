package designPattern.FactoryMethod.framework;

public abstract class ItemCreator {

    public Item create() {
        requestItemsInfo();
        Item item = createItem();
        createItemLog();

        return item;
    }

    protected abstract void requestItemsInfo();

    protected abstract void createItemLog();

    protected abstract Item createItem();
}

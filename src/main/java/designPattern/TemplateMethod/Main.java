package designPattern.TemplateMethod;

import designPattern.TemplateMethod.plugin.AbstractGameConnector;
import designPattern.TemplateMethod.plugin.DefaultGameConnector;

public class Main {

    public static void main(String[] args) {
        AbstractGameConnector helper = new DefaultGameConnector();

        helper.requestConnection("connection information");
    }
}

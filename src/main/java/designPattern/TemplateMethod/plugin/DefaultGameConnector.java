package designPattern.TemplateMethod.plugin;

public class DefaultGameConnector extends AbstractGameConnector {

    @Override
    protected String doSecurity(String string) {
        System.out.println("decode");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("authentication");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("authorization");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("connection step");
        return info;
    }
}

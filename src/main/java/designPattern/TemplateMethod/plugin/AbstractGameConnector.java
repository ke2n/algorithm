package designPattern.TemplateMethod.plugin;

public abstract class AbstractGameConnector {

    protected abstract String doSecurity(String string);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String userName);

    protected abstract String connection(String info);

    public String requestConnection(String encodedInfo) {
        String decodedInfo = doSecurity(encodedInfo);

        String id = "testId"; //decodedInfo.substring(0, 10);
        String pass = "testPassword"; //decodedInfo.substring(10, decodedInfo.length());

        if (!authentication(id, pass)) {
            throw new Error("id and pass are miss matched");
        }

        String userName = "userName";
        int i = authorization(userName);

        switch (i) {
            case 0:
                System.out.println("manager");
                break;
            case 1:
                System.out.println("user");
                break;
            case 2:
                System.out.println("free user");
                break;
            case 3:
                System.out.println("no auth");
                break;
            default:
                break;

        }
        return connection(decodedInfo);
    }
}

package designPattern.visitor.sns;

import designPattern.visitor.post.Picture;
import designPattern.visitor.post.Text;

public class Facebook implements SNS {

    @Override
    public void post(Text text) {
        System.out.println("Facebook text post");
    }

    @Override
    public void post(Picture text) {
        System.out.println("Facebook picture post");
    }
}

package designPattern.visitor.post;

import designPattern.visitor.sns.SNS;

public class Picture implements Post {

    @Override
    public void postOn(SNS sns) {
        sns.post(this);
    }
}

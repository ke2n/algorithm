package designPattern.visitor.post;

import designPattern.visitor.sns.SNS;

public class Text implements Post {

    @Override
    public void postOn(SNS sns) {
        sns.post(this);
    }
}

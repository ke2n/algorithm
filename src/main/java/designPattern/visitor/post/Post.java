package designPattern.visitor.post;

import designPattern.visitor.sns.SNS;

public interface Post {
    void postOn(SNS sns);

}

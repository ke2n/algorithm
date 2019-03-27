package designPattern.visitor.sns;

import designPattern.visitor.post.Picture;
import designPattern.visitor.post.Text;

public interface SNS {
    void post(Text text);
    void post(Picture text);
}

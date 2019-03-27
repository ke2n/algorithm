package designPattern.visitor;

import java.util.Arrays;
import java.util.List;

import designPattern.visitor.post.Picture;
import designPattern.visitor.post.Post;
import designPattern.visitor.post.Text;
import designPattern.visitor.sns.Facebook;
import designPattern.visitor.sns.SNS;
import designPattern.visitor.sns.Twitter;

public class MainClass {
    public static void main(String[] args) {
        List<Post> postList = Arrays.asList(new Text(), new Picture());
        List<SNS> snsList = Arrays.asList(new Twitter(), new Facebook());

        postList.forEach(post -> snsList.forEach(post::postOn));
    }
}

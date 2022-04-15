package be.avidoo.patterns.designpatterns.structural.proxy;

/**
 * Same concept as Aspects
 */
public class ProxyMain {

    public static void main(String[] args) {
        TwitterServiceStub twitterServiceStub = new TwitterServiceStub();

        TwitterService service = (TwitterService) SecurityProxy.newInstance(twitterServiceStub);
        System.out.println(service.getTimeline("bla"));

        service.postToTimeline("bla", "Post a message");
    }
}

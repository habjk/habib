package pubsub;

import publisher.Publisher;
import publisher.PublisherImpl;
import service.Service;
import subscriber.Subscriber;
import subscriber.SubscriberImpl;

public class Main {

    public static void main(String[] args) {

        Publisher newsPublisher = new PublisherImpl();
        Publisher musicPublisher = new PublisherImpl();
        Subscriber newsSubscriber = new SubscriberImpl();
        Subscriber musicSubscriber = new SubscriberImpl();
        Service Service = new Service();


        Message news1 = new Message("News", "Local news...");
        Message news2 = new Message("News", "Foreign news.....");

        newsPublisher.publish(news1, Service);
        newsPublisher.publish(news2, Service);

        Message music1 = new Message("Music", "New music...");
        Message music2 = new Message("Music", "Popular...");

        musicPublisher.publish(music1, Service);
        musicPublisher.publish(music2, Service);

        newsSubscriber.addSubscriber("News",Service);
        musicSubscriber.addSubscriber("Music",Service);
        Service.broadcast();

        System.out.println("Messages of News subscriber.Subscriber are: \n");
        newsSubscriber.printMessages();

        System.out.println("\nMessages of Music subscriber.Subscriber are: \n");
        musicSubscriber.printMessages();

    }
}

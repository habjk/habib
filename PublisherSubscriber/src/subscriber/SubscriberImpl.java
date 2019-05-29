package subscriber;

import service.Service;

public class SubscriberImpl extends Subscriber{

    public void addSubscriber(String topic, Service Service){
        Service.addSubscriber(topic, this);
    }
    public void unSubscribe(String topic, Service Service){
        Service.removeSubscriber(topic, this);
    }
    public void getMessagesForSubscriberOfTopic(String topic, Service Service) {
        Service.getMessagesForSubscriberOfTopic(topic, this);

    }
}

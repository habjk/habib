package subscriber;

import pubsub.Message;
import service.Service;

import java.util.ArrayList;
import java.util.List;

public abstract class Subscriber {

    private List<Message> subscriberMessages = new ArrayList<Message>();

    public List<Message> getSubscriberMessages() {
        return subscriberMessages;
    }
    public void setSubscriberMessages(List<Message> subscriberMessages) {
        this.subscriberMessages = subscriberMessages;
    }
    public abstract void addSubscriber(String topic, Service Service);
    public abstract void unSubscribe(String topic, Service Service);
    public abstract void getMessagesForSubscriberOfTopic(String topic, Service Service);

    public void printMessages(){
        for(Message message : subscriberMessages){
            System.out.println("pubsub.Message Topic -> "+ message.getTopic() + " : " + message.getPayload());
        }
    }
}

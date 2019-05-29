package publisher;
import pubsub.Message;
import service.Service;

public class PublisherImpl implements Publisher{

    public void publish(Message message, Service Service) {
        Service.addMessageToQueue(message);
    }
}

package publisher;

import pubsub.Message;
import service.Service;

public interface Publisher {

    void publish(Message message, Service Service);
}

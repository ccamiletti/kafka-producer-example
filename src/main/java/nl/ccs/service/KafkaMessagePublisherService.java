package nl.ccs.service;

import lombok.RequiredArgsConstructor;
import nl.ccs.model.UserDTO;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaMessagePublisherService {

    //private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessageToTopic(String message) {
        //kafkaTemplate.send("ccs-topic-str", message);
    }

    public void sendMessageToTopic(UserDTO userDTO) {
        //kafkaTemplate.send("ccs-topic", userDTO);
    }

    public String sayHi() {
        return "Hi Marielle !!!";
    }


}

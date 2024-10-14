package nl.ccs.controller;


import lombok.RequiredArgsConstructor;
import nl.ccs.model.UserDTO;
import nl.ccs.service.KafkaMessagePublisherService;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class EventController {

    private final KafkaMessagePublisherService kafkaMessagePublisherService;

    @GetMapping("/publish/{message}")
    public ResponseEntity<?> publishMessage(@PathVariable String message) {
        kafkaMessagePublisherService.sendMessageToTopic(message);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/publish")
    public ResponseEntity<?> publishObjectMessage(@RequestBody UserDTO message) {
        kafkaMessagePublisherService.sendMessageToTopic(message);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/sayHi")
    public ResponseEntity<String> sayHi() {
        return ResponseEntity.ok(kafkaMessagePublisherService.sayHi());
    }

    @GetMapping("/sayHi")
    public ResponseEntity<String> sayBye() {
        return ResponseEntity.ok(kafkaMessagePublisherService.sayHi());
    }

}

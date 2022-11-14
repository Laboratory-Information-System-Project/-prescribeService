package com.douzone.prescribeservice.service.kafka;

import com.douzone.prescribeservice.repository.prescribe.PrescribeRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    // FIXME: repository -> mapper
    private final PrescribeRepository prescribeRepository;
    //
    // FIXME: topics modify, method customizing
    @KafkaListener(topics = "updateStatus")
    public void updateStatus(String kafkaMessage){
        log.info("Kafka Message: ->" + kafkaMessage);

        Map<String, Object> map = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try{
            map = mapper.readValue(kafkaMessage, new TypeReference<Map<String, Object>>() {});
        }catch (JsonProcessingException ex){
            ex.printStackTrace();
        }

        List<Long> test = new ArrayList<>();

        List<String> prescribeCodeList = (List<String>) map.get("\"prescribeCodeList\"");
        // prescribeCodeList.stream().map((item)-> test.add(Long.parseLong(item)));
        test = prescribeCodeList.stream().map(Long::parseLong).collect(Collectors.toList());
        String status = (String) map.get("\"status\"");

        prescribeRepository.updateStatus(test, status);
        //FIXME 예외처리

    }
}
package com.example.transaction.service.notification;

import com.example.transaction.model.NotificationModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Value("${notification.service.base}")
    String notificationBaseUrl;

    RestTemplate restTemplate = new RestTemplate();

    @Override
    public void sendNotification(NotificationModel model) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<NotificationModel> entity = new HttpEntity<>(model, headers);

        ResponseEntity<HttpStatus> response = restTemplate.postForEntity(notificationBaseUrl + "/notification", entity, HttpStatus.class);
        System.out.println(response.getBody());
    }
}

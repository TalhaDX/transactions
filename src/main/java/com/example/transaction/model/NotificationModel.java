package com.example.transaction.model;

import com.example.transaction.type.NotificationReason;
import com.example.transaction.type.NotificationSendType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationModel {

    private String email;
    private NotificationSendType sendType;
    private NotificationReason reason;

}
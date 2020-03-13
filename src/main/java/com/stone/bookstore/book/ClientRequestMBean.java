package com.stone.bookstore.book;

import java.util.Random;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedNotification;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;
import org.springframework.stereotype.Component;

@Component
@ManagedResource
@ManagedNotification(name = "name", notificationTypes = { "notificationTypes" }, description = "description")
public class ClientRequestMBean implements NotificationPublisherAware {

  @ManagedAttribute
  public int getCount() {
    return new Random().nextInt();
  }

  @Override
  public void setNotificationPublisher(NotificationPublisher notificationPublisher) {
    // TODO Auto-generated method stub

  }
}
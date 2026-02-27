package org.example.tallemalle_backend.notification;

import org.example.tallemalle_backend.notification.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}

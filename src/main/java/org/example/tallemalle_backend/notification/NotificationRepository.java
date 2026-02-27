package org.example.tallemalle_backend.notification;

import org.example.tallemalle_backend.notification.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findAllByUserIdx(Long userIdx);
}

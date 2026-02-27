package org.example.tallemalle_backend.notification;

import lombok.RequiredArgsConstructor;
import org.example.tallemalle_backend.notification.model.Notification;
import org.example.tallemalle_backend.notification.model.NotificationDto;
import org.example.tallemalle_backend.user.model.AuthUserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public List<NotificationDto.ReadRes> list(AuthUserDetails user) {
        List<Notification> entities = notificationRepository.findAllByUserIdx(user.getIdx());
        return entities.stream().map(NotificationDto.ReadRes::from).toList();
    }

    public List<NotificationDto.ReadTop5Res> summary(AuthUserDetails user) {
        List<Notification> entitiesTop5 = notificationRepository.findTop5ByUserIdxOrderByCreatedAtDesc(user.getIdx());
        return entitiesTop5.stream().map(NotificationDto.ReadTop5Res::from).toList();
    }
}

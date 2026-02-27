package org.example.tallemalle_backend.notification.model;

import lombok.Builder;
import lombok.Getter;

public class NotificationDto {
    @Getter
    @Builder
    public static class ReadRes{
        private Long idx;
        private String title;
        private String contents;
        private boolean isRead;

        public static ReadRes from(Notification entity) {
            return ReadRes.builder()
                    .idx(entity.getIdx())
                    .title(entity.getTitle())
                    .contents(entity.getContents())
                    .isRead(entity.isRead())
                    .build();
        }
    }
}

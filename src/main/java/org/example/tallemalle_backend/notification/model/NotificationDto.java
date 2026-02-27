package org.example.tallemalle_backend.notification.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Locked;

import java.time.LocalDateTime;

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

    @Getter
    @Builder
    public static class ReadTop5Res{
        private Long idx;
        private String title;
        private boolean isRead;
        private LocalDateTime created_at;

        public static ReadTop5Res from(Notification entity){
            return ReadTop5Res.builder()
                    .idx(entity.getIdx())
                    .title(entity.getTitle())
                    .created_at(entity.getCreatedAt())
                    .isRead(entity.isRead())
                    .build();
        }
    }

    @Getter
    @Builder
    public static class ReadOnlyRes{
        private Long idx;
        private boolean isRead;

        public static ReadOnlyRes from(Notification entity){
            return ReadOnlyRes.builder()
                    .idx(entity.getIdx())
                    .isRead(entity.isRead())
                    .build();
        }
    }
}

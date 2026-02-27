package org.example.tallemalle_backend.user.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.tallemalle_backend.notification.model.Notification;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    private String email;
    private String name;
    @Setter
    private String password;
    @Setter
    private boolean enable;
    @ColumnDefault("'ROLE_USER'")
    private String role;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    List<Notification> notificationList;
}

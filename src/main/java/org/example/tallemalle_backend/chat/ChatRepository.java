package org.example.tallemalle_backend.chat;

import org.example.tallemalle_backend.chat.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {
}

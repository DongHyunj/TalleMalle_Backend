package org.example.tallemalle_backend.chat;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.example.tallemalle_backend.chat.model.ChatDto;
import org.example.tallemalle_backend.common.model.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/chat")
@RestController
@RequiredArgsConstructor
public class ChatController {
    private final ChatService chatService;

    @PostMapping("/send")
    public ResponseEntity send(@RequestBody ChatDto.SendReq dto) {
        ChatDto.SendRes result = chatService.send(dto);
        return ResponseEntity.ok(BaseResponse.success(result));
    }
}

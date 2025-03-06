package chatAdapter;

class LegacyChatService {
    public void sendLegacyMessage(String message) {
        System.out.println("Legacy Chat: " + message);
    }
}

// Новый целевой интерфейс
interface ChatService {
    void sendMessage(String message);
}

// Адаптер для интеграции LegacyChatService с новым интерфейсом
class ChatServiceAdapter implements ChatService {
    private final LegacyChatService legacyChatService;

    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }

    @Override
    public void sendMessage(String message) {
        legacyChatService.sendLegacyMessage(message);
    }
}
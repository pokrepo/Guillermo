package telegram;

import config.TelegramConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Guillermo extends TelegramLongPollingBot {

    @Autowired
    private TelegramConfig telegramConfig;

    @Autowired
    private GuillermoFacade guillermoFacade;

    @Override
    public String getBotUsername() {
        return telegramConfig.getName();
    }

    @Override
    public String getBotToken() {
        return telegramConfig.getAccessToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        guillermoFacade.handleUpdate(update);
    }
}

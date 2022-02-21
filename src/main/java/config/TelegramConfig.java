package config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("bot")
@Getter
@Setter
public class TelegramConfig {

    private String name;
    private String accessToken;

}

package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @MessageMapping("/stockticker")
    @SendTo("/topic/stocks")
    public Quote stockQuotes(Quote quote) throws Exception {

        if(quote != null) {
            return quote;
        }
        return null;

    }

}
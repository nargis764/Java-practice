import java.util.Date;

public class AlfredBot {
    public String basicGreeting() {
        return "Hello! It's nice to see you";
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Hi %s, good %s!", name, dayPeriod);
    }

    public String dateAnnouncement() {
        return String.format("Today's date is %s", new Date());
    }

    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis")> -1) {
            return "Right Away Sir, She is not sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred")> -1) {
            return "At your service. As you wish naturally.";
        }
        return "Right. And with that we shall retire.";
    }
    
}

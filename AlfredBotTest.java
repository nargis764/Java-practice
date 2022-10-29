public class AlfredBotTest {
    public static void main(String args[]) {
        AlfredBot alfred = new AlfredBot();
        String greet = alfred.guestGreeting("Ash", "morning");
        String day = alfred.dateAnnouncement();
        System.out.println(greet);        
        System.out.println(day);
        String response = alfred.respondBeforeAlexis("Hey Alexis! What is the temperature now?");
        System.out.println(response);
    }
    
}
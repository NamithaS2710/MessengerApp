public class Main {
    public static void main(String[] args) {
        SMSMessagingService sms = new SMSMessagingService();
        EmailMessagingService email= new EmailMessagingService();
        WhatsAppMessagingService wapp = new WhatsAppMessagingService();
        sms.sendMessage();
        email.sendMessage();
        wapp.sendMessage();
        MessagingService.message();
    }
}
interface MessagingService {
    static void message()
    {
        System.out.println("Hello");
    }
    abstract  void sendMessage();
}
class SMSMessagingService implements MessagingService
{
    @Override
    public void sendMessage() {
        System.out.println("hi sms");
    }
}
class EmailMessagingService implements MessagingService
{
    @Override
    public void sendMessage() {
        System.out.println("bonjour email");
    }
}
class WhatsAppMessagingService implements MessagingService
{
    @Override
    public void sendMessage() {
        System.out.println("Namaste whatsapp");
    }
}

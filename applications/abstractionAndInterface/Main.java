public class Main {
    public static void main(String[] args) {
        SendButtonClass sendButton = new SendButtonClass();
        sendButton.setCaption("Send");
        sendButton.setSendTo("sarazaamou@gmail.com");
        sendButton.setMessage("hello sara");
        sendButton.buttonPress();

        ForwardButtonClass forwardButton = new ForwardButtonClass();
        forwardButton.setCaption("Forward");
        forwardButton.setForwardTo("sarazaamou@gmail.com");
        forwardButton.setMessage("Hello");
        forwardButton.buttonPress();
    }
}

package desafios.poo;

import java.util.List;

public interface MessageInterface {
    void sendMessage(String contact, String message);
    List<Message> getMessages();
}
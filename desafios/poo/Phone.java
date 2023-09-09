package desafios.poo;

import java.util.List;

public class Phone implements CallInterface, MessageInterface {
    private List<Contact> contacts;
    private List<Call> callHistory;
    private List<Message> messageHistory;
    @Override
    public void sendMessage(String contact, String message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendMessage'");
    }
    @Override
    public List<Message> getMessages() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMessages'");
    }
    @Override
    public void dial(String phoneNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dial'");
    }
    @Override
    public void answer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'answer'");
    }
    @Override
    public void end() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'end'");
    }

    // Implementação dos métodos das interfaces CallInterface e MessageInterface
}

package homeworks.homeworkenum.task5;

import java.util.ArrayList;
import java.util.List;

public class MessageService {

    private List<Message> listOfMessage = new ArrayList<>();

    public void addMessage(Message message) {
        listOfMessage.add(message);
    }

    public List<Message> getMessages(ProductType productType) throws Exception {

        List<Message> messagesType = new ArrayList<>();

        ProductType productTypeTwo = productIsCreate(productType.getType());

        listOfMessage.forEach( v -> {
            if (v.getProductType().equals(productTypeTwo)) {
                messagesType.add(v);
            }
        });

        return messagesType;
    }

    public List<Message> getListOfMessage(MessageType messageType) throws Exception {
        List<Message> messageTypeList = new ArrayList<>();
        MessageType messageTypeTwo = messageIsCreate(messageType.getMessageType());

        listOfMessage.forEach(message -> {
            if (message.getMessage().equals(messageTypeTwo)) {
                messageTypeList.add(message);
            }
        });

        return messageTypeList;
    }



    public ProductType productIsCreate(String productType) throws Exception {

        for (ProductType value : ProductType.values()) {
            if (value.name().equalsIgnoreCase(productType)) {
                return value;
            }
        }
        throw new Exception("Продукт не найден");
    }

    public MessageType messageIsCreate(String messageType) throws Exception {

        for (MessageType value : MessageType.values()) {
            if (value.name().equalsIgnoreCase(messageType)) {
                return value;
            }
        }
        throw new Exception("Сообщение не найдено");
    }
}

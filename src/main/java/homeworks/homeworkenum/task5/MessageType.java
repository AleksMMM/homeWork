package homeworks.homeworkenum.task5;

public enum MessageType {

    FEEDBACK("ОТЗЫВ"), CRASH("АВАРИЯ"), FAULT("МЕЛКИЕ НЕПОЛАДКИ"), PAYMENT("ОПЛАТА");

    final String messageType;

    MessageType (String messageType) {
        this.messageType = messageType;
    }

    public String getMessageType() {
        return messageType;
    }

    @Override
    public String toString() {
        return messageType;
    }
}
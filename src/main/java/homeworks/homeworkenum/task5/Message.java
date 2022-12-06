package homeworks.homeworkenum.task5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String theme;
    private ProductType productType;
    private MessageType messageType;
    private String message;

}
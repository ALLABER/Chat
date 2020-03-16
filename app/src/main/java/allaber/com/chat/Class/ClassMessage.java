package allaber.com.chat.Class;

public class ClassMessage {
    private String messageText;
    private String messageUser;
    private String messageUserImage;
    private long messageTime;

    public ClassMessage(String messageText, String messageUser, String messageUserImage, long messageTime){
        this.messageText = messageText;
        this.messageUser = messageUser;
        this.messageUserImage = messageUserImage;
        this.messageTime = messageTime;
    }

    public ClassMessage(){

    }
}

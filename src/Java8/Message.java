package Java8;

public interface Message {
    void sendMsg();
    default void sendPicture(){
        System.out.println("Send Pictures");
    }

    default void sendMms(){
        System.out.println("Send MMS");
    }

}
class SendMessage implements Message{
    @Override
    public void sendMsg() {
        System.out.println("Send Message");
    }
}
class MessageImpl{
    public static void main(String[] args) {
        Message message = new SendMessage();
        message.sendMsg();
        message.sendPicture();

        Message sendMessage = () ->{
            System.out.println("In Lambda");
        };//lambda
        sendMessage.sendMsg();//will not get called, it will print "In Lambda"
        sendMessage.sendPicture();
    }
}
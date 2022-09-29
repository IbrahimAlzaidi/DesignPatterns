package BehavioralDesigns.Mediator;

public class Client {
    public static void main(String [] args){
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator,"Ibrahim");
        User user2 = new UserImpl(mediator,"Ahmed");
        User user3 = new UserImpl(mediator,"Harith");
        User user4 = new UserImpl(mediator,"Abdulqader");
        User user5 = new UserImpl(mediator,"Abrar");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user1.send("Hi All");
    }
}

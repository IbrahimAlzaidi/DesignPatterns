package BehavioralDesigns.Strategy;


public class Client {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by PayPal.
        cart.pay(new PaypalStrategy("Ibrahim@gmail.com","myPassword"));
        // pay by Credit Card.
        cart.pay(new CreditCartStrategy("Ibrahim","22222","444","12/15"));
    }
}
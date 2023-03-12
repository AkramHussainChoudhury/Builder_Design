package Observer;


import java.util.ArrayList;
import java.util.List;

public class Flipkart {

    private static Flipkart instance;
    private List<OrderPlacedSubscriber> orderplacedsubscribers = new ArrayList<>();

    public static Flipkart getInstance() {
        if (instance == null) {
            instance = new Flipkart();
        }
        return instance;
    }

void registerSubscriber(OrderPlacedSubscriber orderplacedsubscriber ){
    orderplacedsubscribers.add(orderplacedsubscriber);
  }

  void unregister(OrderPlacedSubscriber orderplacedsubscriber){
      orderplacedsubscribers.remove(orderplacedsubscriber);
  }

  public void orderPlaced(){
        System.out.println("Here");
        for(OrderPlacedSubscriber order:orderplacedsubscribers){
            System.out.println("Order");
            order.announceOrderPlaced();
        }
  }
}

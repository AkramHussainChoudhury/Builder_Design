package Decorator;

public class Client {

    public static void main(String[] args) {
        IceCreamConeConstituents icecream =
                new ChocoChips(
                   new VanillaScoop(
                       new ChocoChips(
                            new StrawberryScoop(
                                 new OrangeCone()
                   )
                     )
                )
                );
        System.out.println(icecream.getCost());
    }
}

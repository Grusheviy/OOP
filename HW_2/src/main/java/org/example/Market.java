package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehavior, QueueBehavior {
    List<Actor> Queue = new ArrayList<>();

    @Override
    public void AcceptToMarket(Actor actor) {
        System.out.println(actor.GetName() + " вошел в магазин");
        TakeInQueue(actor);
    }

    @Override
    public void ReleaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors){
            Queue.remove(actor);
            System.out.println(actor.GetName() + " вышел из магазина");
        }

    }

    @Override
    public void Update() {
        MakeOrders();
        TakeOrders();
        RealeseFromQueue();
    }

    @Override
    public void TakeInQueue(Actor actor) {
        Queue.add(actor);
        System.out.println(actor.GetName() + " встал в чередь");
    }

    @Override
    public void MakeOrders() {
        for (Actor actor : Queue){
            if(!actor.IsMakeOrder){
                actor.SetMakeOrder(true);
                System.out.println(actor.GetName() + " сделал свой заказ");
            }
        }
    }

    @Override
    public void TakeOrders() {
        for(Actor actor :Queue){
            if(actor.IsMakeOrder){
                actor.SetTakeOrder(true);
                System.out.println(actor.GetName() + " забрал свой заказ");
            }
        }

    }

    @Override
    public void RealeseFromQueue() {
        List<Actor> RealesedActors = new ArrayList<>();

        for (Actor actor: Queue){
             if(actor.IsTakeOrder){
                 RealesedActors.add(actor);
                 System.out.println(actor.GetName() + " покинул очередь");
             }
        }
        ReleaseFromMarket(RealesedActors);
    }
}

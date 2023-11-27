package org.example;

public interface QueueBehavior {
    void TakeInQueue(Actor actor);
    void MakeOrders() ;
    void TakeOrders();
    void RealeseFromQueue();
}

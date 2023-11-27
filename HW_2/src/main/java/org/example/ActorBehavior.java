package org.example;

public interface ActorBehavior {
    void SetMakeOrder(boolean MakeOrder);
    void SetTakeOrder(boolean TakeOrder);
    boolean IsMakeOrder();
    boolean IsTakeOrder();

}

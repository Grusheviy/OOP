package org.example;

public class Human extends Actor{
    public Human(String name) {
        super(name);
    }
    @Override
    String GetName() {
        return super.name;
    }
    @Override
    public void SetMakeOrder(boolean MakeOrder) {super.IsMakeOrder = MakeOrder;}
    @Override
    public void SetTakeOrder(boolean TakeOrder) {super.IsTakeOrder = TakeOrder;}
    @Override
    public boolean IsMakeOrder() {return super.IsMakeOrder;}
    @Override
    public boolean IsTakeOrder() {return super.IsTakeOrder;}
}

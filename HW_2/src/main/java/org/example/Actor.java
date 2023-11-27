package org.example;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean IsMakeOrder;
    protected boolean IsTakeOrder;

    abstract String GetName();

    public Actor(String name) {
        this.name = name;
    }
}


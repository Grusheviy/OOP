package org.example;

import java.util.List;

public interface MarketBehavior {
    void AcceptToMarket(Actor actor);
    void ReleaseFromMarket(List<Actor> actors);
    void Update();

}

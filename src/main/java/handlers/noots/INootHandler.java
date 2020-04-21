package handlers.noots;

import models.Reply;

public interface INootHandler {
    Reply sendNoot(String data);

    Reply getNoot(String data);

    Reply getAllNoots();

    Reply getNootsTimeline(String data);

    Reply getNootsFromUser(String data);

    Reply deleteNoot(String data);
}

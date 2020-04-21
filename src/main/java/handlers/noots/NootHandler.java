package handlers.noots;

import com.google.gson.Gson;
import dbal.noots.NootRepo;
import logging.Logger;
import models.Noot;
import models.Reply;
import models.Status;
import models.User;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;

public class NootHandler implements INootHandler {
    NootRepo repo;
    JSONParser jsonParser;
    Gson gson;

    public NootHandler(NootRepo repo) {
        this.repo = repo;
        this.jsonParser = new JSONParser();
        gson = new Gson();
    }

    public Reply sendNoot(String data) {
        return null;
    }

    public Reply getNoot(String data) {
        return null;
    }

    public Reply getAllNoots() {
        try {
            ArrayList<Noot> noots = repo.getAllNoots();

            if (noots != null)
                return messageCreator(Status.OK, noots);
            else
                return messageCreator(Status.ERROR, new ArrayList<Noot>());
        } catch (Exception ex) {
            Logger.getInstance().log(ex);
            return messageCreator(Status.ERROR, new ArrayList<Noot>());
        }
    }

    public Reply getNootsTimeline(String data) {
        return null;
    }


    public Reply getNootsFromUser(String data) {
        return null;
    }

    public Reply deleteNoot(String data) {
        return null;
    }

    private Reply messageCreator(Status s, Object data) {
        System.out.println(gson.toJson(data));
        return new Reply(s, gson.toJson(data));
    }
}

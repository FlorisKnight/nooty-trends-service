package dbal.noots;

import models.Noot;
import models.User;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;

public class NootRepo {
    public Noot saveNoot(Noot noot){
        noot.id = "1";
        return noot;
    }

    public Noot getNoot(String id){
        return null;
    }

    public ArrayList<Noot> getAllNoots(){
        ArrayList<Noot> noots = new ArrayList<>();
        int i;
        for (i = 0; i < 50; i++) {
            noots.add(new Noot(Integer.toString(i), "admin", "Wed Sep 14 1988 17:04:28 GMT+0000 (UTC)", new User("0", "admin", "admin@admin.com", "admin")));
        }
        return noots;
    }

    public ArrayList<Noot> getNootsTimeline(String id){
        return null;
    }

    public ArrayList<Noot> getNootsFromUser(String userId, String nootId){
        return null;
    }

    public Noot deleteNoot(String nootId){
        return null;
    }

}

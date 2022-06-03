package com.example.myapplication;

import java.util.ArrayList;

public class PlayersList {

    ArrayList<Player> pList = new ArrayList<>();

    public PlayersList(String ip) {
        String url = "http://"+ip+"/getPlayers.php";
        try {
            OkHttpHandler okHttpHandler = new OkHttpHandler();
            pList = okHttpHandler.getPlayers(url);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Player findPlayer(int id){
        for(int i=0;i<pList.size();i++){
            if(pList.get(i).getId() == id){
                return pList.get(i);
            }
        }
        return null;
    }
}

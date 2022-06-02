package com.example.myapplication;

import java.util.ArrayList;

public class TeamsList {
    ArrayList<Team> tList = new ArrayList<>();

    public TeamsList(String ip) throws Exception {
        String url = "http://192.168.1.2/getTeams.php";

        try {
            OkHttpHandler okHttpHandler = new OkHttpHandler();
            tList = okHttpHandler.getTeams(url);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Team findTeam(int id){
        for(int i=0;i<tList.size();i++){
            if(tList.get(i).getId() == id){
                return tList.get(i);
            }
        }
        return null;
    }
}

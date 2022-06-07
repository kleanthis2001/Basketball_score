package com.example.myapplication;

import java.util.ArrayList;

public class TeamsOverallStatsLists {
    ArrayList<TeamOverallStats> mList = new ArrayList<>();
    private String myIP;

    public TeamsOverallStatsLists(String ip){
        String url = "http://"+ip+"/getTeamsOverallStats.php";
        myIP = ip;
        try {
            OkHttpHandler okHttpHandler = new OkHttpHandler();
            mList = okHttpHandler.getTeamOverallStats(url);
        } catch (Exception e){
            e.printStackTrace();
        }


    }

    public TeamOverallStats FindTeamsStat(int id){
        for(int i=0;i<mList.size();i++){
            if(mList.get(i).getId() == id){
                return mList.get(i);
            }
        }
        return null;
    }

    public ArrayList<TeamOverallStats> getmList() {
        return mList;
    }

    public String getMyIP() {
        return myIP;
    }

    
}

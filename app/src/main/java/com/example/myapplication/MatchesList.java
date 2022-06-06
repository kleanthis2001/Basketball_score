package com.example.myapplication;

import java.util.ArrayList;

public class MatchesList {
    ArrayList<Match> mList = new ArrayList<>();
    private String myIP;

    public MatchesList(String ip) {
        String url = "http://"+ip+"/getMatches.php";
        myIP = ip;
        try {
            OkHttpHandler okHttpHandler = new OkHttpHandler();
            mList = okHttpHandler.getMatches(url);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Match findMatch(int id){
        for(int i=0;i<mList.size();i++){
            if(mList.get(i).getId() == id){
                return mList.get(i);
            }
        }
        return null;
    }

    public ArrayList<String> getmList() {
        TeamsList tml=null;
        try {
            tml = new TeamsList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }
        ArrayList<String> mList2 = new ArrayList<>();
        for(int i=0;i<mList.size();i++){
            mList2.add(tml.findTeam(mList.get(i).getHome_id()).getName()+" - "+tml.findTeam(mList.get(i).getAway_id()).getName());
        }
        return mList2;
    }

    public Match findMatch(String teams) throws Exception {
        TeamsList tlst = new TeamsList(myIP);
        for(int i=0;i<mList.size();i++){
            if(((tlst.findTeam(mList.get(i).getHome_id()).getName())+" - "+tlst.findTeam(mList.get(i).getAway_id()).getName()).equals(teams)){
                return mList.get(i);
            }
        }
        return null;
    }
}

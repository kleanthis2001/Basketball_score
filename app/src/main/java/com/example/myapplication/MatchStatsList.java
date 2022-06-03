package com.example.myapplication;

import java.util.ArrayList;

public class MatchStatsList {
    ArrayList<MatchStats> mList = new ArrayList<>();

    public MatchStatsList(String ip) {
        String url = "http://"+ip+"/getStats.php";
        try {
            OkHttpHandler okHttpHandler = new OkHttpHandler();
            mList = okHttpHandler.getStats(url);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public MatchStats findStats(int match,int team){
        for(int i=0;i<mList.size();i++){
            if((mList.get(i).getMatch_id() == match)&&(mList.get(i).getTeam_id() == team)){
                return mList.get(i);
            }
        }
        return null;
    }
}

package com.example.myapplication;

import java.util.ArrayList;

public class MatchesList {
    ArrayList<Match> mList = new ArrayList<>();

    public MatchesList(String ip) {
        String url = "http://"+ip+"/getMatches.php";
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
}

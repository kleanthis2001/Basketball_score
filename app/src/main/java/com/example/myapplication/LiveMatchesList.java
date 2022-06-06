package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class LiveMatchesList {
    ArrayList<LiveMatch> liveList = new ArrayList<>();

    public LiveMatchesList(String ip) {
        String url = "http://"+ip+"/getLiveMatches.php";
        try {
            OkHttpHandler okHttpHandler = new OkHttpHandler();
            liveList = okHttpHandler.getLiveMatches(url);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<LiveMatch> getLiveList() {
        return liveList;
    }

    public List<String> getNames(){
        List<String> Alist = new ArrayList<>();
        for(int i=0;i<liveList.size();i++){
            Alist.add(Integer.toString(liveList.get(i).getId()));
        }
        return Alist;
    }

    public LiveMatch findMatch(int id){
        for(int i=0;i<liveList.size();i++){
            if(liveList.get(i).getId() == id){
                return liveList.get(i);
            }
        }
        return null;
    }


}
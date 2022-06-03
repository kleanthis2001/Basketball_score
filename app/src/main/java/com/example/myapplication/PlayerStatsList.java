package com.example.myapplication;

import java.util.ArrayList;

public class PlayerStatsList {

    ArrayList<PlayerStats> sList = new ArrayList<>();

    public PlayerStatsList(String ip) {
        String url = "http://"+ip+"/getPersonalSum.php";
        try {
            OkHttpHandler okHttpHandler = new OkHttpHandler();
            sList = okHttpHandler.getPersonalSum(url);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<PlayerStats> getTopPoints(){
        ArrayList<PlayerStats> psl = new ArrayList<>();
        PlayerStats temp = new PlayerStats(99999,0,0,0,9999);
        int top1=0;
        PlayerStats pl1=temp;
        int top2=0;
        PlayerStats pl2=temp;
        int top3=0;
        PlayerStats pl3=temp;
        int top4=0;
        PlayerStats pl4=temp;
        for(int i=0;i<sList.size();i++){
            if(sList.get(i).getPoints()>top1){
                top4=pl3.getPoints();
                pl4 = pl3;
                top3=pl2.getPoints();
                pl3 = pl2;
                top2=pl1.getPoints();
                pl2 = pl1;
                top1=sList.get(i).getPoints();
                pl1 = sList.get(i);
            }else if(sList.get(i).getPoints()>top2){
                top4=pl3.getPoints();
                pl4 = pl3;
                top3=pl2.getPoints();
                pl3 = pl2;
                top2=sList.get(i).getPoints();
                pl2 = sList.get(i);
            }else if(sList.get(i).getPoints()>top3){
                top4=pl3.getPoints();
                pl4 = pl3;
                top3=sList.get(i).getPoints();
                pl3 = sList.get(i);
            }else if(sList.get(i).getPoints()>top4){
                top4=sList.get(i).getPoints();
                pl4 = sList.get(i);
            }
        }
        psl.add(pl1);
        psl.add(pl2);
        psl.add(pl3);
        psl.add(pl4);
        return psl;
    }

    public ArrayList<PlayerStats> getTopAssists(){
        ArrayList<PlayerStats> psl = new ArrayList<>();
        PlayerStats temp = new PlayerStats(99999,0,0,0,9999);
        int top1=0;
        PlayerStats pl1=temp;
        int top2=0;
        PlayerStats pl2=temp;
        int top3=0;
        PlayerStats pl3=temp;
        int top4=0;
        PlayerStats pl4=temp;
        for(int i=0;i<sList.size();i++){
            if(sList.get(i).getAssists()>top1){
                top4=pl3.getAssists();
                pl4 = pl3;
                top3=pl2.getAssists();
                pl3 = pl2;
                top2=pl1.getAssists();
                pl2 = pl1;
                top1=sList.get(i).getAssists();
                pl1 = sList.get(i);
            }else if(sList.get(i).getAssists()>top2){
                top4=pl3.getAssists();
                pl4 = pl3;
                top3=pl2.getAssists();
                pl3 = pl2;
                top2=sList.get(i).getAssists();
                pl2 = sList.get(i);
            }else if(sList.get(i).getAssists()>top3){
                top4=pl3.getAssists();
                pl4 = pl3;
                top3=sList.get(i).getAssists();
                pl3 = sList.get(i);
            }else if(sList.get(i).getAssists()>top4){
                top4=sList.get(i).getAssists();
                pl4 = sList.get(i);
            }
        }
        psl.add(pl1);
        psl.add(pl2);
        psl.add(pl3);
        psl.add(pl4);
        return psl;
    }

    public ArrayList<PlayerStats> getTopRebounds(){
        ArrayList<PlayerStats> psl = new ArrayList<>();
        PlayerStats temp = new PlayerStats(99999,0,0,0,9999);
        int top1=0;
        PlayerStats pl1=temp;
        int top2=0;
        PlayerStats pl2=temp;
        int top3=0;
        PlayerStats pl3=temp;
        int top4=0;
        PlayerStats pl4=temp;
        for(int i=0;i<sList.size();i++){
            if(sList.get(i).getRebounds()>top1){
                top4=pl3.getRebounds();
                pl4 = pl3;
                top3=pl2.getRebounds();
                pl3 = pl2;
                top2=pl1.getRebounds();
                pl2 = pl1;
                top1=sList.get(i).getRebounds();
                pl1 = sList.get(i);
            }else if(sList.get(i).getRebounds()>top2){
                top4=pl3.getRebounds();
                pl4 = pl3;
                top3=pl2.getRebounds();
                pl3 = pl2;
                top2=sList.get(i).getRebounds();
                pl2 = sList.get(i);
            }else if(sList.get(i).getRebounds()>top3){
                top4=pl3.getRebounds();
                pl4 = pl3;
                top3=sList.get(i).getRebounds();
                pl3 = sList.get(i);
            }else if(sList.get(i).getRebounds()>top4){
                top4=sList.get(i).getRebounds();
                pl4 = sList.get(i);
            }
        }
        psl.add(pl1);
        psl.add(pl2);
        psl.add(pl3);
        psl.add(pl4);
        return psl;
    }
}

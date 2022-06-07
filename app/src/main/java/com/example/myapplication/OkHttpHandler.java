package com.example.myapplication;

import android.os.StrictMode;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpHandler {

    public OkHttpHandler() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    //Epistrefei ArrayList me oles tiw omades ths bashs
    ArrayList<Team> getTeams(String url) throws Exception {
        ArrayList<Team> tList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        System.out.println("My Response: " + data);
        try {
            JSONObject json = new JSONObject(data);
            Iterator<String> keys = json.keys();
            while(keys.hasNext()) {
                String team = keys.next();
                String name = json.getJSONObject(team).getString("name").toString();
                String logo = json.getJSONObject(team).getString("logo").toString();
                String wins = json.getJSONObject(team).getString("wins").toString();
                String losses = json.getJSONObject(team).getString("losses").toString();
                String matches = json.getJSONObject(team).getString("matches").toString();
                String points = json.getJSONObject(team).getString("points").toString();
                tList.add(new Team(team, name, logo, wins, losses, matches, points));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return tList;
    }

    //Epistrefei ArrayList me oles tous agwnes ths bashs
    ArrayList<Match> getMatches(String url) throws Exception {
        ArrayList<Match> mList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        System.out.println("My Response: " + data);
        try {
            JSONObject json = new JSONObject(data);
            Iterator<String> keys = json.keys();
            while(keys.hasNext()) {
                String match = keys.next();
                String home_team = json.getJSONObject(match).getString("home_team").toString();
                String away_team = json.getJSONObject(match).getString("away_team").toString();
                String round = json.getJSONObject(match).getString("round").toString();
                String home_score = json.getJSONObject(match).getString("home_score").toString();
                String away_score = json.getJSONObject(match).getString("away_score").toString();
                String q1_home_score = json.getJSONObject(match).getString("q1_home_score").toString();
                String q1_away_score = json.getJSONObject(match).getString("q1_away_score").toString();
                String q2_home_score = json.getJSONObject(match).getString("q2_home_score").toString();
                String q2_away_score = json.getJSONObject(match).getString("q2_away_score").toString();
                String q3_home_score = json.getJSONObject(match).getString("q3_home_score").toString();
                String q3_away_score = json.getJSONObject(match).getString("q3_away_score").toString();
                String q4_home_score = json.getJSONObject(match).getString("q4_home_score").toString();
                String q4_away_score = json.getJSONObject(match).getString("q4_away_score").toString();
                mList.add(new Match(match,home_team,away_team,round,home_score,away_score,q1_home_score,q1_away_score,q2_home_score,q2_away_score,q3_home_score,q3_away_score,q4_home_score,q4_away_score));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return mList;
    }

    //Epistrefei ArrayList me oles ta statistika ths bashs
    ArrayList<MatchStats> getStats(String url) throws Exception {
        ArrayList<MatchStats> mList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        System.out.println("My Response: " + data);
        try {
            JSONObject json = new JSONObject(data);
            Iterator<String> keys = json.keys();
            while(keys.hasNext()) {
                String match = keys.next();
                String match_id = json.getJSONObject(match).getString("match_id").toString();
                String team_id = json.getJSONObject(match).getString("team_id").toString();
                String free_throws = json.getJSONObject(match).getString("free_throws").toString();
                String lost_free_throws = json.getJSONObject(match).getString("lost_free_throws").toString();
                String two_pointers = json.getJSONObject(match).getString("two_pointers").toString();
                String lost_two_pointers = json.getJSONObject(match).getString("lost_two_pointers").toString();
                String three_pointers = json.getJSONObject(match).getString("three_pointers").toString();
                String lost_three_pointers = json.getJSONObject(match).getString("lost_three_pointers").toString();
                String field_goals = json.getJSONObject(match).getString("field_goals").toString();
                String lost_field_goals = json.getJSONObject(match).getString("lost_field_goals").toString();
                String rebounds = json.getJSONObject(match).getString("rebounds").toString();
                String defensive_rebounds = json.getJSONObject(match).getString("defensive_rebounds").toString();
                String offensive_rebounds = json.getJSONObject(match).getString("offensive_rebounds").toString();
                String assists = json.getJSONObject(match).getString("assists").toString();
                String turnovers = json.getJSONObject(match).getString("turnovers").toString();
                String steals = json.getJSONObject(match).getString("steals").toString();
                String blocks = json.getJSONObject(match).getString("blocks").toString();
                String fouls = json.getJSONObject(match).getString("fouls").toString();
                String timeouts = json.getJSONObject(match).getString("timeouts").toString();
                mList.add(new MatchStats(match_id,team_id,free_throws,lost_free_throws,two_pointers,lost_two_pointers,three_pointers,lost_three_pointers,field_goals,lost_field_goals,rebounds,defensive_rebounds,offensive_rebounds,assists,turnovers,steals,blocks,fouls,timeouts,match));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return mList;
    }

    //Epistrefei ArrayList me ola ta statistika ths xronias twn paiktwn
    ArrayList<PlayerStats> getPersonalSum(String url) throws Exception {
        ArrayList<PlayerStats> sList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        System.out.println("My Response: " + data);
        try {
            JSONObject json = new JSONObject(data);
            Iterator<String> keys = json.keys();
            while(keys.hasNext()) {
                String id = keys.next();
                String player_id = json.getJSONObject(id).getString("player_id").toString();
                String points = json.getJSONObject(id).getString("points").toString();
                String rebounds = json.getJSONObject(id).getString("rebounds").toString();
                String assists = json.getJSONObject(id).getString("assists").toString();
                sList.add(new PlayerStats(player_id,points,rebounds,assists,id));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return sList;
    }

    //Epistrefei ArrayList me olous tous paiktes
    ArrayList<Player> getPlayers(String url) throws Exception {
        ArrayList<Player> pList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        System.out.println("My Response: " + data);
        try {
            JSONObject json = new JSONObject(data);
            Iterator<String> keys = json.keys();
            while(keys.hasNext()) {
                String id = keys.next();
                String name = json.getJSONObject(id).getString("name").toString();
                String position = json.getJSONObject(id).getString("position").toString();
                String team_id = json.getJSONObject(id).getString("team_id").toString();
                pList.add(new Player(id,name,position,team_id));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return pList;
    }

    //Epistrefei ArrayList me olous tous admins
    ArrayList<Admin> getAdmins(String url) throws Exception {
        ArrayList<Admin> aList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        System.out.println("My Response: " + data);
        try {
            JSONObject json = new JSONObject(data);
            Iterator<String> keys = json.keys();
            while(keys.hasNext()) {
                String id = keys.next();
                String username = json.getJSONObject(id).getString("username").toString();
                String password = json.getJSONObject(id).getString("password").toString();
                aList.add(new Admin(id,username,password));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return aList;
    }

    //Epistrefei ArrayList me oles tous  live agwnes ths bashs
    ArrayList<LiveMatch> getLiveMatches(String url) throws Exception {
        ArrayList<LiveMatch> mList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType,"");
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        System.out.println("My Live Match Response: " + data);
        try {
            JSONObject json = new JSONObject(data);
            Iterator<String> keys = json.keys();
            while(keys.hasNext()) {
                String match = keys.next();
                String home_starter1 = json.getJSONObject(match).getString("hometeam_starter1").toString();
                String home_starter2 = json.getJSONObject(match).getString("hometeam_starter2").toString();
                String home_starter3 = json.getJSONObject(match).getString("hometeam_starter3").toString();
                String home_starter4 = json.getJSONObject(match).getString("hometeam_starter4").toString();
                String home_starter5 = json.getJSONObject(match).getString("hometeam_starter5").toString();

                String awayteam_starter1 = json.getJSONObject(match).getString("awayteam_starter1").toString();
                String awayteam_starter2 = json.getJSONObject(match).getString("awayteam_starter2").toString();
                String awayteam_starter3 = json.getJSONObject(match).getString("awayteam_starter3").toString();
                String awayteam_starter4 = json.getJSONObject(match).getString("awayteam_starter4").toString();
                String awayteam_starter5 = json.getJSONObject(match).getString("awayteam_starter5").toString();

                String hometeam_changer1 = json.getJSONObject(match).getString("hometeam_changer1").toString();
                String hometeam_changer2 = json.getJSONObject(match).getString("hometeam_changer2").toString();
                String hometeam_changer3 = json.getJSONObject(match).getString("hometeam_changer3").toString();



                String awayteam_changer1 = json.getJSONObject(match).getString("awayteam_changer1").toString();
                String awayteam_changer2 = json.getJSONObject(match).getString("awayteam_changer2").toString();
                String awayteam_changer3 = json.getJSONObject(match).getString("awayteam_changer3").toString();



                mList.add(new LiveMatch(match,home_starter1,home_starter2,home_starter3,home_starter4,home_starter5,
                        awayteam_starter1,awayteam_starter2,awayteam_starter3,awayteam_starter4,awayteam_starter5,
                        hometeam_changer1,hometeam_changer2,hometeam_changer3,
                        awayteam_changer1,awayteam_changer2,awayteam_changer3,
                        "0","0","0","0",
                        "0","0","0","0"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return mList;
    }


    //Epistrefei ArrayList me oles ta statistika overall omadwn ths bashs
    ArrayList<TeamOverallStats> getTeamOverallStats(String url) throws Exception {
        ArrayList<TeamOverallStats> mList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .build();
        Response response = client.newCall(request).execute();
        String data = response.body().string();
        System.out.println("My Response: " + data);
        try {
            JSONObject json = new JSONObject(data);
            Iterator<String> keys = json.keys();
            while(keys.hasNext()) {
                String team = keys.next();
                String team_id = json.getJSONObject(team).getString("team_id").toString();
                String rebounds = json.getJSONObject(team).getString("rebounds").toString();
                String turnovers = json.getJSONObject(team).getString("turnovers").toString();
                String steals = json.getJSONObject(team).getString("steals").toString();
                String fouls = json.getJSONObject(team).getString("fouls").toString();
                mList.add(new TeamOverallStats(team_id,rebounds,steals,turnovers,fouls,team));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return mList;
    }

    public void UpdateLineUp(String url) throws Exception {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        RequestBody body = RequestBody.create("", MediaType.parse("text/plain"));
        Request request = new Request.Builder().url(url).method("POST", body).build();
        Response response = client.newCall(request).execute();
        System.out.println("My Response: " + response);
    }

}

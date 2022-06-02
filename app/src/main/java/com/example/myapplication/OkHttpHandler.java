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

    /**
     * Changed this method to also parse image urls
     * Warning! URLs should not contain commas!
     * */
    ArrayList<Team> getTeams(String url) throws Exception {
        ArrayList<Team> tList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("http://192.168.1.2/getTeams.php")
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

    ArrayList<Match> getMatches(String url) throws Exception {
        ArrayList<Match> mList = new ArrayList<>();
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("http://192.168.1.2/getMatches.php")
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


}

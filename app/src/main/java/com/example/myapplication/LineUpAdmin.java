package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class LineUpAdmin extends AppCompatActivity {
    private TeamsList teaml;
    private MatchesList matchl;
    private LiveMatchesList livematchl;
    private PlayersList Playerl;
    private String SelectedMatchIDl;
    private String myIP;
    private RadioGroup rg1;
    private RadioGroup rg2;
    private boolean Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();
        SelectedMatchIDl = intent.getStringExtra("ID");
        myIP = intent.getStringExtra("myIP");
        try {
            Playerl = new PlayersList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }

        //Dhmiourgia listas olwn twn omadwn
        try {
            teaml = new TeamsList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }

        //Dhmiourgia listas olwn twn agwnwn
        matchl = new MatchesList(myIP);

        //Dhmiourgia listas live agwnwn
        try {
            livematchl = new LiveMatchesList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_up_admin);

        Match SelectedMatch = matchl.findMatch(Integer.parseInt(SelectedMatchIDl));
        Team HomeTeam = teaml.findTeam(SelectedMatch.getHome_id());
        Team AwayTeam = teaml.findTeam(SelectedMatch.getAway_id());

        TextView HomeTeamtxt = (TextView) findViewById(R.id.textView33);
        TextView AwayTeamtxt = (TextView) findViewById(R.id.textView36);
        TextView CHANGEShometitle = (TextView) findViewById(R.id.textView34);
        TextView CHANGESawaytitle = (TextView) findViewById(R.id.textView35);
        CHANGEShometitle.setText("ΑΛΛΑΓΕΣ ");
        CHANGESawaytitle.setText("ΑΛΛΑΓΕΣ ");
        HomeTeamtxt.setText(HomeTeam.getName());
        AwayTeamtxt.setText(AwayTeam.getName());


        LiveMatch SelectedLiveMatch = livematchl.findMatch(Integer.parseInt(SelectedMatchIDl));
        Player Home_Starter_1 = Playerl.findPlayer(SelectedLiveMatch.getHometeam_starter1());
        Player Home_Starter_2 = Playerl.findPlayer(SelectedLiveMatch.getHometeam_starter2());
        Player Home_Starter_3 = Playerl.findPlayer(SelectedLiveMatch.getHometeam_starter3());
        Player Home_Starter_4 = Playerl.findPlayer(SelectedLiveMatch.getHometeam_starter4());
        Player Home_Starter_5 = Playerl.findPlayer(SelectedLiveMatch.getHometeam_starter5());


        Player Home_changer1 = Playerl.findPlayer(SelectedLiveMatch.getHometeam_changer1());
        Player Home_changer2 = Playerl.findPlayer(SelectedLiveMatch.getHometeam_changer2());
        Player Home_changer3 = Playerl.findPlayer(SelectedLiveMatch.getHometeam_changer3());



        Player Away_Starter_1 = Playerl.findPlayer(SelectedLiveMatch.getAwayteam_starter1());
        Player Away_Starter_2 = Playerl.findPlayer(SelectedLiveMatch.getAwayteam_starter2());
        Player Away_Starter_3 = Playerl.findPlayer(SelectedLiveMatch.getAwayteam_starter3());
        Player Away_Starter_4 = Playerl.findPlayer(SelectedLiveMatch.getAwayteam_starter4());
        Player Away_Starter_5 = Playerl.findPlayer(SelectedLiveMatch.getAwayteam_starter5());


        Player Away_changer_1 = Playerl.findPlayer(SelectedLiveMatch.getAwayteam_changer1());
        Player Away_changer_2 = Playerl.findPlayer(SelectedLiveMatch.getAwayteam_changer2());
        Player Away_changer_3 = Playerl.findPlayer(SelectedLiveMatch.getAwayteam_changer3());


        TextView Home_Starter_1txt = (TextView) findViewById(R.id.textView11);
        Home_Starter_1txt.setText(Home_Starter_1.getName());
        TextView Home_Starter_2txt = (TextView) findViewById(R.id.textView12);
        Home_Starter_2txt.setText(Home_Starter_2.getName());
        TextView Home_Starter_3txt = (TextView) findViewById(R.id.textView16);
        Home_Starter_3txt.setText(Home_Starter_3.getName());
        TextView Home_Starter_4txt = (TextView) findViewById(R.id.textView20);
        Home_Starter_4txt.setText(Home_Starter_4.getName());
        TextView Home_Starter_5txt = (TextView) findViewById(R.id.textView24);
        Home_Starter_5txt.setText(Home_Starter_5.getName());

        TextView Home_changer1txt = (TextView) findViewById(R.id.textView10);
        Home_changer1txt.setText(Home_changer1.getName());
        TextView Home_changer2txt = (TextView) findViewById(R.id.textView13);
        Home_changer2txt.setText(Home_changer2.getName());
        TextView Home_changer3txt = (TextView) findViewById(R.id.textView17);
        Home_changer3txt.setText(Home_changer3.getName());
        TextView Home_changer4txt = (TextView) findViewById(R.id.textView21);
        TextView Home_changer5txt = (TextView) findViewById(R.id.textView25);
        Home_changer4txt.setText("-");
        Home_changer5txt.setText("-");

        TextView Away_Starter_1txt = (TextView) findViewById(R.id.textView8);
        Away_Starter_1txt.setText(Away_Starter_1.getName());
        TextView Away_Starter_2txt = (TextView) findViewById(R.id.textView15);
        Away_Starter_2txt.setText(Away_Starter_2.getName());
        TextView Away_Starter_3txt = (TextView) findViewById(R.id.textView19);
        Away_Starter_3txt.setText(Away_Starter_3.getName());
        TextView Away_Starter_4txt = (TextView) findViewById(R.id.textView23);
        Away_Starter_4txt.setText(Away_Starter_4.getName());
        TextView Away_Starter_5txt = (TextView) findViewById(R.id.textView27);
        Away_Starter_5txt.setText(Away_Starter_5.getName());

        TextView Away_changer_1txt = (TextView) findViewById(R.id.textView9);
        Away_changer_1txt.setText(Away_changer_1.getName());
        TextView Away_changer_2txt = (TextView) findViewById(R.id.textView14);
        Away_changer_2txt.setText(Away_changer_2.getName());
        TextView Away_changer_3txt = (TextView) findViewById(R.id.textView18);
        Away_changer_3txt.setText(Away_changer_3.getName());
        TextView Away_changer_4txt = (TextView) findViewById(R.id.textView22);
        Away_changer_4txt.setText("-");
        TextView Away_changer_5txt = (TextView) findViewById(R.id.textView26);
        Away_changer_5txt.setText("-");


        Spinner Teams_Chooser = (Spinner) findViewById(R.id.spinner2);
        List<String> Teams_Match =  new ArrayList<String>();
        Teams_Match.add(HomeTeam.getName());
        Teams_Match.add(AwayTeam.getName());
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Teams_Match);
        Teams_Chooser.setAdapter(arrayAdapter);

        String Teamsel = (String) Teams_Chooser.getSelectedItem();
        Button SelectTeam = (Button) findViewById(R.id.button6);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rg2 = (RadioGroup) findViewById(R.id.rg2);
        Button ChangeBtn = (Button) findViewById(R.id.button);

    }


    public void  OnClick(View v){

        Match SelectedMatch = matchl.findMatch(Integer.parseInt(SelectedMatchIDl));
        Team HomeTeam = teaml.findTeam(SelectedMatch.getHome_id());
        Team AwayTeam = teaml.findTeam(SelectedMatch.getAway_id());

        TextView HomeTeamtxt = (TextView) findViewById(R.id.textView33);
        TextView AwayTeamtxt = (TextView) findViewById(R.id.textView36);
        TextView CHANGEShometitle = (TextView) findViewById(R.id.textView34);
        TextView CHANGESawaytitle = (TextView) findViewById(R.id.textView35);

        CHANGEShometitle.setText("ΑΛΛΑΓΕΣ ");
        CHANGESawaytitle.setText("ΑΛΛΑΓΕΣ ");

        HomeTeamtxt.setText(HomeTeam.getName());
        AwayTeamtxt.setText(AwayTeam.getName());

        LiveMatch SelectedLiveMatch = livematchl.findMatch(Integer.parseInt(SelectedMatchIDl));

        Spinner Teams_Chooser = (Spinner) findViewById(R.id.spinner2);

        String Teamsel = (String) Teams_Chooser.getSelectedItem();

        Button SelectTeam = (Button) findViewById(R.id.button6);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rg2 = (RadioGroup) findViewById(R.id.rg2);
        Button ChangeBtn = (Button) findViewById(R.id.button);
        RadioButton rbc3 = (RadioButton) findViewById(R.id.radioButton11);
        RadioButton rbc2 = (RadioButton) findViewById(R.id.radioButton12);
        RadioButton rbc1 = (RadioButton) findViewById(R.id.radioButton13);


        RadioButton rbs1 = (RadioButton) findViewById(R.id.radioButton14);
        RadioButton rbs2 = (RadioButton) findViewById(R.id.radioButton15);
        RadioButton rbs3 = (RadioButton) findViewById(R.id.radioButton16);
        RadioButton rbs4 = (RadioButton) findViewById(R.id.radioButton17);
        RadioButton rbs5 = (RadioButton) findViewById(R.id.radioButton18);

        if(Teamsel == HomeTeam.getName()){
            Home = true;
            rbs1.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getHometeam_starter1()).getName());
            rbs2.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getHometeam_starter2()).getName());
            rbs3.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getHometeam_starter3()).getName());
            rbs4.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getHometeam_starter4()).getName());
            rbs5.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getHometeam_starter5()).getName());

            rbc1.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getHometeam_changer1()).getName());
            rbc2.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getHometeam_changer2()).getName());
            rbc3.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getHometeam_changer3()).getName());

            rg1.setVisibility(View.VISIBLE);
            rg2.setVisibility(View.VISIBLE);
            ChangeBtn.setVisibility(View.VISIBLE);

        }
        else if(Teamsel == AwayTeam.getName()){
            Home = false;
            rbs1.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getAwayteam_starter1()).getName());
            rbs2.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getAwayteam_starter2()).getName());
            rbs3.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getAwayteam_starter3()).getName());
            rbs4.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getAwayteam_starter4()).getName());
            rbs5.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getAwayteam_starter5()).getName());

            rbc1.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getAwayteam_changer1()).getName());
            rbc2.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getAwayteam_changer2()).getName());
            rbc3.setText(Playerl.findPlayer(livematchl.findMatch(Integer.parseInt(SelectedMatchIDl)).getAwayteam_changer3()).getName());

            rg1.setVisibility(View.VISIBLE);
            rg2.setVisibility(View.VISIBLE);
            ChangeBtn.setVisibility(View.VISIBLE);


        }
    }


    public void  OnClickChange(View v) {
        Match SelectedMatch = matchl.findMatch(Integer.parseInt(SelectedMatchIDl));
        LiveMatch SelectedLiveMatch = livematchl.findMatch(Integer.parseInt(SelectedMatchIDl));
        Team HomeTeam = teaml.findTeam(SelectedMatch.getHome_id());
        Team AwayTeam = teaml.findTeam(SelectedMatch.getAway_id());

        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rg2 = (RadioGroup) findViewById(R.id.rg2);
        Button ChangeBtn = (Button) findViewById(R.id.button);
        RadioButton rbc1 = (RadioButton) findViewById(R.id.radioButton13);
        RadioButton rbc2 = (RadioButton) findViewById(R.id.radioButton12);
        RadioButton rbc3 = (RadioButton) findViewById(R.id.radioButton11);


        RadioButton rbs1 = (RadioButton) findViewById(R.id.radioButton14);
        RadioButton rbs2 = (RadioButton) findViewById(R.id.radioButton15);
        RadioButton rbs3 = (RadioButton) findViewById(R.id.radioButton16);
        RadioButton rbs4 = (RadioButton) findViewById(R.id.radioButton17);
        RadioButton rbs5 = (RadioButton) findViewById(R.id.radioButton18);

        if(rbs1.isChecked() && rbc1.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter1();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer1();
                String StarterCulumn = "hometeam_starter1";
                String ChangerColumn = "hometeam_changer1";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter1();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer1();
                String StarterCulumn = "awayteam_starter1";
                String ChangerColumn = "awayteam_changer1";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs1.isChecked() && rbc2.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter1();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer2();
                String StarterCulumn = "hometeam_starter1";
                String ChangerColumn = "hometeam_changer2";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter1();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer2();
                String StarterCulumn = "awayteam_starter1";
                String ChangerColumn = "awayteam_changer2";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs1.isChecked() && rbc3.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter1();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer3();
                String StarterCulumn = "hometeam_starter1";
                String ChangerColumn = "hometeam_changer3";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter1();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer3();
                String StarterCulumn = "awayteam_starter1";
                String ChangerColumn = "awayteam_changer3";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs2.isChecked() && rbc1.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter2();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer1();
                String StarterCulumn = "hometeam_starter2";
                String ChangerColumn = "hometeam_changer1";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter2();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer1();
                String StarterCulumn = "awayteam_starter2";
                String ChangerColumn = "awayteam_changer1";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs2.isChecked() && rbc2.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter2();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer2();
                String StarterCulumn = "hometeam_starter2";
                String ChangerColumn = "hometeam_changer2";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter2();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer2();
                String StarterCulumn = "awayteam_starter2";
                String ChangerColumn = "awayteam_changer2";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs2.isChecked() && rbc3.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter2();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer3();
                String StarterCulumn = "hometeam_starter2";
                String ChangerColumn = "hometeam_changer3";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter2();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer3();
                String StarterCulumn = "awayteam_starter2";
                String ChangerColumn = "awayteam_changer3";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs3.isChecked() && rbc1.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter3();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer1();
                String StarterCulumn = "hometeam_starter3";
                String ChangerColumn = "hometeam_changer1";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter3();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer1();
                String StarterCulumn = "awayteam_starter3";
                String ChangerColumn = "awayteam_changer1";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs3.isChecked() && rbc2.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter3();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer2();
                String StarterCulumn = "hometeam_starter3";
                String ChangerColumn = "hometeam_changer2";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter3();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer2();
                String StarterCulumn = "awayteam_starter3";
                String ChangerColumn = "awayteam_changer2";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs3.isChecked() && rbc3.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter3();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer3();
                String StarterCulumn = "hometeam_starter3";
                String ChangerColumn = "hometeam_changer3";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter3();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer3();
                String StarterCulumn = "awayteam_starter3";
                String ChangerColumn = "awayteam_changer3";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs4.isChecked() && rbc1.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter4();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer1();
                String StarterCulumn = "hometeam_starter4";
                String ChangerColumn = "hometeam_changer1";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter4();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer1();
                String StarterCulumn = "awayteam_starter4";
                String ChangerColumn = "awayteam_changer1";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs4.isChecked() && rbc2.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter4();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer2();
                String StarterCulumn = "hometeam_starter4";
                String ChangerColumn = "hometeam_changer2";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter4();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer2();
                String StarterCulumn = "awayteam_starter4";
                String ChangerColumn = "awayteam_changer2";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs4.isChecked() && rbc3.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter4();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer3();
                String StarterCulumn = "hometeam_starter4";
                String ChangerColumn = "hometeam_changer3";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter4();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer3();
                String StarterCulumn = "awayteam_starter4";
                String ChangerColumn = "awayteam_changer3";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs5.isChecked() && rbc1.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter5();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer1();
                String StarterCulumn = "hometeam_starter5";
                String ChangerColumn = "hometeam_changer1";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter5();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer1();
                String StarterCulumn = "awayteam_starter5";
                String ChangerColumn = "awayteam_changer1";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs5.isChecked() && rbc2.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter5();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer2();
                String StarterCulumn = "hometeam_starter5";
                String ChangerColumn = "hometeam_changer2";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter5();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer2();
                String StarterCulumn = "awayteam_starter5";
                String ChangerColumn = "awayteam_changer2";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else if(rbs5.isChecked() && rbc3.isChecked()){
            if(Home){
                int MyStarterID = SelectedLiveMatch.getHometeam_starter5();
                int MyChangerID = SelectedLiveMatch.getHometeam_changer3();
                String StarterCulumn = "hometeam_starter5";
                String ChangerColumn = "hometeam_changer3";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            else{
                int MyStarterID = SelectedLiveMatch.getAwayteam_starter5();
                int MyChangerID = SelectedLiveMatch.getAwayteam_changer3();
                String StarterCulumn = "awayteam_starter5";
                String ChangerColumn = "awayteam_changer3";
                String url = "http://"+myIP+"/updatedata.php?Strclm="+ StarterCulumn + "&Chgclm=" + ChangerColumn +"&StrID="+MyStarterID+"&ChgID="+MyChangerID+"&MatchID="+SelectedLiveMatch.getId();
                try {
                    OkHttpHandler okHttpHandler = new OkHttpHandler();
                    okHttpHandler.UpdateLineUp(url);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        recreate();

    }

    public void restartActivity()
    {
        Intent intent= new Intent(this, LineUpAdmin.class);
        startActivity(intent);
    }


    public void sendLOginMatch(View view){
        Intent myIntent = new Intent(LineUpAdmin.this, MainActivity.class);
        startActivity(myIntent);
    }


}
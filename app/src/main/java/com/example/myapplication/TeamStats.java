package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TeamStats extends AppCompatActivity {
    private String myIP;
    private TeamsList tml;
    private TeamsOverallStatsLists  TeamsOverallStatsLists;
    private MatchesList mal;
    private MatchStatsList stl;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        //myid = to id tou agwna pou pairnoume apo prohgoumeno activity
        Intent intent = getIntent();
        String myid = intent.getStringExtra("ID");
        myIP = intent.getStringExtra("myIP");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_stats);


        //Dhmiourgia listas olwn twn omadwn
        try {
            tml = new TeamsList(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            TeamsOverallStatsLists = new TeamsOverallStatsLists(myIP);
        } catch (Exception e){
            e.printStackTrace();
        }


        TextView  Omada1 = (TextView) findViewById(R.id.textView136);
        Omada1.setText(tml.findTeam(TeamsOverallStatsLists.FindTeamsStat(1).getTeam_id()).getName());
        TextView  Omada2 = (TextView) findViewById(R.id.textView141);
        Omada2.setText(tml.findTeam(TeamsOverallStatsLists.FindTeamsStat(2).getTeam_id()).getName());
        TextView  Omada3 = (TextView) findViewById(R.id.textView147);
        Omada3.setText(tml.findTeam(TeamsOverallStatsLists.FindTeamsStat(3).getTeam_id()).getName());
        TextView  Omada4 = (TextView) findViewById(R.id.textView152);
        Omada4.setText(tml.findTeam(TeamsOverallStatsLists.FindTeamsStat(4).getTeam_id()).getName());
        TextView  Omada5 = (TextView) findViewById(R.id.textView158);
        Omada5.setText(tml.findTeam(TeamsOverallStatsLists.FindTeamsStat(5).getTeam_id()).getName());
        TextView  Omada6 = (TextView) findViewById(R.id.textView163);
        Omada6.setText(tml.findTeam(TeamsOverallStatsLists.FindTeamsStat(6).getTeam_id()).getName());
        TextView  Omada7 = (TextView) findViewById(R.id.textView168);
        Omada7.setText(tml.findTeam(TeamsOverallStatsLists.FindTeamsStat(7).getTeam_id()).getName());
        TextView  Omada8 = (TextView) findViewById(R.id.textView173);
        Omada8.setText(tml.findTeam(TeamsOverallStatsLists.FindTeamsStat(8).getTeam_id()).getName());
        TextView  Omada9 = (TextView) findViewById(R.id.textView178);
        Omada9.setText(tml.findTeam(TeamsOverallStatsLists.FindTeamsStat(9).getTeam_id()).getName());
        TextView  Omada10 = (TextView) findViewById(R.id.textView183);
        Omada10.setText(tml.findTeam(TeamsOverallStatsLists.FindTeamsStat(10).getTeam_id()).getName());
        TextView  Omada11 = (TextView) findViewById(R.id.textView129);
        Omada11.setText(tml.findTeam(TeamsOverallStatsLists.FindTeamsStat(11).getTeam_id()).getName());
        TextView  Omada12 = (TextView) findViewById(R.id.textView192);
        Omada12.setText(tml.findTeam(TeamsOverallStatsLists.FindTeamsStat(12).getTeam_id()).getName());
        TextView  Omada13 = (TextView) findViewById(R.id.textView197);
        Omada13.setText(tml.findTeam(TeamsOverallStatsLists.FindTeamsStat(13).getTeam_id()).getName());

        TextView  rebount1 = (TextView) findViewById(R.id.textView137);
        rebount1.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(1).getRebounds()));
        TextView  rebount2 = (TextView) findViewById(R.id.textView142);
        rebount2.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(2).getRebounds()));
        TextView  rebount3 = (TextView) findViewById(R.id.textView148);
        rebount3.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(3).getRebounds()));
        TextView  rebount4 = (TextView) findViewById(R.id.textView153);
        rebount4.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(4).getRebounds()));
        TextView  rebount5 = (TextView) findViewById(R.id.textView159);
        rebount5.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(5).getRebounds()));
        TextView  rebount6 = (TextView) findViewById(R.id.textView164);
        rebount6.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(6).getRebounds()));
        TextView  rebount7 = (TextView) findViewById(R.id.textView169);
        rebount7.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(7).getRebounds()));
        TextView  rebount8 = (TextView) findViewById(R.id.textView174);
        rebount8.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(8).getRebounds()));
        TextView  rebount9 = (TextView) findViewById(R.id.textView179);
        rebount9.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(9).getRebounds()));
        TextView  rebount10 = (TextView) findViewById(R.id.textView184);
        rebount10.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(10).getRebounds()));
        TextView  rebount11 = (TextView) findViewById(R.id.textView188);
        rebount11.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(11).getRebounds()));
        TextView  rebount12 = (TextView) findViewById(R.id.textView193);
        rebount12.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(12).getRebounds()));
        TextView  rebount13 = (TextView) findViewById(R.id.textView198);
        rebount13.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(13).getRebounds()));


        TextView  steal1 = (TextView) findViewById(R.id.textView138);
        steal1.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(1).getSteals()));
        TextView  steal2 = (TextView) findViewById(R.id.textView143);
        steal2.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(2).getSteals()));
        TextView  steal3 = (TextView) findViewById(R.id.textView149);
        steal3.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(3).getSteals()));
        TextView  steal4 = (TextView) findViewById(R.id.textView154);
        steal4.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(4).getSteals()));
        TextView  steal5 = (TextView) findViewById(R.id.textView160);
        steal5.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(5).getSteals()));
        TextView  steal6 = (TextView) findViewById(R.id.textView165);
        steal6.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(6).getSteals()));
        TextView  steal7 = (TextView) findViewById(R.id.textView170);
        steal7.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(7).getSteals()));
        TextView  steal8 = (TextView) findViewById(R.id.textView175);
        steal8.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(8).getSteals()));
        TextView  steal9 = (TextView) findViewById(R.id.textView180);
        steal9.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(9).getSteals()));
        TextView  steal10 = (TextView) findViewById(R.id.textView185);
        steal10.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(10).getSteals()));
        TextView  steal11 = (TextView) findViewById(R.id.textView189);
        steal11.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(11).getSteals()));
        TextView  steal12 = (TextView) findViewById(R.id.textView194);
        steal12.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(12).getSteals()));
        TextView  steal13 = (TextView) findViewById(R.id.textView200);
        steal13.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(13).getSteals()));


        TextView  faults1 = (TextView) findViewById(R.id.textView139);
        faults1.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(1).getTurnovers()));
        TextView  faults2 = (TextView) findViewById(R.id.textView145);
        faults2.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(2).getTurnovers()));
        TextView  faults3 = (TextView) findViewById(R.id.textView150);
        faults3.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(3).getTurnovers()));
        TextView  faults4 = (TextView) findViewById(R.id.textView156);
        faults4.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(4).getTurnovers()));
        TextView  faults5 = (TextView) findViewById(R.id.textView161);
        faults5.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(5).getTurnovers()));
        TextView  faults6 = (TextView) findViewById(R.id.textView166);
        faults6.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(6).getTurnovers()));
        TextView  faults7 = (TextView) findViewById(R.id.textView171);
        faults7.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(7).getTurnovers()));
        TextView  faults8 = (TextView) findViewById(R.id.textView176);
        faults8.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(8).getTurnovers()));
        TextView  faults9 = (TextView) findViewById(R.id.textView181);
        faults9.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(9).getTurnovers()));
        TextView  faults10 = (TextView) findViewById(R.id.textView186);
        faults10.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(10).getTurnovers()));
        TextView  faults11 = (TextView) findViewById(R.id.textView190);
        faults11.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(11).getTurnovers()));
        TextView  faults12 = (TextView) findViewById(R.id.textView195);
        faults12.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(12).getTurnovers()));
        TextView  faults13 = (TextView) findViewById(R.id.textView199);
        faults13.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(13).getTurnovers()));


        TextView  fouls1 = (TextView) findViewById(R.id.textView140);
        fouls1.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(1).getFouls()));
        TextView  fouls2 = (TextView) findViewById(R.id.textView146);
        fouls2.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(2).getFouls()));
        TextView  fouls3 = (TextView) findViewById(R.id.textView151);
        fouls3.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(3).getFouls()));
        TextView  fouls4 = (TextView) findViewById(R.id.textView157);
        fouls4.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(4).getFouls()));
        TextView  fouls5 = (TextView) findViewById(R.id.textView162);
        fouls5.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(5).getFouls()));
        TextView  fouls6 = (TextView) findViewById(R.id.textView167);
        fouls6.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(6).getFouls()));
        TextView  fouls7 = (TextView) findViewById(R.id.textView172);
        fouls7.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(7).getFouls()));
        TextView  fouls8 = (TextView) findViewById(R.id.textView177);
        fouls8.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(8).getFouls()));
        TextView  fouls9 = (TextView) findViewById(R.id.textView182);
        fouls9.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(9).getFouls()));
        TextView  fouls10 = (TextView) findViewById(R.id.textView187);
        fouls10.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(10).getFouls()));
        TextView  fouls11 = (TextView) findViewById(R.id.textView191);
        fouls11.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(11).getFouls()));
        TextView  fouls12 = (TextView) findViewById(R.id.textView196);
        fouls12.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(12).getFouls()));
        TextView  fouls13 = (TextView) findViewById(R.id.textView201);
        fouls13.setText(Integer.toString(TeamsOverallStatsLists.FindTeamsStat(13).getFouls()));

        Button PersonalStats =  (Button) findViewById(R.id.atomika);
        PersonalStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendPlayersStats(v);
            }
        });
/*        Button  TopFive = (Button) findViewById(R.id.top5);
        TopFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTopFive(v);
            }
        });*/ //leipei h klash gia tus top5 otan prostehei energopoishsh
        Button   FunPage = (Button) findViewById(R.id.arxikh);
        FunPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                senFunPage(v);
            }
        });



    }

    public void sendPlayersStats(View view){
        Intent myIntent = new Intent(TeamStats.this, PersonalStats.class);
        myIntent.putExtra("myIP", myIP);
        startActivity(myIntent);
    }


/*    public void sendTopFive(View view){
        Intent myIntent = new Intent(TeamStats.this, .class);//leipei h klash gia tus top 5
        myIntent.putExtra("myIP", myIP);
        startActivity(myIntent);
    }*/


    public void senFunPage(View view){
        Intent myIntent = new Intent(TeamStats.this, FunPage.class);
        myIntent.putExtra("myIP", myIP);
        startActivity(myIntent);
    }

}
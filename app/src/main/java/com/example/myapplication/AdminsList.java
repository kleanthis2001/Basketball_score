package com.example.myapplication;

import java.util.ArrayList;

public class AdminsList {
    ArrayList<Admin> aList = new ArrayList<>();

    public AdminsList(String ip) {
        String url = "http://"+ip+"/getAdmins.php";
        try {
            OkHttpHandler okHttpHandler = new OkHttpHandler();
            aList = okHttpHandler.getAdmins(url);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean findAdmin(String username, String password){
        boolean flag = false;
        for(int i=0;i<aList.size();i++){
            if(aList.get(i).getUsername().equals(username)){
                if(aList.get(i).getPassword().equals(password)){
                    flag = true;
                }
            }
        }
        return flag;
    }

}
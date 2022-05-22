package com.company;

import java.util.ArrayList;

public class Basketball extends Sport{

    public String teamName;
    public int matchCount;
    public int scoreWin;

    public int scoreLose;
    public int goalScored;
    public int goalConceeded;
    public int allScore;

    public static ArrayList<Basketball> basketballArrayList =new ArrayList<>();

    public Basketball(String teamName) {
        this.teamName = teamName;
        matchCount=0;
        scoreWin=0;
        scoreLose=0;
        allScore=0;
        this.goalScored=0;
        this.goalConceeded=0;

    }

    public String getTeamName() {
        return teamName;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public int getScoreWin() {
        return scoreWin;
    }



    public int getScoreLose() {
        return scoreLose;
    }

    public int getGoalScored() {
        return goalScored;
    }

    public int getGoalConceeded() {
        return goalConceeded;
    }

    public int getAllScore() {
        return allScore;
    }

    public static ArrayList<Basketball> getBasketballArrayList() {
        return basketballArrayList;
    }

    void setMatchCount(){
        this.matchCount++;
    }
    void setGoalScored(int score){
        goalScored+=score;
    }
    void setGoalConceeded(int score){
        goalConceeded+=score;
    }
    void countScore(int score1,int score2){

        setGoalScored(score1);
        setGoalConceeded(score2);

        if(score1>score2){

            setScoreWin();
            allScore+=2;
            setMatchCount();

        }
        else{
            allScore++;
            setScoreLose();
            setMatchCount();
        }

    }

    void setScoreWin(){
        scoreWin++;
    }
    void setScoreLose(){
        scoreLose++;
    }


    void sort(){

        int i= basketballArrayList.size();
        int j;
        for(int k=0;k<i;k++) {
            for (j = 0; j < i - 1; j++) {
                if (basketballArrayList.get(j).allScore < basketballArrayList.get(j + 1).allScore) {
                    Basketball temp = basketballArrayList.get(j);
                    basketballArrayList.set(j, basketballArrayList.get(j + 1));
                    basketballArrayList.set(j + 1, temp);
                }

            }
        }

    }

    public void outPut(){
        sort();
        for(int i = 0; i< basketballArrayList.size() && i<5; i++){

            System.out.println((i+1)+"."+ basketballArrayList.get(i).teamName +" "+
                    basketballArrayList.get(i).matchCount+" "+
                    basketballArrayList.get(i).scoreWin+" "+
                    basketballArrayList.get(i).scoreLose+" "+
                    basketballArrayList.get(i).goalScored+":"+
                    basketballArrayList.get(i).goalConceeded+" "+
                    basketballArrayList.get(i).allScore);


        }


    }






}

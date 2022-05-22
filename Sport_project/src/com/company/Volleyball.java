package com.company;

import java.util.ArrayList;

public class Volleyball extends Sport {
    public String teamName;
    public int matchCount;
    public int scoreWin;

    public int scoreLose;
    public int goalScored;
    public int goalConceeded;
    public int allScore;

    public static ArrayList<Volleyball> volleyballArrayList =new ArrayList<>();

    public Volleyball(String teamName) {
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

    public static ArrayList<Volleyball> getBasketballArrayList() {
        return volleyballArrayList;
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

        if(score1==3 && (score2==0|| score2==1)){

            setScoreWin();
            allScore+=3;
            setMatchCount();

        }
        else if(score1==3 && score2==2){
            setScoreWin();
            allScore+=2;
            setMatchCount();


        }
        else if(score1==2){
            allScore++;
            setScoreLose();
            setMatchCount();
        }
        else{

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

        int i= volleyballArrayList.size();
        int j;
        for(int k=0;k<i;k++) {
            for (j = 0; j < i - 1; j++) {
                if (volleyballArrayList.get(j).allScore < volleyballArrayList.get(j + 1).allScore) {
                    Volleyball temp = volleyballArrayList.get(j);
                    volleyballArrayList.set(j, volleyballArrayList.get(j + 1));
                    volleyballArrayList.set(j + 1, temp);
                }

            }
        }

    }

    public void outPut(){
        sort();
        int a=volleyballArrayList.size();
        System.out.println(a);
        for(int i = 0; i< volleyballArrayList.size() && i<5; i++){
            System.out.println(i);
            System.out.println((i+1)+"."+ volleyballArrayList.get(i).teamName +" "+
                    volleyballArrayList.get(i).matchCount+" "+
                    volleyballArrayList.get(i).scoreWin+" "+
                    volleyballArrayList.get(i).scoreLose+" "+
                    volleyballArrayList.get(i).goalScored+":"+
                    volleyballArrayList.get(i).goalConceeded+" "+
                    volleyballArrayList.get(i).allScore);


        }


    }

}

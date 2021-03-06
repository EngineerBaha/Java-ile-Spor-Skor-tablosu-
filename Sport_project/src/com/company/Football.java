package com.company;

import java.util.ArrayList;

public class Football extends Sport {

public String teamName;
public int matchCount;
public int scoreWin;
public int scoreEq;
public int scoreLose;
public int goalScored;
public int goalConceeded;
public int allScore;

public static ArrayList<Football> footballArrayList=new ArrayList<>();

    public Football(String teamName) {

        this.teamName = teamName;
        matchCount=0;
        scoreWin=0;
        scoreEq=0;
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

    public int getScoreEq() {
        return scoreEq;
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

    public static ArrayList<Football> getFootballArrayList() {
        return footballArrayList;
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
            allScore+=3;
            setMatchCount();


        }
        else if(score1==score2){
            setScoreEq();
            allScore+=1;
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
    void setScoreEq(){
        scoreEq++;
    }

    void sort(){

        int i=footballArrayList.size();
        int j;
        for(int k=0;k<i;k++) {
            for (j = 0; j < i - 1; j++) {
                if (footballArrayList.get(j).allScore < footballArrayList.get(j + 1).allScore) {
                    Football temp = footballArrayList.get(j);
                    footballArrayList.set(j, footballArrayList.get(j + 1));
                    footballArrayList.set(j + 1, temp);
                }

            }
        }

    }

    public void outPut(){
        sort();
        for(int i=0;i<footballArrayList.size() && i<5;i++){

            System.out.println((i+1)+"."+footballArrayList.get(i).teamName +" "+
                    footballArrayList.get(i).matchCount+" "+
                    footballArrayList.get(i).scoreWin+" "+
                    footballArrayList.get(i).scoreEq+" "+
                    footballArrayList.get(i).scoreLose+" "+
                    footballArrayList.get(i).goalScored+":"+
                    footballArrayList.get(i).goalConceeded+" "+
                    footballArrayList.get(i).allScore);


        }


    }
/*
Futbolda, kazanan tak??p 3 puan al??rken, kaybeden tak??m puan alamaz.
Ma?? beraberlik ile sonu??lanm????sa iki tak??mda 1 puan al??r.

????kt??: Futbol.out
1. Basaksehir 28 18 7 3 44:15 61
2. Galatasaray 28 16 8 4 59:28 56
3. Besiktas 28 15 8 5 60:37 53
4. Trabzonspor 28 14 7 7 50:37 49
5. Yeni Malatyaspor 28 10 8 10 38:37 38
Futbol puan durumunun a????klamas?? a??a????daki ??ekildedir.
- Birinci s??tun s??ralamay?? belirler
- ??kinci s??tun kul??p ad??n?? tan??mlar
- ??????nc?? s??tun, oynanan ma??lar??n say??s??n?? tan??mlar
- D??rd??nc?? s??tun, kazan??lan ma??lar??n say??s??n?? tan??mlar
- Be??inci s??tun, bir tak??m??n ka?? kez beraber tamamlad??????n?? tan??mlar
- Alt??nc?? s??tun, kaybedilen ma??lar??n say??s??n?? tan??mlar
- Yedinci s??tun, Att?????? gol say??s??n??: Yedi??i gol say??s??n?? tan??mlar:
- Sekizinci s??tun, kazan??lan toplam puan say??s??n?? tan??mlar

 */





}

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {




        int i;

        try {

            Scanner scanner = new Scanner(new File("sport.txt"));
            while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

                    String []items = line.split("\\s+");
                    String spor = items[0];

                    String teamName1 = items[1];
                    String teamName2 = items[2];

                    int team1Score = Integer.parseInt(items[3]);
                    int team2Score =Integer.parseInt(items[5]);

                    Module sports = new Module(spor,teamName1,teamName2,team1Score,team2Score);
                    Module.arrayList.add(sports);


            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //System.out.println(Sports.arrayList.toString());

        ArrayList<Module> sporFootball= new ArrayList<>();
        ArrayList<Module> sporBasketball= new ArrayList<>();
        ArrayList<Module> sporVolleyball= new ArrayList<>();
int j;
        for(j=0; j< Module.arrayList.size(); j++) {

            if (Module.arrayList.get(j).spor.equalsIgnoreCase("F")){
                //System.out.println("f");
                sporFootball.add(Module.arrayList.get(j));

            }
            else if(Module.arrayList.get(j).spor.equalsIgnoreCase("B")){
               // System.out.println("b");
                sporBasketball.add(Module.arrayList.get(j));


            }
            else{
                //System.out.println("v");
                sporVolleyball.add(Module.arrayList.get(j));

            }
        }

        i=0;
        while (i<sporFootball.size()){


                int flag1 =-1;
                int flag2=-1;

                //Iterator iterator = sporFootball.iterator();
                    //Sports item = (Sports) iterator.next();

                    for(j=0;j<Football.footballArrayList.size();j++) {
                        if (sporFootball.get(i).teamName1.equalsIgnoreCase(Football.footballArrayList.get(j).teamName)) {
                            flag1 = j;


                        }
                        if (sporFootball.get(i).teamName2.equalsIgnoreCase(Football.footballArrayList.get(j).teamName)) {
                            flag2 = j;


                        }
                    }
            //System.out.println("flag1 = "+flag1);
            //System.out.println("flag2 = "+flag2);


                int teamScore1=sporFootball.get(i).teamScore1;
                int teamScore2=sporFootball.get(i).teamScore2;

                if(flag1==-1 && flag2==-1){
                  //  System.out.println("-1 -1");

                    Football ft1_0 = new Football(sporFootball.get(i).teamName1);
                    Football ft2_0 = new Football(sporFootball.get(i).teamName2);

                    Football.footballArrayList.add(ft1_0);
                    Football.footballArrayList.add(ft2_0);
                    ft1_0.countScore(teamScore1,teamScore2);
                    ft2_0.countScore(teamScore2,teamScore1);
                }
                else if(flag1!=-1 && flag2==-1){
                  //  System.out.println( "* -1");
                    Football ft2_0 = new Football(sporFootball.get(i).teamName2);

                    Football.footballArrayList.add(ft2_0);
                    ft2_0.countScore(teamScore2,teamScore1);

                    Football.footballArrayList.get(flag1).countScore(teamScore1,teamScore2);



            }
                else if(flag2!=-1 && flag1==-1){
                    //System.out.println("-1 *");
                    Football ft1_0 = new Football(sporFootball.get(i).teamName1);
                    Football.footballArrayList.add(ft1_0);
                    ft1_0.countScore(teamScore1,teamScore2);
                    Football.footballArrayList.get(flag2).countScore(teamScore2,teamScore1);

                }
                else{
                   // System.out.println("* *");
                    Football.footballArrayList.get(flag1).countScore(teamScore1,teamScore2);
                    Football.footballArrayList.get(flag2).countScore(teamScore2,teamScore1);



                }


            i++;
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("FOOTBall");
        System.out.println("---------------------------------------------------------------------------------------");
        int a;
        Football f = new Football("qw");
        f.outPut();
        //*********************************************************************************
        //BASKETBALL
        //*********************************************************************************

        i=0;
        while (i<sporBasketball.size()){


            int flag1 =-1;
            int flag2=-1;


            for(j=0;j<Basketball.basketballArrayList.size();j++) {
                if (sporBasketball.get(i).teamName1.equalsIgnoreCase(Basketball.basketballArrayList.get(j).teamName)) {
                    flag1 = j;


                }
                if (sporBasketball.get(i).teamName2.equalsIgnoreCase(Basketball.basketballArrayList.get(j).teamName)) {
                    flag2 = j;


                }
            }
            //System.out.println("flag1 = "+flag1);
            //System.out.println("flag2 = "+flag2);


            int teamScore1=sporBasketball.get(i).teamScore1;
            int teamScore2=sporBasketball.get(i).teamScore2;

            if(flag1==-1 && flag2==-1){
                //  System.out.println("-1 -1");

                Basketball ft1_0 = new Basketball(sporBasketball.get(i).teamName1);
                Basketball ft2_0 = new Basketball(sporBasketball.get(i).teamName2);

                Basketball.basketballArrayList.add(ft1_0);
                Basketball.basketballArrayList.add(ft2_0);
                ft1_0.countScore(teamScore1,teamScore2);
                ft2_0.countScore(teamScore2,teamScore1);
            }
            else if(flag1!=-1 && flag2==-1){
                //  System.out.println( "* -1");
                Basketball ft2_0 = new Basketball(sporBasketball.get(i).teamName2);

                Basketball.basketballArrayList.add(ft2_0);
                ft2_0.countScore(teamScore2,teamScore1);

                Basketball.basketballArrayList.get(flag1).countScore(teamScore1,teamScore2);



            }
            else if(flag2!=-1 && flag1==-1){
                //System.out.println("-1 *");
                Basketball ft1_0 = new Basketball(sporBasketball.get(i).teamName1);
                Basketball.basketballArrayList.add(ft1_0);
                ft1_0.countScore(teamScore1,teamScore2);
                Basketball.basketballArrayList.get(flag2).countScore(teamScore2,teamScore1);

            }
            else{
                // System.out.println("* *");
                Basketball.basketballArrayList.get(flag1).countScore(teamScore1,teamScore2);
                Basketball.basketballArrayList.get(flag2).countScore(teamScore2,teamScore1);



            }


            i++;
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("BASKETBALL");
        System.out.println("---------------------------------------------------------------------------------------");
        Basketball b = new Basketball("qw");
        b.outPut();
        //*********************************************************************************
        //volleyball
        //*********************************************************************************

        while (i<sporVolleyball.size()){


            int flag1 =-1;
            int flag2=-1;


            for(j=0;j<Volleyball.volleyballArrayList.size();j++) {
                if (sporVolleyball.get(i).teamName1.equalsIgnoreCase(Volleyball.volleyballArrayList.get(j).teamName)) {
                    flag1 = j;


                }
                if (sporVolleyball.get(i).teamName2.equalsIgnoreCase(Volleyball.volleyballArrayList.get(j).teamName)) {
                    flag2 = j;


                }
            }
            //System.out.println("flag1 = "+flag1);
            //System.out.println("flag2 = "+flag2);


            int teamScore1=sporVolleyball.get(i).teamScore1;
            int teamScore2=sporVolleyball.get(i).teamScore2;

            if(flag1==-1 && flag2==-1){
                //  System.out.println("-1 -1");

                Volleyball ft1_0 = new Volleyball(sporVolleyball.get(i).teamName1);
                Volleyball ft2_0 = new Volleyball(sporVolleyball.get(i).teamName2);

                Volleyball.volleyballArrayList.add(ft1_0);
                Volleyball.volleyballArrayList.add(ft2_0);
                ft1_0.countScore(teamScore1,teamScore2);
                ft2_0.countScore(teamScore2,teamScore1);
            }
            else if(flag1!=-1 && flag2==-1){
                //  System.out.println( "* -1");
                Volleyball ft2_0 = new Volleyball(sporVolleyball.get(i).teamName2);

                Volleyball.volleyballArrayList.add(ft2_0);
                ft2_0.countScore(teamScore2,teamScore1);

                Volleyball.volleyballArrayList.get(flag1).countScore(teamScore1,teamScore2);



            }
            else if(flag2!=-1 && flag1==-1){
                //System.out.println("-1 *");
                Volleyball ft1_0 = new Volleyball(sporVolleyball.get(i).teamName1);
                Volleyball.volleyballArrayList.add(ft1_0);
                ft1_0.countScore(teamScore1,teamScore2);
                Volleyball.volleyballArrayList.get(flag2).countScore(teamScore2,teamScore1);

            }
            else{
                // System.out.println("* *");
                Volleyball.volleyballArrayList.get(flag1).countScore(teamScore1,teamScore2);
                Volleyball.volleyballArrayList.get(flag2).countScore(teamScore2,teamScore1);



            }


            i++;
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Volleyball");
        System.out.println("---------------------------------------------------------------------------------------");
        Volleyball v = new Volleyball("qw");
        v.outPut();


    }


}

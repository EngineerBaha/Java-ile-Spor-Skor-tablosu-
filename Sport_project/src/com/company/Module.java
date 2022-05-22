package com.company;
import java.util.ArrayList;

public class Module {
    public String spor;
    public String teamName1;
    public String teamName2;
    public int teamScore1;
    public int teamScore2;
    public static ArrayList<Module> arrayList=new ArrayList<>();

    public Module(String spor, String teamName1, String teamName2, int teamScore1, int teamScore2) {
        this.spor = spor;
        this.teamName1 = teamName1;
        this.teamName2 = teamName2;
        this.teamScore1 = teamScore1;
        this.teamScore2 = teamScore2;
    }

    @Override
    public String toString() {
        return   spor + " " + teamName1 +" " + teamName2+ " " +" " + teamScore1 +" " + teamScore2+ "\n";
    }
}
      /*
                    int flag1=0;
                    int flag2 =0;
                    int ind1;
                    int ind2;
                    for(i=0;i<Sports.arrayList.size();i++){
                        if(Sports.arrayList.get(i).teamName==teamName1){
                            flag1=1;
                            ind1=i;
                        }
                        if(Sports.arrayList.get(i).teamName==teamName2){
                            flag2=1;
                            ind2=i;

                        }


                    }

                    if(flag1==0 && flag2==0){
                        Sports.arrayList.add(sports1);
                        Sports.arrayList.add(sports2);

                    }
                    else {
                        if(flag1==1 ){



                        }
                        if (flag2==1){




                        }

                    }

*/
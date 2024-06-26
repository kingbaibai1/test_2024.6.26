package org.example.File;

public class FileTest8 {
    public static int totalNumber;
    public static int lastBottleNumber;
    public static int lastCoverNumber;
    public static void main(String[] args) {
        //啤酒问题：啤酒2元一瓶，4个盖子可以换一瓶，两个空瓶可以换一瓶，请问10元可以换多少瓶
        bee(10);
        System.out.println(totalNumber);
        System.out.println(lastBottleNumber);
        System.out.println(lastCoverNumber);
    }

    public static void bee(int money){
        int buyNumber=money/2;
        totalNumber+=buyNumber;

        int allBottleNumber=lastBottleNumber+buyNumber;
        int allCoverNumber=lastCoverNumber+buyNumber;

        int allMoney=0;

        if(allCoverNumber>=4){
            allMoney+=(allCoverNumber/4)*2;
        }
        lastCoverNumber=allCoverNumber%4;

        if(allBottleNumber>=2){
            allMoney+=(allBottleNumber/2)*2;
        }
        lastBottleNumber=allBottleNumber%2;

        if(allMoney>=2){
            bee(allMoney);
        }
    }
}

package org.example.entity;

import java.util.*;

public class Room {
    //必须有一副牌
    private List<Card> allCards=new ArrayList<>();

    public  Room(){
        //1.做出54张牌，存入到集合allCards
        //2.点数：个数确定，类型确定
        String[] numbers={"1","2","3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //花色
        String[] colors={"♣️","♥️","♦️","♠️"};
        int size=0;//表示每张牌的大小
        //遍历点数
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                Card c=new Card(number,color,size);
                allCards.add(c);
            }
        }

        //单独存入大小王
        Card c1=new Card("","🃏",++size);
        Card c2=new Card("","🦢",++size);
        Collections.addAll(allCards,c1,c2);
        System.out.println("新牌"+allCards);
    }

    public void start() {
        //1.洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后"+allCards);

        //2.发牌，首先肯定要定义一个三个玩家
        List<Card>lingHuChong=new ArrayList<>();
        List<Card>jiuMozhi=new ArrayList<>();
        List<Card>renYingYing=new ArrayList<>();

        //2.发牌给玩家
        for (int i = 0; i < allCards.size(); i++) {
            Card c=allCards.get(i);
            if(i%3==0){
                lingHuChong.add(c);
            }
            if(i%3==1){
                jiuMozhi.add(c);
            }
            if(i%3==2){
                renYingYing.add(c);
            }
        }

        //对3个玩家的牌进行排序
        sortCards(lingHuChong);
        sortCards(jiuMozhi);
        sortCards(renYingYing);
        //看牌
        System.out.println("令狐冲"+lingHuChong);
        System.out.println("鸠摩智"+jiuMozhi);
        System.out.println("任盈盈"+renYingYing);
        List<Card>lastThreeCards=allCards.subList(allCards.size()-3,allCards.size());
        System.out.println("底牌"+lastThreeCards);
        jiuMozhi.addAll(lastThreeCards);
        sortCards(jiuMozhi);
        System.out.println("抢地主后的牌"+jiuMozhi);

    }

    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
//                return o1.getSize()- o2.getSize();
                return o2.getSize()- o1.getSize();
            }
        });

    }
}

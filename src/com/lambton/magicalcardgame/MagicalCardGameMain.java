package com.lambton.magicalcardgame;

public class MagicalCardGameMain{

    public static void main (String args[])
    {
        MagicalCardGameModel magicalCardGameModel = new MagicalCardGameModel();
        String [][]cards = {{"1","A","5"},{"2","7","3"},{"3","6","K"}};
        magicalCardGameModel.setCardList(cards);

        }
}

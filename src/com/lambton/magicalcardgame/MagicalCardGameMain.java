package com.lambton.magicalcardgame;

import java.util.Scanner;

public class MagicalCardGameMain{

    public static void main (String args[])
    {
        MagicalCardGameModel magicalCardGameModel = new MagicalCardGameModel();
        System.out.println("Welcome to Magical Card Game ..");
        String [][]cards = {{"1","A","5"},{"2","7","3"},{"3","6","K"}};
        System.out.println("Please select one card from below");
        for (int i=0;i<cards.length;i++) {
            for (int j = 0; j < cards.length; j++) {
                System.out.print(cards[i][j]);
                System.out.print(" , ");
            }
            System.out.println(" ");
        }
        magicalCardGameModel.setCardList(cards);
        Scanner scanner = new Scanner(System. in);
        System.out.println("Please tell the column in which your card falls");
        String FirstShuffleColPos = scanner. nextLine();
        System.out.println("Column selected: "+FirstShuffleColPos);
        magicalCardGameModel.setFirstShuffleColPos(FirstShuffleColPos);
        MagicalCardGameCalculator magicalCardGameCalculator = new MagicalCardGameCalculator();
//        magicalCardGameModel.setCardList()=;
        for (int i=0;i<cards.length;i++) {
            for (int j = 0; j < cards.length; j++) {
                System.out.print(cards[i][j]);
                System.out.print(" , ");
            }
            System.out.println(" ");
        }
        }
}

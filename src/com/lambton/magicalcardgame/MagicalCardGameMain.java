package com.lambton.magicalcardgame;

import java.util.Scanner;

public class MagicalCardGameMain{

    public static void main (String args[])
    {
        MagicalCardGameModel magicalCardGameModel = new MagicalCardGameModel();
        System.out.println("Welcome to Magical Card Game ..");
        String [][]cards = {{"1","A","5"},{"2","7","3"},{"3","6","K"}};
        System.out.println("Please select one card from below");
        for (int i=0;i<cards.length;i++){
            for (int j=0;j<cards.length;j++){
               System.out.print(cards[i][j]);
                System.out.print(" , ");
                }
            System.out.println(" ");
        }


        magicalCardGameModel.setCardList(cards);
        Scanner scanner = new Scanner(System. in);
        String FirstShuffleColPos = scanner. nextLine();
        magicalCardGameModel.setFirstShuffleColPos(FirstShuffleColPos);
        }
}

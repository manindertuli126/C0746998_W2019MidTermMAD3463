package com.lambton.magicalcardgame;

public class MagicalCardGameCalculator {
    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel){
        int rowNumber = 0;
        int columnNumber = 0;
        String [][] cards1 = magicalCardGameModel.getCardList();
        if(magicalCardGameModel.firstShuffleColPos.contains("A")){
            rowNumber =0;

        }else if (magicalCardGameModel.firstShuffleColPos.contains("B")){
            rowNumber =1;
        }else if (magicalCardGameModel.firstShuffleColPos.contains("C")){
            rowNumber =2;
        }


        return cards1;
    }

    public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel){

    }
    public String getFinalResult(MagicalCardGameModel magicalCardGameModel){

    }
}

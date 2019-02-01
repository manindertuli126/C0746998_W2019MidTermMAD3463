package com.lambton.magicalcardgame;

public class MagicalCardGameCalculator {
    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel){
        int rowNumber = 0;
        int columnNumber = 0;
        String [][] cards1 = magicalCardGameModel.getCardList();
        String tempArray [][]=new String[3][3];
        String firstShuffleColPos = magicalCardGameModel.firstShuffleColPos;
        columnNumber = Integer.parseInt(firstShuffleColPos.substring(1,2));
        if(firstShuffleColPos.contains("A")){
            rowNumber =0;
            tempArray[0][0]=cards1[0][1];
            tempArray[0][1]=cards1[1][1];
            tempArray[0][2]=cards1[2][1];

            tempArray[1][0]=cards1[0][0];
            tempArray[1][1]=cards1[1][0];
            tempArray[1][2]=cards1[2][0];

            tempArray[2][0]=cards1[0][2];
            tempArray[2][1]=cards1[1][2];
            tempArray[2][2]=cards1[2][2];

//            for (int w=0; w<cards1.length; w++) {
//                for (int y = rowNumber; y < 1; y++) {
//                    for (int u = 0; u < cards1.length; u++) {
//                        tempArray[y][u] = cards1[y][u + 1];
//                    }
//                }
//                for (int y = columnNumber; y < 2; y++) {
//                    for (int u = 0; u < cards1.length; u++) {
//                        tempArray[y][u] = cards1[y][u + 1];
//                    }
//                }
//            }
        }else if (firstShuffleColPos.contains("B")){
            rowNumber =1;
            tempArray[0][0]=cards1[0][0];
            tempArray[0][1]=cards1[1][0];
            tempArray[0][2]=cards1[2][0];

            tempArray[1][0]=cards1[0][1];
            tempArray[1][1]=cards1[1][1];
            tempArray[1][2]=cards1[2][1];

            tempArray[2][0]=cards1[0][2];
            tempArray[2][1]=cards1[1][2];
            tempArray[2][2]=cards1[2][2];

        }else if (firstShuffleColPos.contains("C")) {
            rowNumber = 2;
            tempArray[0][0]=cards1[0][1];
            tempArray[0][1]=cards1[1][1];
            tempArray[0][2]=cards1[2][1];

            tempArray[1][0]=cards1[0][2];
            tempArray[1][1]=cards1[1][2];
            tempArray[1][2]=cards1[2][2];

            tempArray[2][0]=cards1[0][0];
            tempArray[2][1]=cards1[1][0];
            tempArray[2][2]=cards1[2][0];
        }
        magicalCardGameModel.setCardList(tempArray);
        return tempArray;
    }

//    public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel){
//
//    }
//    public String getFinalResult(MagicalCardGameModel magicalCardGameModel){
//
//    }
}

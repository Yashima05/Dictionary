package com.workwithdictionary.moves;

import java.util.Scanner;

public class EndMoves {
    public void eMoves(){
        StartMoves sM = new StartMoves();
        DictionaryMoves d1M = new DictionaryMoves();
        System.out.println("Выберите действие: \n1 - Продолжить работу со словарем;\n2 - Выбрать другой словарь.");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a == 1){
            d1M.d1Moves();
        }
        if (a == 2){
            sM.mainMoves();
        }
    }
    public void eMoves2(){
        StartMoves sM = new StartMoves();
        DictionaryMoves d1M = new DictionaryMoves();
        System.out.println("Выберите действие: \n1 - Продолжить работу со словарем;\n2 - Выбрать другой словарь.");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a == 1){
            d1M.d2Moves();
        }
        if (a == 2){
            sM.mainMoves();
        }
    }
}

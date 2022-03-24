package com.workwithdictionary.moves;
import com.workwithdictionary.showalldictionary.ShowAll;

import java.util.Scanner;

public class StartMoves {
    public void mainMoves(){
        DictionaryMoves d1M = new DictionaryMoves();
        ShowAll sA = new ShowAll();
        System.out.println("Выберите словарь: \n 1 - Первый словарь; \n 2 - Второй словарь; \n 3 - Показать оба словаря");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a == 1){
            d1M.d1Moves();
        }
        if(a == 2){
            d1M.d2Moves();
        }
        if (a == 3){
            sA.showAll();
        }
    }
}

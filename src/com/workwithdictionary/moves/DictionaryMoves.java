package com.workwithdictionary.moves;
import com.workwithdictionary.dictionarymethods1.MethodsOfDictionary1;
import com.workwithdictionary.dictionarymethods2.MethodsOfDictionary2;

import java.util.Scanner;

public class DictionaryMoves {

    public void d1Moves(){
        MethodsOfDictionary1 mOD1 = new MethodsOfDictionary1();
        System.out.println("Выберите действие: \n1 - Добавить запись;\n2 - Показать словарь;\n3 - Удалить запись.");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1){
            mOD1.writeDictionary1();
        }
        if (a == 2){
            mOD1.readDictionary1();
        }
        if(a == 3){
            mOD1.deleteDictionary1();
        }
    }
    public void d2Moves(){
        MethodsOfDictionary2 mOD2 = new MethodsOfDictionary2();
        System.out.println("Выберите действие: \n1 - Добавить запись;\n2 - Показать словарь;\n3 - Удалить запись.");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1){
            mOD2.writeDictionary2();
        }
        if (a == 2){
            mOD2.readDictionary2();
        }
        if(a == 3){
            mOD2.deleteDictionary2();
        }
    }

}

package com.workwithdictionary.showalldictionary;

import com.workwithdictionary.moves.StartMoves;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ShowAll {
    public File dict1 = new File(new File("src\\com\\resources\\Dictionary1.txt").getAbsolutePath());
    public File dict2 = new File(new File("src\\com\\resources\\Dictionary2.txt").getAbsolutePath());
    public void showAll(){
        StartMoves sM = new StartMoves();
        System.out.println("Содержимое обоих словарей: ");
        try {
            FileReader fr1 = new FileReader(dict1);
            BufferedReader br1 = new BufferedReader(fr1);
            String ln = br1.readLine();
            while (ln != null) {
                System.out.println(ln);
                ln = br1.readLine();
            }
            FileReader fr2 = new FileReader(dict2);
            BufferedReader br2 = new BufferedReader(fr2);
            String ln1 = br2.readLine();
            while (ln1 != null) {
                System.out.println(ln1);
                ln1 = br2.readLine();
            }
            sM.mainMoves();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

    }
}

package com.workwithdictionary.dictionarymethods1;

import com.workwithdictionary.moves.EndMoves;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MethodsOfDictionary1 {
    public File dict1 = new File("C:\\Users\\mart\\IdeaProjects\\Dictionary\\src\\resources", "Dictionary1.txt");
    public HashMap<String, String> hashMap1 = new HashMap<String, String>();

    public void readDictionary1() {
        EndMoves eM = new EndMoves();
        System.out.println("Словарь содержит: ");
        try {
            FileReader fr1 = new FileReader(dict1);
            BufferedReader br1 = new BufferedReader(fr1);
            String ln = br1.readLine();
            while (ln != null) {
                System.out.println(ln);
                ln = br1.readLine();
            }
            eM.eMoves();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

    }

    public void writeDictionary1() {
        MethodsOfDictionary1 mOD11 = new MethodsOfDictionary1();
        EndMoves eM = new EndMoves();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите ключ: ");
            String key = sc.nextLine();
            System.out.println("Введите значение: ");
            String value = sc.nextLine();
            hashMap1.put(key, value);
            String str1 = new String();
            for (Map.Entry<String, String> entry : hashMap1.entrySet()) {
                str1 = entry.getKey() + ":" + entry.getValue();
            }
            FileWriter fw1 = new FileWriter(dict1, true);
            BufferedWriter pw1 = new BufferedWriter(fw1);
            pw1.write( str1 + "\n");
            pw1.close();
            System.out.println("Теперь словарь содержит: ");
            mOD11.readDictionary1();
            eM.eMoves();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);

        }
    }

    public void deleteDictionary1() {
        MethodsOfDictionary1 mOD11 = new MethodsOfDictionary1();
        EndMoves eM = new EndMoves();
        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(dict1));
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length >= 2) {
                    String key = parts[0];
                    String value = parts[1];
                    hashMap1.put(key, value);
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }
            System.out.println("Словарь содержит: ");
            for (String key : hashMap1.keySet()) {
                System.out.println(key + ":" + hashMap1.get(key));
            }
            reader.close();
            System.out.println("Введите ключ удаляемой записи: ");
            Scanner in1 = new Scanner(System.in);
            hashMap1.remove(in1.nextLine());
            try{
                FileWriter fileW1 = new FileWriter(dict1);
                BufferedWriter buffW1 = new BufferedWriter(fileW1);
                for(Map.Entry<String, String> entry : hashMap1.entrySet()){
                    fileW1.write(entry.getKey() + ":" + entry.getValue() + "\n");
                }
                fileW1.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e);
            }
            System.out.println("Теперь словарь содержит: ");
            mOD11.readDictionary1();
            System.out.println(hashMap1);
            eM.eMoves();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println(ex);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}

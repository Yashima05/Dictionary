package com.workwithdictionary.dictionarymethods;
import com.workwithdictionary.moves.EndMoves;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MethodsOfDictionary2 {
    public File dict2 = new File(new File("src\\com\\resources\\Dictionary2.txt").getAbsolutePath());
    public HashMap<String, String> hashMap2 = new HashMap<String, String>();

    public void readDictionary2(){
        EndMoves eM = new EndMoves();
        System.out.println("Словарь содержит: ");
        try {
            FileReader fr2 = new FileReader(dict2);
            BufferedReader br2 = new BufferedReader(fr2);
            String ln = br2.readLine();
            while (ln != null) {
                System.out.println(ln);
                ln = br2.readLine();
            }
            eM.eMoves2();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    public void writeDictionary2(){
        MethodsOfDictionary2 mOD12 = new MethodsOfDictionary2();
        EndMoves eM = new EndMoves();
        try {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Введите ключ: ");
            String key = sc2.nextLine();
            System.out.println("Введите значение: ");
            String value = sc2.nextLine();
            boolean onlyNumbers = value.matches("^[0-9]+$");
            if(onlyNumbers == true){
                if (value.length() == 5){
                    hashMap2.put(key, value);
                    String str2 = new String();
                    for (Map.Entry<String, String> entry : hashMap2.entrySet()) {
                        str2 = entry.getKey() + ":" + entry.getValue();
                    }
                    FileWriter fw2 = new FileWriter(dict2, true);
                    BufferedWriter pw2 = new BufferedWriter(fw2);
                    pw2.write( str2 + "\n");
                    pw2.close();
                    System.out.println("Теперь словарь содержит: ");
                    mOD12.readDictionary2();
                    eM.eMoves2();
                }
                else{
                    System.out.println("Ошибка: Значение превышает допускаемую длину!");
                    eM.eMoves2();
                }
            }
            else{
                System.out.println("Ошибка: Доступен ввод только числовых значений!");
                eM.eMoves2();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);

        }
    }
    public void deleteDictionary2() {
        MethodsOfDictionary2 mOD12 = new MethodsOfDictionary2();
        EndMoves eM = new EndMoves();
        try {
            String line;
            BufferedReader reader2 = new BufferedReader(new FileReader(dict2));
            while ((line = reader2.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length >= 2) {
                    String key = parts[0];
                    String value = parts[1];
                    hashMap2.put(key, value);
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }
            System.out.println("Словарь содержит: ");
            for (String key : hashMap2.keySet()) {
                System.out.println(key + ":" + hashMap2.get(key));
            }
            reader2.close();
            System.out.println("Введите ключ удаляемой записи: ");
            Scanner in1 = new Scanner(System.in);
            hashMap2.remove(in1.nextLine());
            try{
                FileWriter fileW1 = new FileWriter(dict2);
                BufferedWriter buffW1 = new BufferedWriter(fileW1);
                for(Map.Entry<String, String> entry : hashMap2.entrySet()){
                    fileW1.write(entry.getKey() + ":" + entry.getValue() + "\n");
                }
                fileW1.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e);
            }
            System.out.println("Теперь словарь содержит: ");
            mOD12.readDictionary2();
            System.out.println(hashMap2);
            eM.eMoves2();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println(ex);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    public void findValue2(){
        EndMoves eM = new EndMoves();
        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(dict2));
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length >= 2) {
                    String key = parts[0];
                    String value = parts[1];
                    hashMap2.put(key, value);
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Введите ключ искомой записи:");
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();
        System.out.println(hashMap2.get(key));
        eM.eMoves2();
    }
}

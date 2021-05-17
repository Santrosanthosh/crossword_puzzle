package com.File_directory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionary {
    public static List<String> words = new ArrayList<String>();

    public static void read()
    {
        try
        {
            FileInputStream fis=new FileInputStream("/Users/santhosh/Desktop/santro");
            Scanner sc=new Scanner(fis);

            while(sc.hasNextLine())
            {
                String line = sc.nextLine();                   // reading from the file and stored in list
                words.add(line);
            }
            sc.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static boolean isValidWord( String sampleWord){
        if(words.isEmpty()){
            read();
        }
        if(words.contains(sampleWord)){
            return true;
        }

        return false;
    }
}


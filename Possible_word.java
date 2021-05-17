package com.File_directory;

import java.util.HashMap;
import java.util.Map;

public  class Possible_word {

   static  char[][] grid = {{'s', 'i', 'x','t','f','e','a','l','f','f'},
           {'h', 'n', 'f','c','n','s','q','i','t','h'},
           {'t', 'a', 'n','i','n','e','c','l','r','n'},
           {'e', 'h', 'y','f','i','v','e','e','e','e'},                //  10 * 10 Cross Word puzzle
           {'n', 'd', 't','h','r','e','e','c','h','p'},
           {'b', 't', 'h','j','k','n','r','o','e','o'},
           {'o', 'w', 'r','d','y','c','t','u','i','a'},
           {'n', 'o', 'm','y','a','p','v','n','g','e'},
           {'e', 'i', 'm','f','o','u','r','t','h','r'},
           {'h', 't', 'c','z','e','r','o','l','t','t'}
    };
   static  int size= 10;
  public  static void words () {
      Integer i, j, k,temp;
      String str = "",start="",end="";
      HashMap<String,String> index = new HashMap<String,String>();
      String tempIndex;
      HashMap<String, HashMap<String,String>> word = new HashMap<String,HashMap<String,String>>();

      for (i = 0; i < size; i++) {
          for (k = 0; k < size; k++) {
              tempIndex =  String.valueOf((char)(i + 65)) + k.toString();          //Possible words from cross word puzzle generated vertically
              for (j = k; j < size; j++) {
                  index = new HashMap<String,String>();
                  str = str + grid[i][j];
                 ;
                  index.put("end", String.valueOf((char)(i + 65))+j.toString());
                  index.put("start",tempIndex);
                  word.put(str,index);
              }
              str = "";
          }

      }

      for (i = 0; i < size; i++) {
          for (k = 0; k < size; k++) {
              tempIndex = String.valueOf((char)(k + 65)) + i.toString();
              for (j =  k; j < size; j++) {
                  index = new HashMap<String,String>();
                  index.put("end",String.valueOf((char)(j+ 65))+i.toString());    //Possible word from cross word puzzle generated Horizontally
                  str = str + grid[j][i];
                  index.put("start",tempIndex);
                  word.put(str,index);
              }
              str = "";
          }

      }

      for (Map.Entry<String, HashMap<String,String>> set : word.entrySet()) {

           if(Dictionary.isValidWord(set.getKey())){
               System.out.println(set.getKey() + "" + set.getValue());   // Checking if it is  a valid  word
           }


      }

  }


}

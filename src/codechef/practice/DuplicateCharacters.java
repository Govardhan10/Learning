package codechef.practice;

import java.util.Arrays;

public class DuplicateCharacters{

    public static void rduplication(char [] word){
        if(word == null) return;
        int len = word.length;
        if(len<2) return;

        for(int i =0;i<word.length;i++){
            int count=0;
            for(int j=i;j<word.length;j++){
                if(word[i] == word[j]){
                    count = count + 1;
//                    System.out.println(count);
                }
                if(word[i] == word[j] && count > 1){
                    word[j] =0;

                }

            }
        }
        System.out.println(Arrays.toString(word));
    }

    public static void main(String []  args){
        String word = "geeksforgeeks";
        rduplication(word.toCharArray());
    }
}

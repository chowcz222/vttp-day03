package io;

public class FileMain {

    public static void main(String[] args) {
        
        System.out.printf("args.length = %d\n", args.length);

        for(int i = 1 ; i < args.length; i++)
            System.out.printf("%d. %s\n", i , args[i]);
            
    }
    
}

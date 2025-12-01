package day1;

import helpers.Helpers;

import java.io.IOException;

public class day1_2 {
    public static void main(String[] args) throws IOException {
        String[] input = Helpers.readFile(args[0]).split("\n");
        int num = 50;
        int count = 0;
        for (String s : input) {
            int i = Integer.parseInt(s.replace("R", "").replace("L", ""));
            if(s.startsWith("R")) {
                for (int j = 0; j < i; j++) {
                    num++;
                    if (num % 100 == 0) {
                        count++;
                    }
                }
            } else {
                for (int j = 0; j < i; j++) {
                    num--;
                    if (num % 100 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
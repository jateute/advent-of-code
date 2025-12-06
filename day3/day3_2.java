package day3;

import helpers.Helpers;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class day3_2 {
    public static void main(String[] args) throws IOException {
        String[] input = Helpers.readFile(args[0]).split("\n");
        BigInteger joltage = new BigInteger("0");
        for (String s : input) {
            while(s.length() >12) {
                int min = 9;
                int mini = 0;
                Integer[]  tmp = Arrays.stream(s.split("")).map(Integer::parseInt).toArray(Integer[]::new);
                for (int i = 0; i < s.length(); i++) {
                    if (tmp[i] < min) {
                        min = tmp[i];
                        mini = i;
                        if(min == 1) break;
                    }
                }
                List<String> temp = new java.util.ArrayList<>(Arrays.stream(s.split("")).toList());
                temp.remove(mini);
                StringBuilder sb = new StringBuilder();
                for (String st : temp) sb.append(st);
                s = sb.toString();
            }

            System.out.println(s);
            joltage = joltage.add(new BigInteger(s));
        }
        System.out.println(joltage);
    }
}

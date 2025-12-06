package day3;

import helpers.Helpers;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class day3_1 {
    public static void main(String[] args) throws IOException {
        String[] input = Helpers.readFile(args[0]).split("\n");
        int joltage = 0;
        for (String s : input) {
            int max = 0;
            int maxi = 0;
            List<Integer> tmp = Arrays.stream(s.split("")).map(Integer::parseInt).toList();
            for (int i = 0; i < s.length()-1; i++) {
                if (tmp.get(i) > max) {
                    max= tmp.get(i);
                    maxi = i;
                }
            }
            int max2 = 0;
            for (int i = maxi+1; i < s.length(); i++) {
                if (tmp.get(i) > max2) {
                    max2= tmp.get(i);
                }
            }
            System.out.println(max + "" + max2);
            joltage += Integer.parseInt(max + "" + max2);
        }
        System.out.println(joltage);
    }
}

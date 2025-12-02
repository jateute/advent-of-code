package day2;

import helpers.Helpers;

import java.io.IOException;
import java.math.BigInteger;

public class day2_1 {
    public static void main(String[] args) throws IOException {
        String[] input = Helpers.readFile(args[0]).split(",");
        BigInteger count = new BigInteger("0");
        for (String s : input) {
            String[] tmp = s.split("-");
            for (BigInteger i = new BigInteger(tmp[0]); 0 >= i.compareTo(new BigInteger(tmp[1])); i = i.add(new BigInteger("1"))) {
                String iString = String.valueOf(i);
                if (iString.length() % 2!=0) continue;
                if (iString.substring(0, (iString.length()/2)).equals(iString.substring(iString.length()/2)))
                    count = count.add(i);
            }
        }
        System.out.println(count);
    }
}

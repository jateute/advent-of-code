package day2;

import helpers.Helpers;

import java.io.IOException;
import java.math.BigInteger;

public class day2_2 {
    public static void main(String[] args) throws IOException {
        String[] input = Helpers.readFile(args[0]).split(",");
        BigInteger count = new BigInteger("0");
        for (String s : input) {
            String[] tmp = s.split("-");
            for (BigInteger i = new BigInteger(tmp[0]); 0 >= i.compareTo(new BigInteger(tmp[1])); i = i.add(new BigInteger("1"))) {
                String iString = String.valueOf(i);
                for (int j = 1; j <= iString.length()/2; j++) {
                    if (iString.length()%j!=0) continue;
                    String substring = iString.substring(0, j);
                    boolean equal = true;
                    for (int k = 1; k < iString.length()/j; k++) {
                        if (!substring.equals(iString.substring(j*k, j*(k+1)))) {
                            equal = false;
                            break;
                        }
                    }
                    if(equal) {
                        count = count.add(i);
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

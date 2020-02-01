package pl.akademiakodu.projects;

import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class PassBreaker {

    public void tryToBreakPassword(String password) {

        String pass = null;
        BigInteger counter = BigInteger.ZERO;
        long start = System.nanoTime();


        while (true) {

            pass = RandomStringUtils.randomAlphabetic(password.length());
            counter = counter.add(BigInteger.ONE);
            if (pass.equalsIgnoreCase(password)) {
                break;
            }
        }


        long stop = System.nanoTime();
        double elapsedTime = (double) (stop - start) / 1000000000;
        double convert = TimeUnit.MILLISECONDS.convert((stop - start), TimeUnit.MILLISECONDS);
        System.out.println("broken! " + counter + " | " + pass + " | " + elapsedTime);
    }

}

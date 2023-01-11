
package com.visa.eur.tests; // we run all tests under "tests" package

import com.intuit.karate.junit5.Karate;

public class testsPackageKarateRunner {

    @Karate.Test
    public Karate runTest() {
        return new Karate().relativeTo(getClass());
        //return Karate.run("get_spartan").tags("spartan").relativeTo(getClass());
        //return Karate.run("hello/hello.feature").relativeTo(getClass());
    }
}
package com.visa;

import com.intuit.karate.junit5.Karate;

public class Eur_KarateRunner {

    @Karate.Test
    public Karate runAll() {
        return new Karate().relativeTo(getClass());
    }
}

//INFO: Sample Running Options

/*

1- Run only sample.feature file.

    @Karate.Test
    Karate testSample() {
        return Karate.run("sample").relativeTo(getClass());
    }


2- Run tags.feature file and tags only with @second

    @Karate.Test
    Karate testTags() {
        return Karate.run("tags").tags("@second").relativeTo(getClass());
    }

3- Run any *.feature file which has tag @second.

    @Karate.Test
    Karate testTagsWithoutFeatureName() {
        return Karate.run().tags("@second").relativeTo(getClass());
    }

4- by providing path as in #2 above.

    @Karate.Test
    Karate testFullPath() {
        return Karate.run("classpath:karate/tags.feature").tags("@first");
    }

5- ??
    @Karate.Test
    Karate testSystemProperty() {
        return Karate.run("classpath:karate/tags.feature")
                .tags("@second")
                .karateEnv("e2e")
                .systemProperty("foo", "bar");
    }


6- Run all tests in the package.
    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }


 */
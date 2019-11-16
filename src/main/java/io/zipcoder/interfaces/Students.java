package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Students extends People {

    private final static Students INSTANCE = new Students();


    private Students() {
        Student Sandy = new Student(1, "Sandy");
        Student MikeG = new Student(2, "MikeG");
        Student Ben = new Student(3, "Ben");
        super.add(Sandy);
        super.add(MikeG);
        super.add(Ben);

    }


    public static Students getInstance() {
       return INSTANCE;
   }

}

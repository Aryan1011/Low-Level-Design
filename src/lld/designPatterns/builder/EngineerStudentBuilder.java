package lld.designPatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder{

    // similarly you can have MBA and commerce Student Builder
    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("DSA");
        subs.add("OOPS");
        subs.add("DBMS");
        this.subjects = subs;
        return this;
    }
}

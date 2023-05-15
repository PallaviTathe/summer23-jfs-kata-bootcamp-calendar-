package org.WildWebWarriors.se.salt.jfs.kata;

public class SaltCourse {
    public CoursePeriod term;

    public SaltCourse (CoursePeriod term) {
        this.term = term;
    }

    public String[] getMonths () {
         return this.term.seasonArray;
    }
}

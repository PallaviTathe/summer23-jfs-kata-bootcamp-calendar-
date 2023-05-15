package org.WildWebWarriors.se.salt.jfs.kata;

public enum CoursePeriod {

    WINTER(new String[] {"January", "February", "March", "April"}),
    SUMMER(new String[] {"May", "June", "July"}),
    FALL(new String[] {"September", "October", "November", "December"});
    public final String[] seasonArray;

    private CoursePeriod (String[] seasonArray) {
        this.seasonArray = seasonArray;
    }
}

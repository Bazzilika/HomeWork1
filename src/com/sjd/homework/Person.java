package com.sjd.homework;

public class Person {
    private final boolean isWoman;
    private final String name;
    private Person spouse;

    public Person(boolean isWoman, String  name){
        this.isWoman = isWoman;
        this.name = name;
    }

    /**
     * Sets spouse = null if spouse is not null
     * @return true - if person status has been changed
     */
    public boolean divorce(){
        boolean result = (spouse != null);
        if (result){
            System.out.println(name + " and " + spouse.name + " - divorce " + result);
            spouse.spouse = null;
            spouse = null;
        } else {
            System.out.println(name + " have no spouse " + result);
        }
        return result;
    }

    /**
     * This method checks gender of persons.
     * If genders are not equal - tries to marry.
     * If one of them has another spouse -
     * execute divorce(sets spouse = null for husband and wife.
     * Example: if both persons have spouses -
     * then divorce will set 4 spouse to null) and then executes marry().
     * @param person - new husband/wife for this person.
     * @return - returns true if this person has another gender
     * than passed person and they are not husband and wife,
     * false otherwise
     */
    public boolean marry(Person person){
        if (person.isWoman == isWoman) {
            System.out.println(name + " and " + person.name
                    + " there are no same-gender marriages in russia. false");
            return false;
        }
        if (spouse == person){
            System.out.println(name + " and " + spouse.name
                    + " - already married. false ");
            return false;
        }
        if (spouse == null && person.spouse == null){
            spouse = person;
            person.spouse = this;
            System.out.println(name + " and " + spouse.name + " - marriage. true ");
            return true;
        }
        if (spouse != null){
            System.out.println(name + " need to divorce before marriage");
            divorce();
        }
        if (person.spouse != null) {
            System.out.println(person.name + " need to divorce before marriage");
            person.divorce();
        }
        spouse = person;
        person.spouse = this;
        System.out.println(name + " and " + spouse.name + " - marriage. false ");
        return false;
    }
}

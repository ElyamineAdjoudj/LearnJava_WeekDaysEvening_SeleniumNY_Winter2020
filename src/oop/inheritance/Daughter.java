package oop.inheritance;

public class Daughter extends Father{



    public String favouriteDish="Masala";
    public String favouriteSportsTeam="FL Jets";
    public String daughterSSN="54647834";

    private String daughterAccountNumber="394647854";

    public Daughter() {
    }

    public Daughter(String favouriteDish) {
        this.favouriteDish = favouriteDish;
    }

    public Daughter(String favouriteDish, String favouriteSportsTeam) {
        this.favouriteDish = favouriteDish;
        this.favouriteSportsTeam = favouriteSportsTeam;
    }

    public Daughter(String favouriteDish, String favouriteSportsTeam, String daughterSSN) {
        this.favouriteDish = favouriteDish;
        this.favouriteSportsTeam = favouriteSportsTeam;
        this.daughterSSN = daughterSSN;
    }

    public String getDaughterAccountNumber() {
        return daughterAccountNumber;
    }

    public void setDaughterAccountNumber(String daughterAccountNumber) {
        this.daughterAccountNumber = daughterAccountNumber;
    }

    public void mindReader(){
        System.out.println("Can read mind easily");
    }

    public void sing(){
        System.out.println("Can sing");
    }



}

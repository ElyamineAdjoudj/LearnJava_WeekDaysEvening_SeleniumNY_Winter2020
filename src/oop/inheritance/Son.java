package oop.inheritance;

public class Son extends Father {

    public String favouriteDish="Pizza";
    public String favouriteSportsTeam="VA Jets";
    public String sonSSN="64647834";

    private String sonAccountNumber="294647854";


    public Son() {
    }

    public Son(String favouriteDish) {
        this.favouriteDish = favouriteDish;
    }

    public Son(String favouriteDish, String favouriteSportsTeam) {
        this.favouriteDish = favouriteDish;
        this.favouriteSportsTeam = favouriteSportsTeam;
    }

    public Son(String favouriteDish, String favouriteSportsTeam, String sonSSN) {
        this.favouriteDish = favouriteDish;
        this.favouriteSportsTeam = favouriteSportsTeam;
        this.sonSSN = sonSSN;
    }

    public String getSonAccountNumber() {
        return sonAccountNumber;
    }

    public void setSonAccountNumber(String sonAccountNumber) {
        this.sonAccountNumber = sonAccountNumber;
    }

    public void bodyBuilder(){
        System.out.println("Good Fitted Body");
    }

    public void bookReader(){
        System.out.println("Love to read book");
    }

    public void developer(){
        System.out.println("Love to develop Application");
    }


}

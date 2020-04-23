package oop.inheritance;

public class Father extends GrandFather{

    public String favouriteDish="Beeryanni";
    public String favouriteSportsTeam="NJ Jets";
    public String fatherSSN="84647834";

    private String fatherAccountNumber="994647854";


    public Father() {
    }

    public Father(String favouriteDish) {
        this.favouriteDish = favouriteDish;
    }

    public Father(String favouriteDish, String favouriteSportsTeam) {
        this.favouriteDish = favouriteDish;
        this.favouriteSportsTeam = favouriteSportsTeam;
    }

    public Father(String favouriteDish, String favouriteSportsTeam, String fatherSSN) {
        this.favouriteDish = favouriteDish;
        this.favouriteSportsTeam = favouriteSportsTeam;
        this.fatherSSN = fatherSSN;
    }

    public String getFatherAccountNumber() {
        return fatherAccountNumber;
    }

    public void setFatherAccountNumber(String fatherAccountNumber) {
        this.fatherAccountNumber = fatherAccountNumber;
    }


    public void playCricket(){
        System.out.println("Father can play Cricket");
    }
    public void swim(){
        System.out.println("Father can swim");
    }

    public void educate(){
        System.out.println("Father can educate others");
    }



}

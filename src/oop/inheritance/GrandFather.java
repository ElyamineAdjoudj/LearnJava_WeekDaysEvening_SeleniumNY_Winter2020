package oop.inheritance;

public class GrandFather {

    public String favouriteDish="Steak";
    public String favouriteSportsTeam="NY Jets";
    public String grandFatherSSN="74647834";

    private String grandFatherAccountNumber="894647854";

    public String getGrandFatherAccountNumber() {
        return grandFatherAccountNumber;
    }

    public void setGrandFatherAccountNumber(String grandFatherAccountNumber) {
        this.grandFatherAccountNumber = grandFatherAccountNumber;
    }

    public GrandFather() {
    }

    public GrandFather(String favouriteDish) {
        this.favouriteDish = favouriteDish;
    }

    public GrandFather(String favouriteDish, String favouriteSportsTeam) {
        this.favouriteDish = favouriteDish;
        this.favouriteSportsTeam = favouriteSportsTeam;
    }

    public GrandFather(String favouriteDish, String favouriteSportsTeam, String grandFatherSSN) {
        this.favouriteDish = favouriteDish;
        this.favouriteSportsTeam = favouriteSportsTeam;
        this.grandFatherSSN = grandFatherSSN;
    }


    public void height(){
        System.out.println("Grand Father Height is 6.2");
    }

    public void weight(){
        System.out.println("Grand Father weight is 160");
    }
    public void jump(){
        System.out.println("Grand Father can jump");
    }
    public void playGame(){
        System.out.println("Grand Father can play Football");
    }





}

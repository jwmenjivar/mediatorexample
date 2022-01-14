package com.company;

public class Colleague {

    private Mediator mediator;
    private int colleagueCode;

    public Colleague(Mediator newMediator){
       this.mediator = newMediator;
    }

    public void saleOffer(String stock, int shares){
        mediator.saleOffer(stock, shares, this.colleagueCode);
    }

    public void buyOffer(String stock, int shares){
        mediator.buyOffer(stock, shares, this.colleagueCode);
    }

    public void setCollCode(int collCode){
        this.colleagueCode = collCode;
    }
}

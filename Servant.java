package se.ifmo.lab4;

public class Servant extends Shorties{
    public Servant(String name){
        super(name);
    }
    @Override
    public void live(){
        System.out.println(getName()+" переехал в собственный дом");
    }
    public void ordinary(){
        System.out.println(getName()+" работают на своего господина");
    }
    protected void cleaning(){
        System.out.println(getName()+" убирают в комнатах господина");
    }
    protected void lookAfterHouse(){
        System.out.println(getName()+" смотрят за домом");
    }
    protected void maintenance(){
        System.out.println(getName()+" одевают и раздевают господина");
    }
    @Override
    public String toString(){
        return "Слуги"+getName();
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p instanceof Servant) return getName().equals(((Servant) p).getName());
        return false;
    }
    @Override
    public int hashCode(){
        return getName().hashCode();
    }
}

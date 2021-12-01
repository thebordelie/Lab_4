package se.ifmo.lab4;

public abstract class Amusement implements Explanation {
    String name;
    public Amusement(String name){
        this.name=name;
    }
    protected void joinStory(){
        System.out.println(getName()+" присоединяется к истории");
    }
    protected void workPlace(){}
    protected void workPrinciple(){}
    protected void workFall(){}
    protected String getName(){
        return name;
    }
}

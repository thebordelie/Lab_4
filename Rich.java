package se.ifmo.lab4;

public class Rich extends Shorties.ShortiesPersonality{
    public Rich(String name){
        super(name);
    }
    @Override
    public void ordinary(){
        System.out.println(getName()+" живёт в своё удовольствие как все лунные богачи");
    }
    protected void relax(){
        class RelaxInParaboloid{
            protected  void happines(){System.out.println("Из-за аппетита "+getName()+" любят морской параболоид больше чем водяное колесо ");    }
            protected  void wantEat(){
                System.out.println(getName()+" Много катались , у них разыгрался аппетит ");
                }
            protected void wantEatHappy(){System.out.println(getName()+" Страшно любят покушать ");}
        }
        RelaxInParaboloid relaxInParaboloid=new RelaxInParaboloid();
        relaxInParaboloid.happines();
        relaxInParaboloid.wantEat();
        relaxInParaboloid.wantEatHappy();
    }




    protected void hireServ(){
        System.out.println(getName()+" нанял себе слуг");
    }
    @Override
    public void live(){
        System.out.println(getName()+" переехал в собственный дом");
    }
    protected void newName(){
        System.out.print("Богача больше не называют просто "+ getName());
        setName("Господин "+getName().substring(0,4));
        System.out.println(" Богача теперь называют "+getName());
    }
    @Override
    public String toString(){
        return "Богач "+getName();
    }
    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p instanceof Rich) return getName().equals(((Rich) p).getName());
        return false;
    }
    @Override
    public int hashCode(){
        return getName().hashCode();
    }

}

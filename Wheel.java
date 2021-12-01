package se.ifmo.lab4;

public class Wheel extends Amusement{
    private String name;
    public Wheel(String name, String type){
        super(name);
        WheelTypes wheelTypes=WheelTypes.valueOf(type);
        switch (wheelTypes){
            case USIAL:
                this.name="Обычное "+ name;
                break;
            case WATER:
                this.name="Водяное "+ name;
                break;

        }
        joinStory();
    }
    @Override
    public void annotation(){
        System.out.println("Это колесо");
    }
    public void fastMove(){
        System.out.println(getName()+" начинает вращаться всё быстрей и быстрей");
    }
    @Override
    protected void workPrinciple(){
        System.out.println("Появляется центробежная сила");
    }

    protected String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Колесо  "+getName();
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p instanceof Wheel) return getName().equals(((Wheel) p).getName());
        return false;

    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
}

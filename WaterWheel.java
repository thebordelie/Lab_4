package se.ifmo.lab4;

public class WaterWheel extends Wheel{
    public WaterWheel(String name,String wheelTypes){
        super(name,wheelTypes);

    }
    @Override
    public void annotation(){
        System.out.println(getName()+" устроено так же как и обычное");
    }
    @Override
    protected void workPlace(){
        System.out.println(getName()+" Устанавливается в воду");
    }
    @Override
    protected void workFall(){
        System.out.println(getName()+" Сбрасывает коротышек в воду");
    }
}

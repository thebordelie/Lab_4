package se.ifmo.lab4;

public class UsialWheel extends Wheel{
    public UsialWheel(String name, String wheelTypes){
        super(name,wheelTypes);
    }
    @Override
    public void annotation(){
        System.out.println(getName()+" - это большой деревянный круг, насаженный на торчащую к верху ось");
    }
    @Override
    protected void workPlace(){
        System.out.println(getName()+" Устанавливается на землю");
    }
    @Override
    protected void workFall(){
        System.out.println(getName()+" Сбрасывает коротышек на землю");
    }
}

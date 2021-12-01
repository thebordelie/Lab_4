package se.ifmo.lab4;

public abstract class Shorties implements Status {
    private String name;
    public Shorties(String name){
        this.name=name;
    }
    protected void happy(){}
    public void live() {}
    public static class ShortiesPersonality extends Shorties {
        public ShortiesPersonality(String name) {
            super(name);
        }
        @Override
        public void ordinary() {System.out.println("Многие, вероятно, знают, как работает чертово колесо");}
        protected void allwantsHappy() {System.out.println(getName()+" хочет веселья, он садится в центр чертового колеса");}
        protected void winner() {System.out.println(getName()+" победитель, он продержался дольше всех на колесе");}
        protected void shortiesFalling() {System.out.println(getName()+"  упал");}
        protected void kek() {System.out.println("Все очень долго угарают, всем приятно");}
        public void shortiesParabola(){
            System.out.println(getName()+" описал в воздухе кривую линию, похожую на параболу");
        }
    }
    protected String getName(){
        return name;
    }
    protected void setName(String name){
        this.name=name;
    }
}
